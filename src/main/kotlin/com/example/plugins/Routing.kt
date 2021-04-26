package com.example.plugins

import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.features.*
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*

// pw - using postman to call endpoints

fun Application.configureRouting() {
    install(AutoHeadResponse)

    routing {
        // index
        get("/") {
            call.respondText("Index")
        }

        // display all guest list
        get("/guest") {
            call.respondText("display all your guest data")
        }

        // display a guest
        get("/guest/{id}") {
            val id = call.parameters["id"]
            call.respondText("display guest #$id")
        }

        // add a guest
        post("/guest") {
            call.respondText("created guest!")
        }

        // delete a specific guest
        delete("/guest/{id}") {
            val id = call.parameters["id"]
            call.respondText("deleted guest $id")
        }

    }
}
