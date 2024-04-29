package br.edu.up.modelos;
public class Vendedor {
 
private String nome;
private Double salario;
private int vendas;

public void setNome(String nome) {
    this.nome = nome;
}
public Double getSalario() {
    return salario;
}
public void setSalario(Double salario) {
    this.salario = salario;
}
public int getVendas() {
    return vendas;
}
public void setVendas(int vendas) {
    this.vendas = vendas;
}
public double calculoSalario(){
    return salario+(vendas*0.15);
}
public String getNome(){
    return nome;
 }
}

