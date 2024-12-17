package ru.netology.nmedia.dto

import ru.netology.nmedia.entity.PostEntity

data class Post(
    val id: Long,
    val author: String,
    val authorAvatar: String,
    val content: String,
    val published: String,
    val likedByMe: Boolean,
    val likes: Int = 0,
) {

    fun toEntity(): PostEntity {
        return PostEntity(
            id = id,
            author = author,
            authorAvatar = authorAvatar,
            content = content,
            published = published,
            likedByMe = likedByMe,
            likes = likes
        )
    }
}

fun List<Post>.toEntity(): List<PostEntity> {
    return map { it.toEntity() }
}