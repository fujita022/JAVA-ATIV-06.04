package com.locadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo carro = new Veiculo("Corolla", 150);

        System.out.print("Digite o número de dias alugados: ");
        int diasAlugados = scanner.nextInt();

        System.out.print("Digite o número de dias de atraso (se houver): ");
        int diasAtraso = scanner.nextInt();

        double custo = carro.calcularCusto(diasAlugados);
        double multa = carro.calcularMulta(diasAtraso);

        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Dias alugados: " + diasAlugados);
        System.out.println("Custo total com desconto: R$" + custo);
        System.out.println("Multa por atraso: R$" + multa);

        scanner.close();
    }
}
