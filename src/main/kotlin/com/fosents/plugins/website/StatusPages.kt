package com.fosents.plugins.website

import com.fosents.data.MAIN_PAGE_URL
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.response.*

fun Application.configureStatusPages() {
    install(StatusPages) {
        status(HttpStatusCode.NotFound) { call, _ ->
            call.respondRedirect(MAIN_PAGE_URL)
        }
    }
}
