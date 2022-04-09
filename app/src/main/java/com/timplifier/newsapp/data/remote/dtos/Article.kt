package com.timplifier.newsapp.data.remote.dtos

import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("name")
    val name: String?,
    @SerializedName("description")
    val description: String?,
    @SerializedName("urlToImage")
    val urlToImage: String?
)
