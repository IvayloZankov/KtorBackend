package com.fosents.routes

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.vendingRoot() {
    get {
        call.respond(
            message = mapOf("hello" to "world"),
            status = HttpStatusCode.OK
        )
    }
}
