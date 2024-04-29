package br.edu.up.modelos;

public class CarangoVelho {
    private double totalDesconto = 0;

    public void calcularDesconto(int ano, double valor) {
        double desconto = 0;

        
        if (ano < 2000) {
            desconto = valor * 0.1; 
        } else if (ano >= 2000 && ano <= 2010) {
            desconto = valor * 0.05; 
        } else {
            desconto = 0;
        }

        totalDesconto += desconto;
    }

    public void exibirTotais() {
        System.out.println("O total de descontos concedidos foi: " + totalDesconto);
    }
}