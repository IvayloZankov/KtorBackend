package com.fosents

import com.fosents.plugins.vending.configureSerialization
import com.fosents.plugins.vending.configureVendingRouting
import com.fosents.plugins.website.configureStatusPages
import com.fosents.plugins.website.configureTemplating
import com.fosents.plugins.website.configureWebsiteRouting
import io.ktor.server.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    configureTemplating()
    configureWebsiteRouting()
    configureSerialization()
    configureVendingRouting()
    configureStatusPages()
}