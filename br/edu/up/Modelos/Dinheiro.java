package br.edu.up.Modelos;
public class Dinheiro {
private double cotação;
private double reais;

public Dinheiro(double cotação,double reais){
    this.cotação=cotação;
    this.reais=reais;
}

 public double calcularDolar(){
    return reais/cotação;
 }

}
