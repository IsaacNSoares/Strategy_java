package org.example;

public class FreteInternacional implements EstrategiaFrete {

    public float calcular(float peso, float distancia) {
        if (distancia == 0) {
            throw new IllegalArgumentException("Distância inválida para frete internacional");
        }
        else {
            return 150.0f + (peso * 20.0f) + (distancia * 0.5f);
        }
    }
}