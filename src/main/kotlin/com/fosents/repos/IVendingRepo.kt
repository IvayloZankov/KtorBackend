package com.fosents.repos

import com.fosents.models.ApiResponse
import com.fosents.models.Coin
import com.fosents.models.Product

interface IVendingRepo {

    val products: List<Product>
    val coins: List<Coin>

    suspend fun getProducts(): ApiResponse<Product>
    suspend fun decreaseProductQuantity(id: String?): ApiResponse<Product>
    suspend fun increaseProductQuantity(id: String?, amount: String?): ApiResponse<Product>
    suspend fun removeProduct(id: String?): ApiResponse<Product>
    suspend fun addProduct(name: String, price: Double, quantity: Int): ApiResponse<Product>
    suspend fun resetProducts(): ApiResponse<Product>

    suspend fun getCoins(): ApiResponse<Coin>
    suspend fun updateCoinsQuantity(list: List<Coin>): ApiResponse<Coin>
    suspend fun resetCoins(): ApiResponse<Coin>
}
