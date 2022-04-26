package com.fosents

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import kotlinx.css.*
import kotlinx.css.properties.TextDecoration
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
                    link(rel = "stylesheet", href = "/styles.css", type = "text/css")
                    title {
                        + "Welcome!"
                    }
                }
                body {
//                    style =
//                        "text-align: center; " +
//                            "font-family: sans-serif; " +
//                            "color:grey; " +
//                            "max-width: 1080px;" +
//                            "border: 1px solid red;"
                    div {
                        style = "font-size:150%;"
                        img {
                            src = "development.png"
                        }
                        h1 {
                            style = "font-family: courier new; color:orange;"
                            +"Under development."
                        }
                        p {
                            style = "color:grey;"
                            +"Hi there. Welcome to my site. It's still under development."
                        }
                    }
//                    footer {
//                        div {
//                            p("footercv") {
//                                style = "text-align: right; margin: 0 32px 32px"
//                                img {
////                                    src = "footericon1.png"
//                                }
//                                a(classes = "clickable", href = "ivailoresume.pdf") {
//                                    +"Download CV"
//                                }
//                                img {
//                                    src = "footericon1.png"
//                                    style = "color:grey; " +
//                                            "margin-left:32px; "
//                                }
//                                a(classes = "clickable", href = "mailto:ivaylo@zankov.dev") {
//                                    style = "text-transform: lowercase; "
//                                    +"ivaylo@zankov.dev"
//                                }
//                            }
//                        }
//                    }
                }
            }
        }
        get("/html-dsl") {
            call.respondHtml {
                head {
                    link(rel = "stylesheet", href = "/styles.css", type = "text/css")
                }
                body {
                    h1(classes = "page-title") {
                        +"Hello from Ktor!"
                    }
                }
            }
        }
        get("/styles.css") {
            call.respondCss {
                body {
                    backgroundColor = Color.whiteSmoke
                    color = Color.grey
                    fontFamily = "sans-serif"
                    textAlign = TextAlign.center
                    maxWidth = 1080.px
//                    border = "1px solid red"
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
}

suspend inline fun ApplicationCall.respondCss(builder: CssBuilder.() -> Unit) {
    this.respondText(CssBuilder().apply(builder).toString(), ContentType.Text.CSS)
}