public class Vendedor {
 
private String nome;
private Double salario;
private int vendas;


public Vendedor(String nome, Double salario, int vendas){
this.nome=nome;
this.salario=salario;
this.vendas=vendas;
}
public double calculoSalario(){
    return salario+(vendas*0.15);
}
public String getNome(){
    return nome;
}

}

