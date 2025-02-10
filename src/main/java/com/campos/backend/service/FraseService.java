package com.campos.backend.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class FraseService {

    private final List<String> saludos;
    private final List<String> emojis;
    private final List<String> preguntas;
    private final Random random;

    public FraseService() {
        saludos = List.of("Hola", "Buenas", "Hello", "Que tal");
        emojis = List.of("😍", "😝", "😎", "😁");
        preguntas = List.of("cómo estas?", "cómo va todo?", "cómo está el clima?", "que haces?");

        random = new Random();
    }

    public String generarFrase() {
        return String.format("%s, %s %s", saludos.get(random.nextInt(saludos.size())),
                preguntas.get(random.nextInt(preguntas.size())),
                emojis.get(random.nextInt(emojis.size())));
    }
}
