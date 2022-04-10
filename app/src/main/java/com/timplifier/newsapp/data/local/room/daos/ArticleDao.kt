package com.timplifier.newsapp.data.local.room.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.timplifier.newsapp.data.remote.dtos.ArticleDto

@Dao
interface ArticleDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertArticles(vararg articles: ArticleDto)


    @Query("SELECT * FROM ArticleDto")
    suspend fun getArticles(): List<ArticleDto>


}