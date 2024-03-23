import java.util.Scanner;
public class Exercicio01 {
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
      
     Aluno01 aluno= new Aluno01( nome, nota1,nota2, nota3);

     double media= aluno.calcularMedia();
  
     String nomeAluno= aluno.getNome();

     System.out.println("O aluno: "+nomeAluno+" teve a media igual: "+media);

leitor.close();}
}
