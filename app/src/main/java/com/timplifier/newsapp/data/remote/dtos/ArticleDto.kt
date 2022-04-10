package com.timplifier.newsapp.data.remote.dtos


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.timplifier.newsapp.base.BaseDiffModel

@Entity
data class ArticleDto(
    @PrimaryKey(autoGenerate = true)
    val id: Int?,
    @SerializedName("sourceDto")
    val sourceDto: SourceDto,
    @SerializedName("author")
    val author: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("url")
    override val url: String,
    @SerializedName("urlToImage")
    val urlToImage: String,
    @SerializedName("publishedAt")
    val publishedAt: String,
    @SerializedName("content")
    val content: String
) : BaseDiffModel

