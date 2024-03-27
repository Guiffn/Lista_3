public class Produto {
public double lucro;
public double mediaC=0;
public double mediaV=0;

public void lucroProduto(Double preçoCusto,Double preçoVenda){
    lucro=preçoVenda-preçoCusto;
if(lucro>0){
    System.out.println("O produto teve um lucro positivo de: "+lucro);
}else if(lucro==0){
    System.out.println("O produto teve um lucro empate em : "+lucro);
}else{
    System.out.println("O produto teve um lucro negativo de: "+lucro);
}
 }
public void calculcoMedia(Double somaC,Double somaV){
    mediaC=somaC/40;
    mediaV=somaV/40;
    System.out.println("A media de custo de preços é:"+mediaC);
    System.out.println("A media de custo de vendas é:"+mediaV);
}
}
