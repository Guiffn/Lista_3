package br.edu.up.Exercicios;
import java.util.Scanner;

import br.edu.up.Modelos.Carango;
public class Exercicio15{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Carango carango= new Carango();
     double valorCarro;

     
    do {
    System.out.println("Digite o valo do carro: ");
    valorCarro =leitor.nextDouble();
    
      leitor.nextLine();
    System.out.println("Digite qual combutivel ele usa: (Alcool/Gasolina/Diesel)");
    String combustivel=leitor.nextLine();

    carango.calculoDesconto(valorCarro,combustivel);

    } while (valorCarro!=0);

    carango.informaTotal();
     
leitor.close(); 
 }
}