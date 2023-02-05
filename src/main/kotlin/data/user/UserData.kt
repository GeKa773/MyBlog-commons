package data.user

import kotlinx.serialization.Serializable

@Serializable
data class UserData(
    val login: String,
    val username: String,
    val email: String,
    val icon: String?,
)
