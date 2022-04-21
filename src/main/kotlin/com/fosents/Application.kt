package com.fosents

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.body
import kotlinx.html.head
import kotlinx.html.title

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
                    +"Hi There! Welcome to my site. Its under construction."
                }
            }
        }
    }
}