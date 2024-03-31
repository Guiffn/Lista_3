public class Funcionario {
public double reajuste;
public double aumento;


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

}
