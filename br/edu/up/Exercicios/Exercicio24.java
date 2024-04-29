package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Computacao;
public class Exercicio24{
    public static void executar(){
    Scanner leitor = new Scanner(System.in);
    Computacao computacao=new Computacao();

    System.out.println("Digite a nota do labolatório");
    Double notaLabo=leitor.nextDouble();
    System.out.println("Digite a nota da avaliação semestral");
    Double avaSemestral=leitor.nextDouble();
    System.out.println("Digite a nota do exame final");
    Double exameFinal =leitor.nextDouble();
    
    computacao.calcularNotas(notaLabo, avaSemestral, exameFinal);      
     
leitor.close(); } 
}