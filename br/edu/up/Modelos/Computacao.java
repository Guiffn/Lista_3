package br.edu.up.Modelos;
public class Computacao {
    public double notaFinal;

public void calcularNotas(Double notaLabo,double avaSemestral,double exameFinal){
     notaFinal=(notaLabo*2+avaSemestral*3+exameFinal*5)/2+3+5;
     System.out.println("A nota final do estudante é igual a: "+notaFinal);
}


}
