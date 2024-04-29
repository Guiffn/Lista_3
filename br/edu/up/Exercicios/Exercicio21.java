package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Nadador;
public class Exercicio21 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        Nadador nadador=new Nadador();
        System.out.println("Digite a idade");
        int idade=leitor.nextInt();
        nadador.classificarNadador(idade);
      
   leitor.close(); 
    }
   }