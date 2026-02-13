package com.fosents.repos

import com.fosents.models.ApiResponse
import com.fosents.models.places.PlaceOfInterest

interface IPlacesRepo {

    val listPois: List<PlaceOfInterest>

    suspend fun getPois(): ApiResponse<PlaceOfInterest>
}
