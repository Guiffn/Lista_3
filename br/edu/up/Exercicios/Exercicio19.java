package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Triangulo;
public class Exercicio19{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);  
     Triangulo triangulo= new Triangulo();

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
