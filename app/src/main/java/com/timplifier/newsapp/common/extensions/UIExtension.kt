package com.timplifier.newsapp.common.extensions

import android.widget.ImageView
import com.bumptech.glide.Glide


fun ImageView.requestImage(url: String) {
    Glide.with(this).load(url).into(this)
}