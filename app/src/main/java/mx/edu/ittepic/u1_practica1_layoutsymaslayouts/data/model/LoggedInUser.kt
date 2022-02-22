package mx.edu.ittepic.u1_practica1_layoutsymaslayouts.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    val userId: String,
    val displayName: String
)