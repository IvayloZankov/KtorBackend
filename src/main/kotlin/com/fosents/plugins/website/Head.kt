package com.fosents.plugins.website

import kotlinx.html.*

fun HTML.setHead() {
    head {
        meta {
            name = "viewport"
            content = "width=device-width, initial-scale=0.6"
        }
        meta {
            name = "color-scheme"
            content = "light only"
        }
        link(rel = "stylesheet", href = "/styles.css", type = "text/css")
        title {
            +"zankov.dev"
        }
    }
}
