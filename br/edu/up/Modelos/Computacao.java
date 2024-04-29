package br.edu.up.modelos;
public class Computacao {
    private double notaFinal;
    
    public void calcularNotas(Double notaLabo,double avaSemestral,double exameFinal){
     notaFinal=(notaLabo*2+avaSemestral*3+exameFinal*5)/2+3+5;
     System.out.println("A nota final do estudante é igual a: "+notaFinal);
}

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }


}
