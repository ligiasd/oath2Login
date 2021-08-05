package com.example.oauth2.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ControllerLogin {

    @GetMapping("/")
    fun sparkinho(): String{
        return "Sparkinho conteúdo limitado!"
    }

    @GetMapping("/home")
    fun home(): String{
        return "Acesso restrito à área de interação Sparkinho - Apenas para Colaboradores Redspark!"

    }
}