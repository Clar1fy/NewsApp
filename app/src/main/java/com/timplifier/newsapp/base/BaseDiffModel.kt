package com.timplifier.newsapp.base

interface BaseDiffModel {
    val url: String
    override fun equals(other: Any?): Boolean
}