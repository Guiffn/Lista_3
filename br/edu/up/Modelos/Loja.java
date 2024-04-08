package br.edu.up.Modelos;
public class Loja {
private Double produto;

public Loja(double produto){
    this.produto=produto;
} 

public double calculaPrestação(){
    return produto/5;

 }
}


