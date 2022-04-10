package com.timplifier.newsapp.data.local.room.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.timplifier.newsapp.data.local.room.daos.ArticleDao

@Database(entities = [], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun articleDao(): ArticleDao
}