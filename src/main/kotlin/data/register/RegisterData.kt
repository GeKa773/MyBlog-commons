package data.register

import kotlinx.serialization.Serializable

@Serializable
data class RegisterRequestRemote(
    val login: String,
    val username: String,
    val email: String,
    val password: String,
)

@Serializable
data class RegisterResponseRemote(
    val login: String,
    val username: String,
    val email: String,
    val token: String
)