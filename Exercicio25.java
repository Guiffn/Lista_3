import java.util.Scanner;
public class Exercicio25{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     EstudanteComputacao estudanteComputacao=new EstudanteComputacao();

     System.out.println("Digite o nome ");
     String nome=leitor.nextLine();
     System.out.println("Digite o numero de matricula");
     int numMat=leitor.nextInt();
     System.out.println("Digite a nota do labolatório");
     Double notaLabo=leitor.nextDouble();
     System.out.println("Digite a nota da avaliação semestral");
     Double avaSemestral=leitor.nextDouble();
     System.out.println("Digite a nota do exame final");
     Double exameFinal =leitor.nextDouble();

     estudanteComputacao.calcularMedias(notaLabo, avaSemestral, exameFinal);
     estudanteComputacao.calcularClassificação(nome, numMat);

     
     
leitor.close(); } 
}