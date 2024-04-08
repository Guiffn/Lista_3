package br.edu.up.Exercicios;
import java.util.Scanner;

import br.edu.up.Modelos.Abono;
public class Exercicio18{
    public static void executar(){
        Abono abono=new Abono();
     Scanner leitor = new Scanner(System.in);
     
    
     System.out.println("Digite o nome: ");
     String nome=leitor.nextLine();
     System.out.println("Digite seu sexo (M/H):");
     String sexo=leitor.nextLine();
     System.out.println("Digite a sua idade");
     int idade=leitor.nextInt();
     leitor.nextLine();
     System.out.println("Digite o salario minimo");
     double salario=leitor.nextDouble();
    
     
     abono.acrescimoSalarial(nome, sexo, idade,salario);
     
leitor.close(); 
 }
}