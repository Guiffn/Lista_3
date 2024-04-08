package br.edu.up.Exercicios;
import java.util.Scanner;

import br.edu.up.Modelos.CalculadoraHM;
public class Exercicio11{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
         CalculadoraHM calculadoraHM= new CalculadoraHM();

        for (int i = 0; i < 56;i++) {
            System.out.print("Digite o nome da pessoa: ");
            String nome= leitor.nextLine();
            System.out.print("Digite se a pessoa é homem ou mulher. ");
            String sexo= leitor.nextLine();
            
            calculadoraHM.adicionarSexos(sexo);  
        }
            calculadoraHM.exibirTotal();


leitor.close();}
}