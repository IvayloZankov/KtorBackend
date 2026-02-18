# Ktor Backend Project

Ktor-based backend application that provides RESTful APIs for mobile applications and serves a simple personal website.

## Features

*   **Vending Machine API:** A set of endpoints to manage products and coins in a virtual vending machine.
*   **Places of Interest API:** A set of endpoints to retrieve information about places of interest.
*   **Personal Website:** A simple, server-side rendered portfolio website.

## Tech Stack & Libraries

*   **Kotlin**: The primary programming language.
*   **Ktor**: Asynchronous framework for creating connected systems.
*   **Gradle**: Build automation tool.
*   **Kotlinx Serialization**: For efficient JSON serialization/deserialization.
*   **Ktor HTML DSL**: For building server-side rendered HTML pages for the website.
*   **Netty**: The embedded server engine for Ktor.

## API Endpoints

The following is a summary of the available API endpoints:

### Vending Machine

*   `GET /vending/products`: Get a list of all products.
*   `POST /vending/products/decrease`: Decrease product quantity by ID.
*   `POST /vending/products/increase`: Increase product quantity by ID and amount.
*   `GET /vending/products/reset`: Reset products to default state.
*   `GET /vending/coins`: Get a list of all coins.
*   `POST /vending/coins/update`: Update the quantities of coins.
*   `GET /vending/coins/reset`: Reset coins to default state.

### Places of Interest

*   `GET /pois`: Welcome message for the Places API.
*   `GET /pois/all`: Get a list of all places of interest.
*   `GET /images/{filename}`: Get an image resource by filename.

## Getting Started

To run the application, you can use the following command from the root of the project:

```bash
./gradlew run
```

The application will start on `http://localhost:8080`.
