package com.fosents.models.vending

import kotlinx.serialization.Serializable

@Serializable
data class Coin(
    val id: Int,
    val name: String,
    val price: Double,
    val quantity: Int
)
