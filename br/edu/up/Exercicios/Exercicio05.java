package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Loja;
public class Exercicio05 {
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Loja loja = new Loja();

     System.out.println("Digite o valor do produto");
     double produto=leitor.nextDouble();   
     loja.setProduto(produto);   
     
     double prestação= loja.calculaPrestação();
     System.out.println("As 5 prestações do produto serão de: "+prestação);

leitor.close();}
}
