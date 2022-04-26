package com.fosents

import kotlinx.html.*

fun HTML.initLandingPage() {
    head {
        link(rel = "stylesheet", href = "/styles.css", type = "text/css")
        title {
            + "Welcome!"
        }
    }
    body {
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
//        footer {
//            p("footercv") {
//                style = "text-align: right; margin: 0 32px 32px"
//                img {
////                                    src = "footericon1.png"
//                }
//                a(classes = "clickable", href = "ivailoresume.pdf") {
//                    +"Download CV"
//                }
//                img {
//                    src = "footericon1.png"
//                    style = "color:grey; " +
//                            "margin-left:32px; "
//                }
//                a(classes = "clickable", href = "mailto:ivaylo@zankov.dev") {
//                    style = "text-transform: lowercase; "
//                    +"ivaylo@zankov.dev"
//                }
//            }
//        }
    }
}