package data.user

import kotlinx.serialization.Serializable

@Serializable
data class UserData(
    val id: Int,
    val login: String,
    val email: String,
    val icon: String?,
    val token: String,
)
