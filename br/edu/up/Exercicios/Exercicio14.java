package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Produto;
public class Exercicio14{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Produto produto=new Produto();
     int P=40;
     double somaCusto=0;
     double somaVenda=0;
     for(int i=0;i<P;i++){
      System.out.println("Digite o custo do produto");
      double custo=leitor.nextDouble();
      produto.setCusto(custo);

      somaCusto=custo+somaCusto;
      produto.setSomaCusto(somaCusto);

      System.out.println("Digite o valor da venda do produto");
      double venda=leitor.nextDouble(); 
      produto.setVenda(venda);

      somaVenda=venda+somaVenda;  
      produto.setSomaVenda(somaVenda);
      produto.exibirLucro();
     }
   
     System.out.println("As medias de custos:"+produto.mediaCusto());
     System.out.println("As medias de vendas:"+produto.mediaVenda());
     
leitor.close(); } 
}

