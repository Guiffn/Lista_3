import java.util.Scanner;
public class Exercicio04 {
    public static void executar(){
     Scanner leitor = new Scanner(System.in);

     System.out.println("Digite a cotção do dolar");
     double cotação=leitor.nextDouble();
     System.out.println("Digite a quantos reais");
     double reais=leitor.nextDouble();
     
      
     Dinheiro grana= new Dinheiro(cotação,reais);
     double dolar= grana.calcularDolar();
     System.out.println("A conversão de real para dolar é igual a: "+dolar);

leitor.close();}
}
