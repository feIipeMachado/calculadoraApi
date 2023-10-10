package com.example.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroPrimoService {

    public String verificarSePrimo(double numero) {
        if (numero == 2 || numero % 2 != 0) {
            return "numero " + numero + " é primo";
        } else {
            return "numero " + numero + " não é primo";
        }
    }
}
