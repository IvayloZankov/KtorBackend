package com.fosents.repos

import com.fosents.data.IMAGE_BIG_BEN
import com.fosents.data.IMAGE_CHRIST_THE_REDEEMER
import com.fosents.data.IMAGE_COLLOSEUM
import com.fosents.data.IMAGE_EIFFEL_TOWER
import com.fosents.data.IMAGE_GREAT_WALL
import com.fosents.data.IMAGE_MACHU_PICCHU
import com.fosents.data.IMAGE_MAIN
import com.fosents.data.IMAGE_SAGRADA_FAMILIA
import com.fosents.data.IMAGE_STATUE_OF_LIBERTY
import com.fosents.data.IMAGE_SYDNEY_OPERA_HOUSE
import com.fosents.data.IMAGE_TAJ_MAHAL
import com.fosents.data.IMAGE_URL
import com.fosents.data.PLACES_URL
import com.fosents.models.places.PlaceOfInterest
import com.fosents.models.vending.Coin
import com.fosents.models.vending.Product

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


fun getListPlaces() = listOf(
    PlaceOfInterest(
        id = 0,
        name = "Eiffel Tower",
        loc = listOf(48.8584, 2.2945),
        category = "landmark",
        rating = 4.3,
        url = "https://en.wikipedia.org/wiki/Eiffel_Tower",
        image = "${IMAGE_MAIN}${PLACES_URL}${IMAGE_URL}${IMAGE_EIFFEL_TOWER}",
    ),
    PlaceOfInterest(
        id = 1,
        name = "Statue of Liberty",
        loc = listOf(40.6892, -74.0445),
        category = "landmark",
        rating = 4.7,
        url = "https://en.wikipedia.org/wiki/Statue_of_Liberty",
        image = "${IMAGE_MAIN}${PLACES_URL}${IMAGE_URL}${IMAGE_STATUE_OF_LIBERTY}",
    ),
    PlaceOfInterest(
        id = 2,
        name = "Great Wall of China",
        loc = listOf(40.4319, 116.5704),
        category = "historic",
        rating = 4.6,
        url = "https://en.wikipedia.org/wiki/Great_Wall_of_China",
        image = "${IMAGE_MAIN}${PLACES_URL}${IMAGE_URL}${IMAGE_GREAT_WALL}",
    ),
    PlaceOfInterest(
        id = 3,
        name = "Colosseum",
        loc = listOf(41.8902, 12.4922),
        category = "historic",
        rating = 4.6,
        url = "https://en.wikipedia.org/wiki/Colosseum",
        image = "${IMAGE_MAIN}${PLACES_URL}${IMAGE_URL}${IMAGE_COLLOSEUM}",
    ),
    PlaceOfInterest(
        id = 4,
        name = "Taj Mahal",
        loc = listOf(27.1751, 78.0421),
        category = "historic",
        rating = 4.2,
        url = "https://en.wikipedia.org/wiki/Taj_Mahal",
        image = "${IMAGE_MAIN}${PLACES_URL}${IMAGE_URL}${IMAGE_TAJ_MAHAL}",
    ),
    PlaceOfInterest(
        id = 5,
        name = "Machu Picchu",
        loc = listOf(-13.1631, -72.5450),
        category = "historic",
        rating = 4.9,
        url = "https://en.wikipedia.org/wiki/Machu_Picchu",
        image = "${IMAGE_MAIN}${PLACES_URL}${IMAGE_URL}${IMAGE_MACHU_PICCHU}",
    ),
    PlaceOfInterest(
        id = 6,
        name = "Big Ben",
        loc = listOf(51.5007, -0.1246),
        category = "landmark",
        rating = 2.8,
        url = "https://en.wikipedia.org/wiki/Big_Ben",
        image = "${IMAGE_MAIN}${PLACES_URL}${IMAGE_URL}${IMAGE_BIG_BEN}",
    ),
    PlaceOfInterest(
        id = 7,
        name = "Sydney Opera House",
        loc = listOf(-33.8568, 151.2153),
        category = "culture",
        rating = 3.8,
        url = "https://en.wikipedia.org/wiki/Sydney_Opera_House",
        image = "${IMAGE_MAIN}${PLACES_URL}${IMAGE_URL}${IMAGE_SYDNEY_OPERA_HOUSE}",
    ),
    PlaceOfInterest(
        id = 8,
        name = "Christ the Redeemer",
        loc = listOf(-22.9519, -43.2105),
        category = "landmark",
        rating = 4.2,
        url = "https://en.wikipedia.org/wiki/Christ_the_Redeemer_(statue)",
        image = "${IMAGE_MAIN}${PLACES_URL}${IMAGE_URL}${IMAGE_CHRIST_THE_REDEEMER}",
    ),
    PlaceOfInterest(
        id = 9,
        name = "Sagrada Familia",
        loc = listOf(41.4036, 2.1744),
        category = "culture",
        rating = 2.7,
        url = "https://en.wikipedia.org/wiki/Sagrada_Fam%C3%ADlia",
        image = "${IMAGE_MAIN}${PLACES_URL}${IMAGE_URL}${IMAGE_SAGRADA_FAMILIA}",
    )
)
