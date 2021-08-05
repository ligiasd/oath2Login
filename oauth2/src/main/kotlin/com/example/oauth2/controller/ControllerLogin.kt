package com.example.oauth2.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ControllerLogin {

    @GetMapping("/")
    fun sparkinho(): String{
        return "Bem vindo ao Sparkinho!"
    }

    @GetMapping("home")
    fun home(): String{
        return "Acesso restrito à área de interação colaboradores Redspark - Sparkinho!"

    }
}