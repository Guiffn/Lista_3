package br.edu.up.Exercicios;
import java.util.Scanner;

import br.edu.up.Modelos.Triangulo;
public class Exercicio19{
    public static void executar(){
        Triangulo triangulo= new Triangulo();
     Scanner leitor = new Scanner(System.in);
     System.out.println("Digite o lado do triangulo:");
     int lado1=leitor.nextInt();
     System.out.println("Digite o lado do triangulo:");
     int lado2=leitor.nextInt();
     System.out.println("Digite o lado do triangulo:");
     int lado3=leitor.nextInt();
     triangulo.calculoTriangulo(lado1,lado2,lado3);
   
   
leitor.close(); 
 }
}
