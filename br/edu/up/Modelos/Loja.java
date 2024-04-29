package br.edu.up.modelos;
public class Loja {
private Double produto;
public Double getProduto(){
    return this.produto;
}
public void setProduto (double produto){
    this.produto=produto;
} 

public double calculaPrestação(){
    return produto/5;

 }
}


