package br.edu.up.exercicios;

import java.util.Scanner;
import br.edu.up.modelos.CalculadoraHM;

public class Exercicio11 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        CalculadoraHM calculadoraHM = new CalculadoraHM();
        String nome[] = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome da pessoa");
            nome[i] = leitor.nextLine();

            System.out.println("Digite o sexo dessa pessoa (H/M)");
            String sexo = leitor.nextLine();
            calculadoraHM.contarSexos(sexo);
        }
        calculadoraHM.exibirNome(nome);
        calculadoraHM.exibirTotal();

        leitor.close();
    }
}