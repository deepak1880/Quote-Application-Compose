package com.example.firstcomposeproject.modal

import com.google.gson.annotations.SerializedName

data class Quote(
    @SerializedName("title")
    val text: String,
    @SerializedName("author")
    val author: String)
