package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Aprender;
public class Exercicio20{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Aprender aprender=new Aprender();

     System.out.println("Digite o nivel do Professor (1/2/3):");
     int nivel=leitor.nextInt();
     aprender.setNivel(nivel);

     System.out.println("Digite horas trabalhadas");
     double horas=leitor.nextDouble();
     aprender.setHoras(horas);
     aprender.calculoProfessor();
     
   
leitor.close(); 
 }
}
