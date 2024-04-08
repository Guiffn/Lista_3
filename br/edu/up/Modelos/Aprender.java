package br.edu.up.Modelos;
public class Aprender {
    public double salario;

   public void calculoProfessor(int nivel,double horas){
    if(nivel==1){
        salario= horas*12;
        System.out.println("O salario do prefessor: "+salario);
    }else if(nivel==2){
        salario= horas*17;
        System.out.println("O salario do prefessor: "+salario);
    }else{
        salario= horas*25;
        System.out.println("O salario do prefessor: "+salario);
    }

   }
}
