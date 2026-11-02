package org.example;

public class FreteExpresso implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        return 25.0f + (peso * 3.0f) + (distancia * 0.2f);
    }
}