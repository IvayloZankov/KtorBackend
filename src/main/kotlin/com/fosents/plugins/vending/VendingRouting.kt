package com.fosents.plugins.vending

import com.fosents.data.VENDING_URL
import com.fosents.routes.coins
import com.fosents.routes.products
import com.fosents.routes.vendingRoot
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureVendingRouting() {
    setVendingRouting()
}

private fun Application.setVendingRouting() {
    routing {
        route(VENDING_URL) {
            vendingRoot()
            products()
            coins()
        }
    }
}
