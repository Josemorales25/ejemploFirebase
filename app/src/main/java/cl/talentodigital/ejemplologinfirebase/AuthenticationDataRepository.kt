package cl.talentodigital.ejemplologinfirebase

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseAuthException
import com.google.firebase.auth.FirebaseUser
import kotlinx.coroutines.tasks.await

class AuthenticationDataRepository constructor(
        private val firebaseAuth: FirebaseAuth
    ) {

    suspend fun authenticate(
        email: String,
        password: String
    ): FirebaseUser? {
        firebaseAuth.signInWithEmailAndPassword(
            email, password
        ).await()
        return firebaseAuth.currentUser ?: throw FirebaseAuthException("", "")

        firebaseAuth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                // handle result using callback
            }

    }
}