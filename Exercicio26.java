import java.util.Scanner;
public class Exercicio26 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        GrupoRisco grupoRisco=new GrupoRisco();

        System.out.println("Digite o nome");
        String nome=leitor.nextLine();
        System.out.println("Digite sua idade entre 17 e 70 anos: ");
        int idade=leitor.nextInt();
        leitor.nextLine();
        System.out.println("Determine grupo de risco (baixo/medio/alto)");
        String risco=leitor.nextLine();
        grupoRisco.calculaGrupo(risco, nome, idade);

   leitor.close(); 
    }
   }
