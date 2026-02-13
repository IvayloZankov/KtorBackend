package com.fosents

import com.fosents.data.*
import com.fosents.models.ApiResponse
import com.fosents.models.vending.Coin
import com.fosents.models.vending.Product
import com.fosents.repos.VendingRepo
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.json.Json
import org.junit.Test
import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun `access root endpoint`() = testApplication {
        val response = client.get(MAIN_PAGE_URL)
        assertEquals(HttpStatusCode.OK, response.status)
    }

    @Test
    fun `access vending endpoint`() = testApplication {
        val response = client.get(VENDING_URL)
        assertEquals(HttpStatusCode.OK, response.status)
        assertEquals("{\"hello\":\"world\"}", response.bodyAsText())
    }

    @Test
    fun `access get products endpoint`() = testApplication {
        val response = client.get("$VENDING_URL/$VENDING_URL_GET_PRODUCTS")
        assertEquals(HttpStatusCode.OK, response.status)
        val expected = ApiResponse(success = true, message = "ok", data = VendingRepo.products)
        val actual = Json.decodeFromString<ApiResponse<Product>>(response.bodyAsText())
        assertEquals(expected, actual)
    }

    @Test
    fun `access get coins endpoint`() = testApplication {
        val response = client.get("$VENDING_URL/$VENDING_URL_GET_COINS")
        assertEquals(HttpStatusCode.OK, response.status)
        val expected = ApiResponse(success = true, message = "ok", data = VendingRepo.coins)
        val actual = Json.decodeFromString<ApiResponse<Coin>>(response.bodyAsText())
        assertEquals(expected, actual)
    }

    @Test
    fun `access decrease product endpoint`() = testApplication {
        val size = VendingRepo.products.size
        if (size > 0)
            run loop@{
                VendingRepo.products.forEach {
                        product ->
                    if (product.quantity > 0) {
                        val expected = product.quantity.minus(1)
                        val response = client.post("$VENDING_URL/$VENDING_URL_DECREASE_PRODUCT") {
                            header(HttpHeaders.ContentType, ContentType.Application.FormUrlEncoded.toString())
                            setBody(listOf("id" to product.id.toString()).formUrlEncode())
                        }
                        assertEquals(HttpStatusCode.OK, response.status)
                        assertEquals(expected, product.quantity)
                        return@loop
                    }
                }
            }
    }
}