package com.fosents

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.css.*
import kotlinx.html.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    routing {
        static {
            resources("files")
        }
        get("/") {
            call.respondHtml {
                head {
                    title {
                        + "Welcome!"
                    }
                }
                body {
                    style = "text-align: center; font-family: sans-serif"
                    img {
                        src = "in_dev.png"
                    }
                    h1 {
                        +"Under development."

                    }
                    p {
                        +"Hi there. Welcome to my site. It's still under development."
                    }
                }
            }
        }
        get("/styles.css") {
            call.respondCss {
                body {
                    backgroundColor = Color.darkBlue
                    margin(0.px)
                }
                rule("body.page-style") {
                    color = Color.black
                }
            }
        }
    }
}

suspend inline fun ApplicationCall.respondCss(builder: CssBuilder.() -> Unit) {
    this.respondText(CssBuilder().apply(builder).toString(), ContentType.Text.CSS)
}