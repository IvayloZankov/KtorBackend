package com.fosents.plugins.website

import com.fosents.data.MAIN_PAGE_URL
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.routing.*

fun Application.configureWebsiteRouting() {
    setWebSiteRouting()
}

private fun Application.setWebSiteRouting() {
    routing {
        static {
            resources("files")
            resources("svgs")
        }
        get(MAIN_PAGE_URL) {
            call.respondHtml {
                initLandingPage()
            }
        }
    }
}
