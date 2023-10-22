package com.example.calculadora.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeroParOuImparServiceTest {

    NumeroParOuImparService service;

    @BeforeEach
    public void init() {
        this.service = new NumeroParOuImparService();
    }

    @Test
    public void deveRetornarQue2ePar() {
        String resultadoEsperado = "número 2.0 é par";
        String respostaApi = service.verificarSeParOuImpar(2);
        assertEquals(resultadoEsperado, respostaApi);
    }
}
