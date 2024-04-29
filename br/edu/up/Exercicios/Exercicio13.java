package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Perfil;
public class Exercicio13{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Perfil perfil= new Perfil();

     int N= 5;
     for(int i=0;i<N;i++){
      System.out.println("Digite o nome:");
      String nome=leitor.nextLine();

      System.out.println("Digite o sexo: (M/H)");
      String sexo=leitor.nextLine();

      System.out.println("Digite idade:");
      int idade=leitor.nextInt();
      leitor.nextLine();

      System.out.println("Digite saude (boa/ruim):");
      String saude=leitor.nextLine();

      perfil.adicionarInfo(nome,sexo, saude, idade);
      }
      perfil.contaTotal();
      
     
leitor.close(); } 
}
