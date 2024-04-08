package br.edu.up.Exercicios;
import java.util.Scanner;

import br.edu.up.Modelos.Ideal;
public class Exercicio23{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Ideal Ideal=new Ideal();

      System.out.println("Digite o nome:");
      String nome=leitor.nextLine();
      System.out.println("Digite o sexo: (M/H)");
      String sexo=leitor.nextLine();
      System.out.println("Digite idade:");
      int idade=leitor.nextInt();
      System.out.println("Digite a altura:");
      double altura=leitor.nextDouble();
        Ideal.calcularIdeal(nome, sexo, altura, idade);
      
     
leitor.close(); } 
}