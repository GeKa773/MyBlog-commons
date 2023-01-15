package data.login

import kotlinx.serialization.Serializable

@Serializable
data class LoginRequestRemote(
    val login: String,
    val password: String
)

@Serializable
data class LoginResponseRemote(
    val token: String
)
