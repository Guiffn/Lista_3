package br.edu.up.modelos;
public class Dinheiro {
private double cotação;
private double reais;

 public double getCotação() {
    return cotação;
}

public void setCotação(double cotação) {
    this.cotação = cotação;
}

public double getReais() {
    return reais;
}

public void setReais(double reais) {
    this.reais = reais;
}
public double calcularDolar(){
    return reais/cotação;
 }

}
