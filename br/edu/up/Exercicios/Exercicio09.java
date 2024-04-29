package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Calculadora;
public class Exercicio09{
   
    public static void executar(){
     Scanner leitor = new Scanner(System.in);

     Calculadora calculadora= new Calculadora();
     for(int i =0;i<80;i++){
        System.out.print("Digite o " + (i + 1) + "º número: ");
        int numero = leitor.nextInt();

        calculadora.adicionarNumero(numero);
     }
     
     int numerosNoIntervalo = calculadora.contarNumerosNoIntervalo(10, 150);
     System.out.println("Quantidade de números no intervalo entre 10 e 150: " + numerosNoIntervalo);
   



leitor.close();}
}