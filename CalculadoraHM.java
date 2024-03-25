public class CalculadoraHM {
 private int contadorM=0;
 private int contadorH=0;
 
 public void adicionarSexos(String sexo){
     if(sexo=="homem"){
        contadorH++;
     }else if (sexo=="mulher"){
        contadorM++;
     }
    }
     public void exibirTotal(){
        System.out.println("O total de homens foi: "+contadorH);
        System.out.println("O total de mulheres foi: "+contadorM);
     }
 }
 
 
