package br.edu.up.modelos;
public class Funcionario {
private double reajuste;
private double aumento;


public void mostrarFuncionario(String nome){
System.out.println("O usuário: "+nome);
}

public void folhaPagamento(double minimo,double salario){
    aumento= minimo- salario;
    System.out.println("A empresa aumentara mais "+aumento+" de seus gastos");
}
public void calcularReajuste(double salario,double minimo){
reajuste=aumento+salario;
System.out.println("Tera um reajuste no salário igual a: "+reajuste);
}

public double getReajuste() {
    return reajuste;
}

public double getAumento() {
    return aumento;
}

public void setReajuste(double reajuste) {
    this.reajuste = reajuste;
}

public void setAumento(double aumento) {
    this.aumento = aumento;
}


}
