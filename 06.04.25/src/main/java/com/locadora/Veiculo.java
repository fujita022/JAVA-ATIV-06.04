package com.locadora;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("Valor da diária não pode ser negativo.");
        }
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias < 0) {
            throw new IllegalArgumentException("Quantidade de dias não pode ser negativa.");
        }
        double custoBase = valorDiaria * dias;
        return custoBase - desconto(dias);
    }

    public double desconto(int dias) {
        if (dias >= 7) {
            return valorDiaria * dias * 0.10;
        }
        return 0;
    }

    public double calcularMulta(int diasAtraso) {
        if (diasAtraso <= 0) return 0;
        return diasAtraso * valorDiaria * 1.2;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }
}
