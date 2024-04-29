package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.VerificadorIdade;
public class Exercicio10{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);

     VerificadorIdade verificador = new VerificadorIdade();

        for (int i = 0; i < 5;i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = leitor.nextInt();

            verificador.verificarIdade(idade);
        }



leitor.close();}
}