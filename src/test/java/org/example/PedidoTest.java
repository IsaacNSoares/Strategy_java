package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveCalcularFreteNormal() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteNormal(10.0f, 100.0f);
        assertEquals(30.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteExpresso() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteExpresso(10.0f, 100.0f);
        assertEquals(75.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteTransportadora() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteTransportadora(10.0f, 100.0f);
        assertEquals(50.0f, pedido.getValorFrete());
    }

    @Test
    void deveCalcularFreteInternacional() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteInternacional(10.0f, 100.0f);
        assertEquals(400.0f, pedido.getValorFrete());
    }

    @Test
    void naoDeveCalcularFreteInternacionalDistanciaZero() {
        try {
            Pedido pedido = new Pedido();
            pedido.calcularFreteInternacional(10.0f, 0.0f);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Distância inválida para frete internacional", e.getMessage());
        }
    }

    @Test
    void deveCalcularFreteRetirada() {
        Pedido pedido = new Pedido();
        pedido.calcularFreteRetirada(10.0f, 100.0f);
        assertEquals(0.0f, pedido.getValorFrete());
    }

}