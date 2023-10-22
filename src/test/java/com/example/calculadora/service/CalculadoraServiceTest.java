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
    public void deveSomarDoisNumerosEresultarEm50() {
        String resultadoEsperado = "o resultado da soma é 50.0";
        String respostaApi = calculadora.soma(25,25);
        assertEquals(resultadoEsperado, respostaApi);
    }

    @Test
    public void deveSubtrairDoisNumerosEresultarEm50() {
        String resultadoEsperado = "o resultado da subtração é 50.0";
        String respostaApi = calculadora.subtracao(75,25);
        assertEquals(resultadoEsperado, respostaApi);
    }

    @Test
    public void deveMultiplicarDoisNumerosEresultarEm50() {
        String resultadoEsperado = "o resultado da multiplicação é 50.0";
        String respostaApi = calculadora.multiplicacao(25,2);
        assertEquals(resultadoEsperado, respostaApi);
    }

    @Test
    public void deveDividirDoisNumerosEresultarEm50() {
        String resultadoEsperado = "o resultado da divisão é 50.0";
        String respostaApi = calculadora.divisao(100,2);
        assertEquals(resultadoEsperado, respostaApi);
    }

    @Test
    public void deveDevolverRaizQuadradaDe9() {
        String resultadoEsperado = "a raiz quadrada de 9.0 é 3.0";
        String respostaApi = calculadora.raizQuadrada(9);
        assertEquals(resultadoEsperado, respostaApi);
    }

    @Test
    public void deveDevolverRaizCubicaDe8() {
        String resultadoEsperado = "a raiz cúbica de 8.0 é 2.0";
        String respostaApi = calculadora.raizCubica(8);
        assertEquals(resultadoEsperado, respostaApi);
    }

}
