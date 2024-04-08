package br.edu.up.Modelos;
public class Carro01 {
    private double distancia;
    private double combustivel;
    
    public Carro01(Double distancia, Double combustivel){
        this.distancia = distancia;
        this.combustivel = combustivel;

    }

    public double calcularConsumo(){
        return distancia/combustivel;
    }

}
