import java.util.Scanner;
public class Exercicio20{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);
     Aprender aprender=new Aprender();

     System.out.println("Digite o nivel do Professor (1/2/3):");
     int nivel=leitor.nextInt();
     System.out.println("Digite horas trabalhadas");
     double horas=leitor.nextDouble();
     aprender.calculoProfessor(nivel, horas);
     
   
leitor.close(); 
 }
}
