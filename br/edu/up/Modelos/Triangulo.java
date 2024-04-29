package br.edu.up.modelos;
public class Triangulo {

public void calculoTriangulo(int lado1, int lado2,int lado3){
    if(lado1==lado2 && lado2==lado3){
        System.out.println("O triangulo é: Equilátero ");
        if(lado1==lado2 || lado1==lado3 || lado3==lado2){
            System.out.println("Tambem é isoceles");
        }
    }else if(lado1==lado2 || lado1==lado3 || lado3==lado2 ){
        System.out.println("O triangulo é: Isoceleles ");
    }else{
        System.out.println("O triangulo é: Escaleno ");
    }

}


}
