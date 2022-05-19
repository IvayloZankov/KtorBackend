package com.fosents.repos

import com.fosents.models.ApiResponse
import com.fosents.models.Coin
import com.fosents.models.Product

object VendingRepo: IVendingRepo {

    override val products = initDefaultProducts()
    override val coins = initDefaultCoins()

    override suspend fun getProducts(): ApiResponse<Product> {
        return ApiResponse(
            success = true,
            message = "ok",
            data = products
        )
    }

    override suspend fun decreaseProductQuantity(id: String?): ApiResponse<Product> {
        return try {
            val intId = id?.toInt()
            products[intId!!].quantity--
            ApiResponse(
                success = true,
                message = "ok",
                data = products
            )
        } catch (e: NullPointerException) {
            ApiResponse(
                success = false,
                message = "Product ID not provided!",
                data = emptyList()
            )
        } catch (e: ArrayIndexOutOfBoundsException) {
            ApiResponse(
                success = false,
                message = "Product ID do not exist!",
                data = emptyList()
            )
        } catch (e: NumberFormatException) {
            ApiResponse(
                success = false,
                message = "Not a valid product ID!",
                data = emptyList()
            )
        }
    }

    override suspend fun increaseProductQuantity(id: String?, amount: String?): ApiResponse<Product> {
        return try {
            val intId = id?.toInt()
            val intAmount = amount?.toInt()
            products[intId!!].quantity=products[intId].quantity.plus(intAmount!!)
            ApiResponse(
                success = true,
                message = "ok",
                data = products
            )
        } catch (e: NullPointerException) {
            ApiResponse(
                success = false,
                message = "Product ID not provided!",
                data = emptyList()
            )
        } catch (e: ArrayIndexOutOfBoundsException) {
            ApiResponse(
                success = false,
                message = "Product ID do not exist!",
                data = emptyList()
            )
        } catch (e: NumberFormatException) {
            ApiResponse(
                success = false,
                message = "Invalid params!",
                data = emptyList()
            )
        }
    }

    override suspend fun removeProduct(id: String?): ApiResponse<Product> {
        TODO("Not yet implemented")
    }

    override suspend fun addProduct(name: String, price: Double, quantity: Int): ApiResponse<Product> {
        TODO("Not yet implemented")
    }

    override suspend fun resetProducts(): ApiResponse<Product> {
        products.clear()
        products.addAll(initDefaultProducts())
        return ApiResponse(
            success = true,
            message = "ok",
            data = products
        )
    }

    override suspend fun getCoins(): ApiResponse<Coin> {
        return ApiResponse(
            success = true,
            message = "ok",
            data = coins
        )
    }

    override suspend fun updateCoinsQuantity(list: List<Coin>): ApiResponse<Coin> {
        return try {
            coins.clear()
            coins.addAll(list)
            return ApiResponse(
                success = true,
                message = "ok",
                data = coins
            )
        } catch (e: NullPointerException) {
            ApiResponse(
                success = false,
                message = "Product ID not provided!",
                data = emptyList()
            )
        }
    }

    override suspend fun resetCoins(): ApiResponse<Coin> {
        coins.clear()
        coins.addAll(initDefaultCoins())
        return ApiResponse(
            success = true,
            message = "ok",
            data = coins
        )
    }
}
