package com.fosents.plugins.vending

import com.fosents.data.VENDING_URL
import com.fosents.routes.vending.setCoinsEndpoints
import com.fosents.routes.vending.setProductsEndpoints
import com.fosents.routes.vending.setVendingRootEndpoint
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configureVendingRouting() {
    setVendingRouting()
}

private fun Application.setVendingRouting() {
    routing {
        route(VENDING_URL) {
            setVendingRootEndpoint()
            setProductsEndpoints()
            setCoinsEndpoints()
        }
    }
}
