import java.util.Scanner;
public class Exercicio10{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);

     VerificadorIdade verificador = new VerificadorIdade();

        for (int i = 0; i < 5;i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = leitor.nextInt();

            verificador.verificarIdade(idade);
        }



leitor.close();}
}