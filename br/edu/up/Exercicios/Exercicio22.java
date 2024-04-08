package br.edu.up.Exercicios;
import java.util.Scanner;

import br.edu.up.Modelos.Luz;
public class Exercicio22 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        Luz luz= new Luz();
       System.out.println("Digite o valor do KW gasto");
       double kW=leitor.nextDouble();
       System.out.println("Digite o valor da hora");
       double hora=leitor.nextDouble();
       System.out.println("Digite o valor da tarifa");
       double reais=leitor.nextDouble();
       luz.calcularConta(kW, hora, reais);
      
   leitor.close(); 
    }
   }