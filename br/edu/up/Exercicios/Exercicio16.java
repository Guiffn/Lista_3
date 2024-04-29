package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Empresa;
public class Exercicio16{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Empresa empresa = new Empresa();
     int func=584;

      for(int i=0;i<func;i++){
       System.out.println("Digite o valor do salario: ");
       Double salario= leitor.nextDouble();
       empresa.calculoSalario(salario, i);
  }
     
  
leitor.close(); 
 }
}