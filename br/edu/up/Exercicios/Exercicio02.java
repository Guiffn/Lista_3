package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Carro01;
public class Exercicio02 {
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Carro01 carro= new Carro01();

     System.out.println("Digite a distância percorrida em KM: ");
     double distancia=leitor.nextDouble();
     carro.setDistancia(distancia);
     System.out.println("Digite o total de combústivel gasto em Litros: ");
     double combustivel=leitor.nextDouble();
     carro.setCombustivel(combustivel);

     
     
     
     System.out.println("O conusmo medio é igual: "+carro.calcularKilometragem());
  

leitor.close();}
}
