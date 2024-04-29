package br.edu.up.modelos;
public class EstudanteComputacao {
  private double notaFinal;

  public void calcularMedias(Double notaLabo,double avaSemestral,double exameFinal){
        notaFinal=(notaLabo*2+avaSemestral*3+exameFinal*5)/2+3+5;    
}
  public void calcularClassificação(String nome,int numMat){
      System.out.println("O estudante "+nome+" numero de matricula "+numMat+" nota final "+notaFinal);
  if(notaFinal<5){
       System.out.println("Classificação nota: R");
  }else if(notaFinal<6){
    System.out.println("Classificação nota: D");
  }else if(notaFinal<7){
    System.out.println("Classificação nota: C");
  }else if(notaFinal<8){
    System.out.println("Classificação nota: B");
  }else {}
    System.out.println("Classificação nota: A");
}
   public double getNotaFinal() {
    return notaFinal;
}
   public void setNotaFinal(double notaFinal) {
    this.notaFinal = notaFinal;
}
   }


