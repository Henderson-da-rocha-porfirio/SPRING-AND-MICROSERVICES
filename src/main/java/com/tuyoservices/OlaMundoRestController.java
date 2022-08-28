package com.tuyoservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/* @RestController: é a anotação que devemos por quando queremos construir aplicações Rest. */

@RestController
public class OlaMundoRestController {

    @GetMapping(value = "/Ola")
    public String digaOla() {
        return "Olá, Bem Vindo ao Mundo! ";
    }
}
