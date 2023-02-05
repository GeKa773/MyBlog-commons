package data.blog

import data.user.UserData

data class BlogRequestRemote(
    val title: String,
    val body: String?,
    val image: String?,
)

data class BlogResponseRemote(
    val id: Int,
    val user: UserData,
    val title: String,
    val body: String?,
    val image: String?,
    val likes: Int,
)