package br.edu.up.modelos;
public class Carro01 {
    private double distancia;
    private double combustivel;

    
    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    public double calcularKilometragem(){
       return distancia/combustivel;
    }

    


}
