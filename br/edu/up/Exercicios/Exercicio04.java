package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Dinheiro;
public class Exercicio04 {
    public static void executar(){
     Scanner leitor = new Scanner(System.in); 
     Dinheiro grana= new Dinheiro();

     System.out.println("Digite a cotção do dolar");
     double cotação=leitor.nextDouble();
     grana.setCotação(cotação);
     System.out.println("Digite a quantos reais");
     double reais=leitor.nextDouble();
     grana.setReais(reais);
     
     double dolar= grana.calcularDolar();
     System.out.println("A conversão de real para dolar é igual a: "+dolar);

leitor.close();}
}
