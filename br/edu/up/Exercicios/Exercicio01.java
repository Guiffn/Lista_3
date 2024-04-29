package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.ALuno1;
public class Exercicio01 {
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     ALuno1 estudante = new ALuno1();

     System.out.println("Digite o nome do aluno");
     String nome=leitor.nextLine();

     System.out.println("Digite a nota do aluno");
     double nota1=leitor.nextDouble();

     System.out.println("Digite a nota do aluno");
     double nota2=leitor.nextDouble();

     System.out.println("Digite a nota do aluno");
     double nota3=leitor.nextDouble();
      
     estudante.setNota1(nota1);
     estudante.setNota2(nota2);
     estudante.setNota3(nota3);
     estudante.setNome(nome); 
     
     String nomeAluno= estudante.getNome();
     double media= estudante.calcularMedia();
   

     System.out.println("O aluno: "+nomeAluno+" teve a media igual: "+media);

leitor.close();}
}
