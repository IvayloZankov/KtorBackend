package com.fosents.models.vending

import kotlinx.serialization.Serializable

@Serializable
data class Product(
    val id: Int,
    var name: String,
    var price: Double,
    var quantity: Int
)
