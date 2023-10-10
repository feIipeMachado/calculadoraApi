package com.example.calculadora.controller;

import com.example.calculadora.service.CalculadoraService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    private CalculadoraService service;

    public CalculadoraController(CalculadoraService service) {
        this.service = service;
    }

    @GetMapping("soma/{numA}/{numB}")
    public ResponseEntity<String> calcularSoma(@PathVariable("numA") double numA,
                                               @PathVariable("numB") double numB) {
        String retornarSoma = service.soma(numA, numB);
        return ResponseEntity.ok(retornarSoma);
    }

    @GetMapping("subtracao/{numA}/{numB}")
    public ResponseEntity<String> calcularSubtracao(@PathVariable("numA") double numA,
                                               @PathVariable("numB") double numB) {
        String retornarSubtracao = service.subtracao(numA, numB);
        return ResponseEntity.ok(retornarSubtracao);
    }

    @GetMapping("multiplicacao/{numA}/{numB}")
    public ResponseEntity<String> calcularMultiplicacao(@PathVariable("numA") double numA,
                                               @PathVariable("numB") double numB) {
        String retornarMultiplicacao = service.multiplicacao(numA, numB);
        return ResponseEntity.ok(retornarMultiplicacao);
    }

    @GetMapping("divisao/{numA}/{numB}")
    public ResponseEntity<String> calcularDivisao(@PathVariable("numA") double numA,
                                               @PathVariable("numB") double numB) {
        String retornarDivisao = service.divisao(numA, numB);
        return ResponseEntity.ok(retornarDivisao);
    }
}
