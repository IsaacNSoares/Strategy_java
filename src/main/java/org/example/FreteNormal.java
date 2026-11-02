package org.example;

public class FreteNormal implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        return (peso * 2.0f) + (distancia * 0.1f);
    }
}