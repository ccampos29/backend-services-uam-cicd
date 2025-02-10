package com.campos.backend.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FraseServiceTest {

    private FraseService fraseService;

    @BeforeEach
    void setUp() {
        fraseService = new FraseService();
    }

    @Test
    void testGenerarFrase() {
        String frase = fraseService.generarFrase();

        // Validar que la frase contiene uno de los saludos, una de las preguntas y uno de los emojis
        assertTrue(frase.contains("Hola") || frase.contains("Buenas") || frase.contains("Hello") || frase.contains("Que tal"));
        assertTrue(frase.contains("cómo estas?") || frase.contains("cómo va todo?") || frase.contains("cómo está el clima?") || frase.contains("que haces?"));
        assertTrue(frase.contains("😍") || frase.contains("😝") || frase.contains("😎") || frase.contains("😁"));
    }

}
