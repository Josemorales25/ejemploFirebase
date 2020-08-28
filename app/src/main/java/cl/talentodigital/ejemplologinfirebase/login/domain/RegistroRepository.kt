package cl.talentodigital.ejemplologinfirebase.login.domain

interface RegistroRepository {
    suspend fun registroUsuario(registroUsuario: RegistroUsuario): Boolean
}