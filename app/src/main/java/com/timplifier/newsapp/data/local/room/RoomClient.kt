package com.timplifier.newsapp.data.local.room

import android.content.Context
import androidx.room.Room
import com.timplifier.newsapp.data.local.room.daos.ArticleDao
import com.timplifier.newsapp.data.local.room.db.AppDatabase

class RoomClient {

    fun provideAppDatabase(context: Context) =
        Room.databaseBuilder(context, AppDatabase::class.java, "database")
            .fallbackToDestructiveMigration().allowMainThreadQueries().build()

    fun provideArticleDao(appDatabase: AppDatabase): ArticleDao = appDatabase.articleDao()
}