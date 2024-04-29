package br.edu.up.modelos;
public class Custo {
private double percentual;
private double produto;

public double getPercentual() {
    return percentual;
}

public void setPercentual(double percentual) {
    this.percentual = percentual;
}

public double getProduto() {
    return produto;
}

public void setProduto(double produto) {
    this.produto = produto;
} 

public double calcularAcrescimo(){
    return produto*(1+percentual/100);

}


}
