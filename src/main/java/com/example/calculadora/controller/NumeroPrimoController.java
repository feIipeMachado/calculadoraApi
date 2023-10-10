package com.example.calculadora.controller;


import com.example.calculadora.service.NumeroPrimoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/primo")

public class NumeroPrimoController {

    private NumeroPrimoService service;

    public NumeroPrimoController (NumeroPrimoService service) {
        this.service = service;
    }

    @GetMapping("{numero}")
    public ResponseEntity<String> verificarPrimo (@PathVariable("numero") double numero) {
        String retornarSePrimo = service.verificarSePrimo(numero);
        return ResponseEntity.ok(retornarSePrimo);
    }

}
