package com.fosents.routes.places

import com.fosents.data.*
import com.fosents.repos.PlacesRepoImpl
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Route.setImageEndpoints() {
    get("${IMAGE_URL}/{filename}") {
        val fileName = call.parameters["fileName"]
            ?: return@get call.respondText("Missing fileName", status = HttpStatusCode.BadRequest)

        val resourcePath = "files/$fileName"
        val bytes = this::class.java.classLoader.getResourceAsStream(resourcePath)?.use { it.readBytes() }
            ?: return@get call.respondText("Image not found", status = HttpStatusCode.NotFound)

        val contentType = when (fileName.substringAfterLast('.', "").lowercase()) {
            "jpg", "jpeg" -> ContentType.Image.JPEG
            "png" -> ContentType.Image.PNG
            "svg" -> ContentType.Image.SVG
            else -> ContentType.Application.OctetStream
        }

        call.respondBytes(bytes = bytes, contentType = contentType, status = HttpStatusCode.OK)
    }
}
