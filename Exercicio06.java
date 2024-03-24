import java.util.Scanner;
public class Exercicio06{
    public static void executar(){
     Scanner leitor = new Scanner(System.in);

     System.out.println("Digite o preço do produto");
     double produto=leitor.nextDouble();      
     System.out.println("Digite o percentual de acrescimo:");
     double percentual=leitor.nextDouble();
      
     double valorVenda= PrecoCusto.calcularAcrescimo(produto, percentual);
     System.out.println("O valor da venda é:  "+valorVenda);


leitor.close();}
}