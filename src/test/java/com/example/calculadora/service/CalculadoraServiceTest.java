package com.example.calculadora.service;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraServiceTest {

    CalculadoraService calculadora;

    @BeforeEach
    public void init() {
        this.calculadora = new CalculadoraService();
    }

    @Test
    public void deveSomarDosNumerosEresultarEm50() {
        String resultadoEsperado = "o resultado da soma é 50.0";
        String respostaApi = calculadora.soma(25,25);
        assertEquals(resultadoEsperado, respostaApi);
    }

    @Test
    public void deveSubtrairDosNumerosEresultarEm50() {
        String resultadoEsperado = "o resultado da subtração é 50.0";
        String respostaApi = calculadora.subtracao(75,25);
        assertEquals(resultadoEsperado, respostaApi);
    }

}
