import java.util.Scanner;
public class Exercicio02 {
    public static void executar(){
     Scanner leitor = new Scanner(System.in);

     System.out.println("Digite a distância percorrida em KM: ");
     double distancia=leitor.nextDouble();
     System.out.println("Digite o total de combústivel gasto em Litros: ");
     double combustivel=leitor.nextDouble();
     
     Carro01 carro= new Carro01(combustivel, distancia);
     double consumo= carro.calcularConsumo();
     System.out.println("O conusmo medio é igual: "+consumo);
  

leitor.close();}
}
