package com.fosents.repos

import com.fosents.models.Coin
import com.fosents.models.Product

fun initDefaultProducts(): MutableList<Product> {
    return mutableListOf(
        Product(
            id = 0,
            name = "Water",
            price = 0.60,
            quantity = 2
        ),
        Product(
            id = 1,
            name = "Coke",
            price = 1.10,
            quantity = 3
        ),
        Product(
            id = 2,
            name = "Croissant",
            price = 0.70,
            quantity = 4
        ),
        Product(
            id = 3,
            name = "Mars",
            price = 0.50,
            quantity = 5
        ),
        Product(
            id = 4,
            name = "Snickers",
            price = 0.60,
            quantity = 7
        ),
        Product(
            id = 5,
            name = "Juice",
            price = 0.90,
            quantity = 10
        ),
        Product(
            id = 6,
            name = "Crackers",
            price = 0.40,
            quantity = 20
        ),
        Product(
            id = 7,
            name = "Beans",
            price = 1.20,
            quantity = 10
        ),
        Product(
            id = 8,
            name = "Milk",
            price = 0.80,
            quantity = 7
        ),
        Product(
            id = 9,
            name = "Candy",
            price = 0.20,
            quantity = 30
        ),
        Product(
            id = 10,
            name = "Sun Chips",
            price = 1.20,
            quantity = 15
        ),
        Product(
            id = 11,
            name = "Biscuits",
            price = 0.70,
            quantity = 10
        ),
        Product(
            id = 12,
            name = "Bracelet",
            price = 9.70,
            quantity = 1
        ),
        Product(
            id = 13,
            name = "Ring",
            price = 4.90,
            quantity = 3
        ),
    )
}

fun initDefaultCoins(): MutableList<Coin> {
    return mutableListOf(
        Coin(
            id = 0,
            name = "five_cents",
            price = 0.05,
            quantity = 60
        ),
        Coin(
            id = 1,
            name = "ten_cents",
            price = 0.10,
            quantity = 20
        ),
        Coin(
            id = 2,
            name = "twenty_cents",
            price = 0.20,
            quantity = 10
        ),
        Coin(
            id = 3,
            name = "fifty_cents",
            price = 0.50,
            quantity = 10
        ),
        Coin(
            id = 4,
            name = "one_eur",
            price = 1.00,
            quantity = 0
        ),
        Coin(
            id = 5,
            name = "two_eur",
            price = 2.00,
            quantity = 0
        ),
    )
}
