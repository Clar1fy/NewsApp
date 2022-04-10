package com.timplifier.newsapp.data.local.room.db

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.timplifier.newsapp.data.local.room.converters.Converters
import com.timplifier.newsapp.data.local.room.daos.ArticleDao
import com.timplifier.newsapp.data.remote.dtos.ArticleDto

@Database(entities = [ArticleDto::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun articleDao(): ArticleDao
}