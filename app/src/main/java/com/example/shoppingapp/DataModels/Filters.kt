package com.example.shoppingapp.DataModels

open class Filters {
    enum class Category(val categoryName: String, var selected: Boolean) {
        SALE("sale",false),
        BOTTOM("bottom",false),
        SUMMER("summer",false),
    }
}