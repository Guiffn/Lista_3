package br.edu.up.Modelos;
public class Calculadora{
private int contador;
public void adicionarNumero(int numero){
    if (numero >= 10 && numero <= 150) {
        contador++;
    }
}
public int contarNumerosNoIntervalo(int inicio, int fim) {
    return contador;
}



}
