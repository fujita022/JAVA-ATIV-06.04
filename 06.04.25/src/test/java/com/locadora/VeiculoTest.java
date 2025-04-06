package com.locadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testCustoSemDesconto() {
        Veiculo v = new Veiculo("Fiat Uno", 100);
        assertEquals(300, v.calcularCusto(3));
    }

    @Test
    public void testCustoComDesconto() {
        Veiculo v = new Veiculo("Fiat Uno", 100);
        assertEquals(630, v.calcularCusto(7));
    }

    @Test
    public void testDesconto() {
        Veiculo v = new Veiculo("Gol", 80);
        assertEquals(56, v.desconto(7));
    }

    @Test
    public void testMultaPorAtraso() {
        Veiculo v = new Veiculo("Civic", 120);
        assertEquals(288, v.calcularMulta(2));
    }

    @Test
    public void testValorDiariaNegativa() {
        assertThrows(IllegalArgumentException.class, () -> new Veiculo("Palio", -50));
    }

    @Test
    public void testDiasNegativos() {
        Veiculo v = new Veiculo("Ka", 90);
        assertThrows(IllegalArgumentException.class, () -> v.calcularCusto(-3));
    }

    @Test
    public void testZeroDias() {
        Veiculo v = new Veiculo("HB20", 100);
        assertEquals(0, v.calcularCusto(0));
    }
}
