package br.edu.up.modelos;
public class DescontoCalculator {
    public static double calcularDesconto(int ano) {
        if (ano <= 2000) {
            return 0.12; // 12% de desconto para carros até 2000
        } else {
            return 0.07; // 7% de desconto para carros acima de 2000
        }
    }
}
