package com.fosents.routes.vending

import com.fosents.data.*
import com.fosents.repos.VendingRepo
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.setProductsEndpoints() {
    get(VENDING_URL_GET_PRODUCTS) {
        call.respond(
            message = VendingRepo.getProducts(),
            status = HttpStatusCode.OK
        )
    }
    post(VENDING_URL_DECREASE_PRODUCT) {
        val id = call.receiveParameters()["id"].toString()
        call.respond(
            message = VendingRepo.decreaseProductQuantity(id),
            status = HttpStatusCode.OK
        )
    }
    post(VENDING_URL_INCREASE_PRODUCT) {
        val parameters = call.receiveParameters()
        val id = parameters["id"].toString()
        val amount = parameters["amount"].toString()
        call.respond(
            message = VendingRepo.increaseProductQuantity(id, amount),
            status = HttpStatusCode.OK
        )
    }
    get(VENDING_URL_RESET_PRODUCT) {
        call.respond(
            message = VendingRepo.resetProducts(),
            status = HttpStatusCode.OK
        )
    }
}
