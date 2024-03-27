public class Carango {
public double desconto;
public double valorDesconto;
public double somaDesconto=0;
public double somaPreço=0;
    public void calculoDesconto(Double valorCarro,String combustivel){
  if(combustivel=="Alcool"){
    valorDesconto=valorCarro*0.25;
    desconto=valorCarro-valorDesconto;
    System.out.println("O valor do desconto é: "+valorDesconto);
    System.out.println("O preço fina do carro é:"+desconto);
    

  }else if(combustivel=="Gasolina"){
    valorDesconto=valorCarro*0.21;
    desconto=valorCarro-valorDesconto;
    System.out.println("O valor do desconto é: "+valorDesconto);
    System.out.println("O preço fina do carro é:"+desconto);

  }else{
    valorDesconto=valorCarro*0.14;
    desconto=valorCarro-valorDesconto;
    System.out.println("O valor do desconto é: "+valorDesconto);
    System.out.println("O preço fina do carro é:"+desconto);
  }
  somaDesconto=valorDesconto+somaDesconto;
  somaPreço=desconto+somaPreço;
    }
    public void informaTotal(){
        System.out.println("Esse e o total de desconto: "+somaDesconto);
        System.out.println("Esse e o total pago pelos clientes: "+somaPreço);

    }
}
