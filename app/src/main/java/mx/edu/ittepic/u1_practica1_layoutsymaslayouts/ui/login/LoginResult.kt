package mx.edu.ittepic.u1_practica1_layoutsymaslayouts.ui.login

/**
 * Authentication result : success (user details) or error message.
 */
data class LoginResult (
     val success:LoggedInUserView? = null,
     val error:Int? = null
)