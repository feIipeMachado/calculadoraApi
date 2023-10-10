package com.example.calculadora.service;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {

    public String soma (double numA, double numB) {
        double resultado = (numA + numB);
        return "o resultado da soma é " + resultado;
    }

    public String subtracao (double numA, double numB) {
        double resultado = (numA - numB);
        return "o resultado da subtração é " + resultado;
    }

    public String multiplicacao (double numA, double numB) {
        double resultado = (numA * numB);
        return "o resultado da multiplicação é " + resultado;
    }

    public String divisao (double numA, double numB) {
        double resultado = (numA / numB);
        return "o resultado da divisão é " + resultado;
    }

}
