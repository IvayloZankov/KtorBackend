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
        script{
            unsafe {
                raw("(function(w,d,s,l,i){w[l]=w[l]||[];w[l].push({'gtm.start':\n" +
                        "new Date().getTime(),event:'gtm.js'});var f=d.getElementsByTagName(s)[0],\n" +
                        "j=d.createElement(s),dl=l!='dataLayer'?'&l='+l:'';j.async=true;j.src=\n" +
                        "'https://www.googletagmanager.com/gtm.js?id='+i+dl;f.parentNode.insertBefore(j,f);\n" +
                        "})(window,document,'script','dataLayer','GTM-NBGBD8J');")
            }
        }
    }
}
