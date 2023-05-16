package com.example.mypartyapp

data class GradData(
    val title: String,
    val logo: Int,
    val desc: String,
    var isExpandable: Boolean = false
)
