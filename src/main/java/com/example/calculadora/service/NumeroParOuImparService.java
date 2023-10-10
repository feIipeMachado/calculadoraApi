package com.example.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroParOuImparService {

    public String verificarSeParOuImpar(double numero) {
        if (numero % 2 == 0) {
            return "número " + numero + " é par";
        } else {
            return "número " + numero + " é impar";
        }
    }

}
