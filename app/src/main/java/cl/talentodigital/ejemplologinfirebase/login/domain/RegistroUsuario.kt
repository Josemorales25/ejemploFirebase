package cl.talentodigital.ejemplologinfirebase.login.domain

data class RegistroUsuario (
    val nombre : String,
    val email : String,
    val pass: String,
    val rut: String
)