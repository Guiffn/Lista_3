package br.edu.up.modelos;

public class Aprender {
    private double salario;
    private int nivel;
    private double horas;

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getHoras() {
        return this.horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }
    public double getSalario() {
        return this.salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calculoProfessor() {
        if (nivel == 1) {
            salario = horas * 12;
            System.out.println("O salario do prefessor: " + salario);
        } else if (nivel == 2) {
            salario = horas * 17;
            System.out.println("O salario do prefessor: " + salario);
        } else {
            salario = horas * 25;
            System.out.println("O salario do prefessor: " + salario);
        }

    }
}
