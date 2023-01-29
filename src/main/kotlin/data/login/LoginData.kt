package data.login

import kotlinx.serialization.Serializable

@Serializable
data class LoginRequestRemote(
    val login: String,
    val password: String
)

@Serializable
data class LoginResponseRemote(
    val login: String,
    val username: String,
    val email: String,
    val token: String
)
