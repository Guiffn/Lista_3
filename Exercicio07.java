import java.util.Scanner;
public class Exercicio07{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);

     System.out.println("Digite o custo de fabrica do carro: ");
     double custo=leitor.nextDouble();    
     double custoTotal= Fabrica.calculaCunsumidor(custo);
     System.out.println("O valor da venda é:  "+custoTotal);


leitor.close();}
}
