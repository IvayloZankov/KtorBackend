package com.fosents

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    routing {
        get {
            call.respondHtml {
                head {
                    title {
                        + "Welcome!"
                    }
                }
                body {
                    style {
                        +"text-align: center; font-family: sans-serif"
                    }
                    h1 {
                        +"Hi There!"
                    }
                    p {
                        +"Welcome to my site."
                    }
                    p {
                        +" Its under construction."
                    }
                }
            }
        }
    }
}