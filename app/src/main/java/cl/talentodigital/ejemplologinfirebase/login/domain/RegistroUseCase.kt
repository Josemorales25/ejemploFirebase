package cl.talentodigital.ejemplologinfirebase.login.domain

class RegistroUseCase (
    private val registroRepository: RegistroRepository
    ) {
        suspend fun execute(registroUsuario: RegistroUsuario): Boolean {
            return registroRepository.registroUsuario(registroUsuario)
        }
    }