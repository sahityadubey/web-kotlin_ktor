 package com.example.plugins

 import com.example.routes.randomRabbit
 import io.ktor.routing.*
 import io.ktor.http.content.*
 import io.ktor.application.*

 fun Application.configureRouting() {
     routing {
         randomRabbit()
         // Static plugin. Try to access `/static/index.html`
         static {
             resources("static")
         }
     }
 }
