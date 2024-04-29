package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Aluno;
public class Exercicio08 {
    public static void executar(){
     Scanner leitor = new Scanner(System.in);

     System.out.println("Digite o nome do aluno");
     String nome=leitor.nextLine();
     System.out.println("Digite a nota do aluno");
     double nota1=leitor.nextDouble();
     System.out.println("Digite a nota do aluno");
     double nota2=leitor.nextDouble();
     System.out.println("Digite a nota do aluno");
     double nota3=leitor.nextDouble();
      
     Aluno aluno= new Aluno ( nome, nota1,nota2, nota3);
     
     String alunoNome =aluno.getNome();
     double media=aluno.calcularMediaAritmetica();
     if(media>=7){
     System.out.println("O aluno: "+alunoNome+" teve a media igual: "+media+".Esta Aprovad");
    }else if(media<=5){
        System.out.println("O aluno: "+alunoNome+" teve a media igual: "+media+".Esta reprovado");
    }else if( 5<media && media<7){
        System.out.println("O aluno: "+alunoNome+" teve a media igual: "+media+".Esta de recuperação");
        
    }


leitor.close();}
}
