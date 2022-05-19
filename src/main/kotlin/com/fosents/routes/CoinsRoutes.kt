package com.fosents.routes

import com.fosents.data.VENDING_URL_GET_COINS
import com.fosents.data.VENDING_URL_RESET_COINS
import com.fosents.data.VENDING_URL_UPDATE_COINS
import com.fosents.models.Coin
import com.fosents.repos.VendingRepo
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.request.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.coins() {
    get(VENDING_URL_GET_COINS) {
        call.respond(
            message = VendingRepo.getCoins(),
            status = HttpStatusCode.OK
        )
    }
    post(VENDING_URL_UPDATE_COINS) {
        val list = call.receive<List<Coin>>()
        call.respond(
            message = VendingRepo.updateCoinsQuantity(list),
            status = HttpStatusCode.OK
        )
    }
    get(VENDING_URL_RESET_COINS) {
        call.respond(
            message = VendingRepo.resetCoins(),
            status = HttpStatusCode.OK
        )
    }
}
