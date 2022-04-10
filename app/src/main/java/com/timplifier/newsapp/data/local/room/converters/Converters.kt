package com.timplifier.newsapp.data.local.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.timplifier.newsapp.data.remote.dtos.ArticleDto
import com.timplifier.newsapp.data.remote.dtos.SourceDto

class Converters {

    @TypeConverter
    fun sourceToJson(value: SourceDto?): String? = Gson().toJson(value)

    @TypeConverter
    fun jsonToSource(value: String): SourceDto = Gson().fromJson(value, SourceDto::class.java)

    @TypeConverter
    fun listToJson(value: List<ArticleDto>) = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String) = Gson().fromJson(value, Array<ArticleDto>::class.java).toList()
}