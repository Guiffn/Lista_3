import java.util.Scanner;
public class Exercicio05 {
    public static void executar(){
     Scanner leitor = new Scanner(System.in);

     System.out.println("Digite o valor do produto");
     double produto=leitor.nextDouble();      
     Loja loja = new Loja(produto);
     double prestação= loja.calculaPrestação();
     System.out.println("As 5 prestações do produto serão de: "+prestação);

leitor.close();}
}
