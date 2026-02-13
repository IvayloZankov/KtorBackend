package com.fosents.routes.places

import com.fosents.data.*
import com.fosents.repos.PlacesRepoImpl
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.setPoisEndpoints() {
    get(PLACES_URL_GET_PLACES) {
        call.respond(
            message = PlacesRepoImpl.getPois(),
            status = HttpStatusCode.OK
        )
    }
}
