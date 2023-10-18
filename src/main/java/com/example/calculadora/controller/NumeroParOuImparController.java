package com.example.calculadora.controller;

import com.example.calculadora.service.NumeroParOuImparService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//
@RestController
@RequestMapping("/parOuImpar")
public class NumeroParOuImparController {
    private NumeroParOuImparService service;

    public NumeroParOuImparController (NumeroParOuImparService service) {
        this.service = service;
    }

    @GetMapping("{numero}")
    public ResponseEntity<String> verificarParOuImpar (@PathVariable("numero") double numero) {
        String retornarVerificacaoParOuImpar = service.verificarSeParOuImpar(numero);
        return ResponseEntity.ok(retornarVerificacaoParOuImpar);
    }
}
