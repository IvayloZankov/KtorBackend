package com.fosents.models.places

import kotlinx.serialization.Serializable

@Serializable
data class PlaceOfInterest(
    val id: Int = 0,
    val loc: List<Double> = listOf(),
    val name: String = "",
    val category: String = "",
    val rating: Double = 0.0,
    val url: String = "",
    val image: String = "",
)
