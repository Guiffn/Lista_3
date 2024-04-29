package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.CarangoVelho;

public class Exercicio12 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);
        
        CarangoVelho carangoVelho=new CarangoVelho();
        
         System.out.println("Digite o ano do carro");
         int ano=leitor.nextInt();   
         System.out.println("Digite o valor do carro");
         double valor=leitor.nextDouble(); 
         carangoVelho.calcularDesconto(ano, valor);
         String condi;

         leitor.nextLine();
        
         do{
           System.out.println("Vc quer continuar calculando, digite( continuar):");
               condi=leitor.nextLine();
               if (condi.equals("continuar")){
                System.out.println("Digite o ano do carro");
                ano=leitor.nextInt(); 
                System.out.println("Digite o valor do carro");
                valor=leitor.nextDouble();
                carangoVelho.calcularDesconto(ano, valor);
                leitor.nextLine();
            } 
         }while(condi.equals("continuar"));
       
         carangoVelho.exibirTotais();
         System.out.println("Fim");
      
        leitor.close();
    }
}