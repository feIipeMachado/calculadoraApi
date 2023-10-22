package com.example.calculadora.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroPrimoServiceTest {

    NumeroPrimoService service;

    @BeforeEach
    public void init() {
        this.service = new NumeroPrimoService();
    }

    @Test
    public void deveRetornarQue2ePar() {
        String resultadoEsperado = "número 2.0 é primo";
        String respostaApi = service.verificarSePrimo(2);
        assertEquals(resultadoEsperado, respostaApi);
    }
}
