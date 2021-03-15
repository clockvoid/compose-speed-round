package com.example.androiddevchallenge.model

import android.net.Uri

data class Garden(
    val imageUrl: Uri,
    val name: String,
    val description: String = "This is a description"
)