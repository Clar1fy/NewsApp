package com.timplifier.newsapp.data.local.room.converters

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.timplifier.newsapp.data.remote.dtos.Article
import com.timplifier.newsapp.data.remote.dtos.Source

class Converters {

    @TypeConverter
    fun sourceToJson(value: Source?): String? = Gson().toJson(value)

    @TypeConverter
    fun jsonToSource(value: String): Source = Gson().fromJson(value, Source::class.java)

    @TypeConverter
    fun listToJson(value: List<Article>) = Gson().toJson(value)

    @TypeConverter
    fun jsonToList(value: String) = Gson().fromJson(value, Array<Article>::class.java).toList()
}