package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Custo;
public class Exercicio06{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
        Custo custo=new Custo();
     System.out.println("Digite o preço do produto");
     double produto=leitor.nextDouble();  

     System.out.println("Digite o percentual de acrescimo:");
     double percentual=leitor.nextDouble();

     custo.setPercentual(percentual);
     custo.setProduto(produto);

     double valorVenda= custo.calcularAcrescimo();
     System.out.println("O valor da venda é:  "+valorVenda);


leitor.close();}
}