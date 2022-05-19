package com.fosents.plugins.website

import kotlinx.html.*

fun HTML.setMenu() {
    body {
        ul(classes = "menu") {
            setMenuItem("home", "#top")
            setMenuItem("about me", "#about_me")
            setMenuItem("projects", "#projects")
        }
    }
}

private fun UL.setMenuItem(name: String, href: String) {
    li("menu") {
        a(classes = "menu", href = href) {
            +name
        }
    }
}
