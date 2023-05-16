package com.example.mypartyapp

data class FoodData(
    val title: String,
    val logo: Int,
    val desc: String,
    var isExpandable: Boolean = false
)