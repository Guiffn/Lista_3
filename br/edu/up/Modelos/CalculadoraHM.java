package br.edu.up.modelos;

public class CalculadoraHM {
    private int contadorM = 0;
    private int contadorH = 0;

    public void contarSexos(String sexo) {
        if (sexo.equals("H")) {
            contadorH++;
        } else if (sexo.equals("M")) {
            contadorM++;
        }
    }

    public void exibirTotal() {
        System.out.println("O total de homens foi: " + contadorH);
        System.out.println("O total de mulheres foi: " + contadorM);
    }

    public void exibirNome(String[] nomes) {
        System.out.println("Nomes digitados:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
}
