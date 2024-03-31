import java.util.Scanner;
public class Exercicio21 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        Nadador nadador=new Nadador();
        System.out.println("Digite a idade");
        int idade=leitor.nextInt();
        nadador.classificarNadador(idade);
      
   leitor.close(); 
    }
   }