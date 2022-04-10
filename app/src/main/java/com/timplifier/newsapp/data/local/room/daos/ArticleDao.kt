package com.timplifier.newsapp.data.local.room.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.timplifier.newsapp.data.remote.dtos.Article

@Dao
interface ArticleDao {


    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharacters(vararg: Article)


    @Query("SELECT * FROM article")
    suspend fun getArticles(): List<Article>

}