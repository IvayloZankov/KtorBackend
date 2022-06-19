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
        meta {
            attributes["property"] = "og:url"
            content = "https://zankov.dev/"
        }
        meta {
            attributes["property"] = "og:image"
            content = "https://zankov.dev/ktor.png"
        }
        meta {
            attributes["property"] = "og:title"
            content = "Ivaylo Zankov - My ktor website"
        }
        meta {
            attributes["property"] = "og:description"
            content = "My latest projects I'm developing and some info about me."
        }
        link(rel = "stylesheet", href = "/styles.css", type = "text/css")
        link(rel = "icon", href = "/robot.svg")
        title {
            +"Ivaylo Zankov"
        }
        unsafe {
            raw("<!-- Global site tag (gtag.js) - Google Analytics -->\n" +
                    "<script async src=\"https://www.googletagmanager.com/gtag/js?id=G-DFT1RQD413\"></script>\n" +
                    "<script>\n" +
                    "  window.dataLayer = window.dataLayer || [];\n" +
                    "  function gtag(){dataLayer.push(arguments);}\n" +
                    "  gtag('js', new Date());\n" +
                    "\n" +
                    "  gtag('config', 'G-DFT1RQD413');\n" +
                    "</script>\n")
        }
    }
}
