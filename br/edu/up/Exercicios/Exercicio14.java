package br.edu.up.Exercicios;
import java.util.Scanner;

import br.edu.up.Modelos.Produto;
public class Exercicio14{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     int P=40;
     Produto produto=new Produto();
     double somaC=0;
     double somaV=0;
     

     for(int i=0;i<P;i++){
      System.out.println("Digite o preço de custo desse produto");
      double preçoCusto=leitor.nextDouble();
      somaC=preçoCusto+somaC;

      System.out.println("Digite o preço de venda desse preoduto");
      double preçoVenda=leitor.nextDouble();
      somaV=preçoVenda+somaV;

      produto.lucroProduto(preçoCusto,preçoVenda);
     }  
     produto.calculcoMedia(somaC,somaV);
      
     
leitor.close(); } 
}

