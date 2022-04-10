package com.timplifier.newsapp.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class NewsResponse<T>(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResults: Int,
    @SerializedName("articles")
    val articleDtos: ArrayList<T>
)