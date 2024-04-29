package br.edu.up.modelos;

public class Fabrica {
    private double custo;

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public static final double imposto = 0.28;
    public static final double distribuidor = 0.45;

    public double calculaConsumidor() {
        double valorImposto = (imposto * custo) + custo;
        double valorDistribuidor = (distribuidor * custo) + custo;
        return valorDistribuidor + valorImposto;
    }
}