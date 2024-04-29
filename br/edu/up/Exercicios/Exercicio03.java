package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Vendedor;
public class Exercicio03 {
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Vendedor vendedor= new Vendedor();
     
     System.out.println("Digite o nome do vendedor: ");
     String nome=leitor.nextLine();  
     vendedor.setNome(nome);

     System.out.println("Digite o salario: ");
     double salario =leitor.nextDouble();
     vendedor.setSalario(salario);

     System.out.println("Digite o total de vendas efetuadas ");
     int vendas =leitor.nextInt();
     vendedor.setVendas(vendas);

  
     double salarioFinal= vendedor.calculoSalario();
     String nomevendedor= vendedor.getNome();

     System.out.println("O vendedor: "+nomevendedor+" tem um salario final de: "+salarioFinal);

     
    

leitor.close();}
}
