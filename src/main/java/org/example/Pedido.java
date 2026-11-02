package org.example;

public class Pedido {

    private float valorFrete;

    public float getValorFrete() {
        return valorFrete;
    }

    public void calcularFreteNormal(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteNormal());
    }

    public void calcularFreteExpresso(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteExpresso());
    }

    public void calcularFreteInternacional(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteInternacional());
    }

    public void calcularFreteTransportadora(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteTransportadora());
    }

    public void calcularFreteRetirada(float peso, float distancia) {
        CalculadoraFrete calculadora = new CalculadoraFrete(peso, distancia);
        this.valorFrete = calculadora.calcular(new FreteRetirada());
    }

}