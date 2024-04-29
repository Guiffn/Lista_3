package br.edu.up.modelos;
public class Abono {
private double acrescimo;

public void acrescimoSalarial(String nome,String sexo,int idade, Double salario){
    System.out.println(""+sexo);
   
if(sexo=="H" ){
   if(idade>=30){
    acrescimo=salario+100;
    System.out.println("O funcionario "+nome+"tera um acrescimo no salario, para: "+acrescimo);
   }else{
    acrescimo=salario+50;
    System.out.println("O funcionario "+nome+"tera um acrescimo no salario, para: "+acrescimo);
   }
}else if(sexo=="M" ){
    if(idade>=30){
        acrescimo=salario+200;
        System.out.println("O funcionario "+nome+"tera um acrescimo no salario, para: "+acrescimo);
       }else{
        acrescimo=salario+80;
        System.out.println("O funcionario "+nome+"tera um acrescimo no salario, para: "+acrescimo);
       }
  }else{
    System.out.println("Sexo invalido");
  }
 }
}
