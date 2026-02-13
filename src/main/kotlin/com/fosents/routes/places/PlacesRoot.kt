package com.fosents.routes.places

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.setPoisRootEndpoint() {
    get {
        call.respond(
            message = "Welcome to the Places API!",
            status = HttpStatusCode.OK
        )
    }
}
