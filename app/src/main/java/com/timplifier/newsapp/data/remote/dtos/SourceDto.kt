package com.timplifier.newsapp.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class SourceDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String
)