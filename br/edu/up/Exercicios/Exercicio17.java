package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Funcionario;
public class Exercicio17{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Funcionario funcionario=new Funcionario();

     System.out.println("Digite o seu nome:");
     String nome= leitor.nextLine();
     System.out.println("Digite o seu salário minimo:");
     double salario= leitor.nextDouble();
     System.out.println("Digite o valor do salário mínimo");
     double minimo=leitor.nextDouble();

      funcionario.mostrarFuncionario(nome);
      funcionario.calcularReajuste(minimo,salario);
      funcionario.folhaPagamento(minimo, salario);

     
  


 


leitor.close(); 
 }
}