package com.fosents

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.css.*
import kotlinx.css.properties.TextDecoration

fun Application.configureTemplating() {
    routing {
        initStyle()
    }
}

fun Route.initStyle() {
    get("/styles.css") {
        call.respondCss {
            body {
                backgroundColor = Color.whiteSmoke
                color = Color.grey
                fontFamily = "sans-serif"
                textAlign = TextAlign.center
                maxWidth = 1080.px
//                border = "2px solid red"
                margin(horizontal = LinearDimension.auto)
            }
            rule("a.clickable") {
                color = Color.grey
                marginLeft = 6.px
                fontWeight = FontWeight.bold
                textDecoration = TextDecoration.none
            }
            rule("a.clickable:hover") {
                color = Color.orange
                marginLeft = 6.px
                fontWeight = FontWeight.bold
                textDecoration = TextDecoration.none
            }
        }
    }
}

suspend inline fun ApplicationCall.respondCss(builder: CssBuilder.() -> Unit) {
    this.respondText(CssBuilder().apply(builder).toString(), ContentType.Text.CSS)
}