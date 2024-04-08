package br.edu.up.Modelos;
public class Empresa {
    public Double reajuste;


public void calculoSalario(Double salario, int i){
    if(salario<3636){
      reajuste=salario-(salario*0.50);
      System.out.println("O salario do funcionario "+(i+1)+" com resjuste sofrido: "+reajuste);
    }else if(salario<14120){
        reajuste=salario-(salario*0.20);
      System.out.println("O salario do funcionario "+(i+1)+" com resjuste sofrido: "+reajuste);

    }else if(salario<28240){
        reajuste=salario-(salario*0.15);
      System.out.println("O salario do funcionario "+(i+1)+" com resjuste sofrido: "+reajuste);
    }else{
        reajuste=salario-(salario*0.10);
      System.out.println("O salario do funcionario "+(i+1)+" com resjuste sofrido: "+reajuste);
    }

}

}
