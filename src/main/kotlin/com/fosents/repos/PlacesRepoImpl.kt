package com.fosents.repos

import com.fosents.models.ApiResponse
import com.fosents.models.places.PlaceOfInterest

object PlacesRepoImpl: IPlacesRepo {

    override val listPois = getListPlaces()

    override suspend fun getPois(): ApiResponse<PlaceOfInterest> {
        return ApiResponse(
            success = true,
            message = "ok",
            data = listPois
        )
    }
}
