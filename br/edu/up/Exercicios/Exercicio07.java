package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.Fabrica;

public class Exercicio07 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        Fabrica fabrica = new Fabrica();

        System.out.println("Digite o custo de fabrica do carro: ");
        double custo = leitor.nextDouble();

        fabrica.setCusto(custo);
        System.out.println("O valor da venda é:  " + fabrica.calculaConsumidor());

        leitor.close();
    }
}