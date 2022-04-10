package com.timplifier.newsapp.di

import android.content.Context
import com.timplifier.newsapp.data.local.room.RoomClient
import com.timplifier.newsapp.data.local.room.db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {


    @Singleton
    private val roomClient = RoomClient()

    @Singleton
    @Provides
    fun provideRoomDatabase(@ApplicationContext context: Context) =
        roomClient.provideAppDatabase(context)

    @Singleton
    @Provides
    fun provideArticleDao(appDatabase: AppDatabase) = roomClient.provideArticleDao(appDatabase)
}