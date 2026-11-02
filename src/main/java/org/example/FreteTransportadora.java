package org.example;

public class FreteTransportadora implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        return peso * distancia * 0.05f;
    }
}