package br.edu.up.modelos;
public class GrupoRisco {

    public void calculaGrupo(String risco,String nome,double idade){
    if(idade>=17 || idade<=20){
        if(risco=="baixo"){
            System.out.println("O cliente "+nome+" grupo de risco valor: 1");
        } else if(risco=="medio"){
            System.out.println("O cliente "+nome+" grupo de risco valor: 2");
        }else{
            System.out.println("O cliente "+nome+" grupo de risco valor: 3");
        }
    }else if(idade>=21 || idade<=24){
        if(risco=="baixo"){
            System.out.println("O cliente "+nome+" grupo de risco valor: 2");
        } else if(risco=="medio"){
            System.out.println("O cliente "+nome+" grupo de risco valor: 3");
        }else{
            System.out.println("O cliente "+nome+" grupo de risco valor: 4");
        }
    }else if(idade>=25 || idade<=34){
        if(risco=="baixo"){
            System.out.println("O cliente "+nome+" grupo de risco valor: 3");
        } else if(risco=="medio"){
            System.out.println("O cliente "+nome+" grupo de risco valor: 4");
        }else{
            System.out.println("O cliente "+nome+" grupo de risco valor: 5");
        }
    }else if(idade>=35 || idade<=64){
        if(risco=="baixo"){
            System.out.println("O cliente "+nome+" grupo de risco valor: 4");
        } else if(risco=="medio"){
            System.out.println("O cliente "+nome+" grupo de risco valor: 5");
        }else{
            System.out.println("O cliente "+nome+" grupo de risco valor: 6");
        }
    }else if(idade>=65 || idade<=70){
        if(risco=="baixo"){
            System.out.println("O cliente "+nome+" grupo de risco valor: 7");
        } else if(risco=="medio"){
            System.out.println("O cliente "+nome+" grupo de risco valor: 8");
        }else{
            System.out.println("O cliente "+nome+" grupo de risco valor: 9");
        }
    }else{
            System.out.println("Idade não encontrada");
        }
    }

}
