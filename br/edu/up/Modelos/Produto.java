package br.edu.up.modelos;
public class Produto {
private double venda;
private double custo;
private double lucro;
private double somaCusto;
private double somaVenda;

public double getSomaCusto() {
    return somaCusto;
}
public void setSomaCusto(double somaCusto) {
    this.somaCusto = somaCusto;
}
public double getSomaVenda() {
    return somaVenda;
}
public void setSomaVenda(double somaVenda) {
    this.somaVenda = somaVenda;
}
public double getLucro() {
    return lucro;
}
public void setLucro(double lucro) {
    this.lucro = lucro;
}
public double getVenda() {
    return venda;
}
public void setVenda(double venda) {
    this.venda = venda;
}
public double getCusto() {
    return custo;
}
public void setCusto(double custo) {
    this.custo = custo;
}

public void exibirLucro(){
    lucro=venda-custo;
    if(venda>custo){
        System.out.println("O lucro foi positivo de: "+lucro);
    }else if(venda==custo){
        System.out.println("Não houve lucro");
    }else{
        System.out.println("O lucro foi negativo de: "+lucro);
    }
}
 
public double mediaCusto(){
    return somaCusto/40;
}
public double mediaVenda(){
    return somaVenda/40;
}
}
