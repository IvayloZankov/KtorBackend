package com.fosents.routes.vending

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.setVendingRootEndpoint() {
    get {
        call.respond(
            message = "Welcome to the Vending API!",
            status = HttpStatusCode.OK
        )
    }
}
