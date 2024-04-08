package br.edu.up.Exercicios;
import java.util.Scanner;

import br.edu.up.Modelos.Vendedor;
public class Exercicio03 {
    public static void executar(){
     Scanner leitor = new Scanner(System.in);

     System.out.println("Digite o nome do vendedor: ");
     String nome=leitor.nextLine();
     System.out.println("Digite o salario: ");
     double salario =leitor.nextDouble();
     System.out.println("Digite o total de vendas efetuadas ");
     int vendas =leitor.nextInt();

     Vendedor profissional= new Vendedor( nome,salario, vendas);
     double salarioFinal=profissional.calculoSalario();
     String nomevendedor=profissional.getNome();

     System.out.println("O vendedor: "+nomevendedor+" tem um salario final de: "+salarioFinal);

     
    

leitor.close();}
}
