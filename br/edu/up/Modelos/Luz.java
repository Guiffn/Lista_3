package br.edu.up.Modelos;
public class Luz {
public double conta;
public double energia;
    public void calcularConta(double kw, double hora,double reais){
      energia=kw/hora;
      conta=energia*reais;
      System.out.println("A energia gasta é:"+energia);
      System.out.println("Energia a pagar: "+conta);
      if(energia<=0.48){
        System.out.println("Residencia");
      }else if(energia<=0.60){
      System.out.println("Comercio");
    }else{
        System.out.println("industria");
    }
    }
}