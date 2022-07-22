package com.fosents.plugins.website

import kotlinx.html.*
import java.time.LocalDateTime

fun HTML.setFooter() {
    body {
        footer {
            div(classes = "footer") {
                id = "footer"
                div("row main") {
                    div("column left") {
                        h1(classes = "footer name") {
                            +"Ivaylo Zankov"
                        }
                    }
                    div("column left") {
                        h4("accent") {
                            +"links"
                        }
                        ul("footer") {
                            setLink("Linkedin", "https://www.linkedin.com/in/ivaylozankov/")
                            setLink("GitHub", "https://github.com/IvayloZankov")
                            setLink("CodeWars", "https://www.codewars.com/users/Fosents")
                            setLink("Facebook", "https://www.facebook.com/zankov")
                        }
                    }
                }
                p(classes = "footer copy") {
                    +"Copyright © ${LocalDateTime.now().year} Ivaylo Zankov - All Rights Reserved."
                }
            }
        }
    }
}

private fun UL.setLink(name: String, href: String) {
    li("footer") {
        a(classes = "footer", href = href, target="_blank") {
            +name
        }
    }
}
