package com.fosents.plugins.vending

import com.fosents.data.PLACES_URL
import com.fosents.routes.places.setImageEndpoints
import com.fosents.routes.places.setPoisEndpoints
import com.fosents.routes.places.setPoisRootEndpoint
import io.ktor.server.application.*
import io.ktor.server.routing.*

fun Application.configurePoisRouting() {
    setPlacesRouting()
}

private fun Application.setPlacesRouting() {
    routing {
        route(PLACES_URL) {
            setPoisRootEndpoint()
            setPoisEndpoints()
            setImageEndpoints()
        }
    }
}
