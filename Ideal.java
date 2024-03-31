public class Ideal {
public double pesoIdeal;
public void calcularIdeal(String nome,String sexo,double altura, int idade){
    if (sexo.equalsIgnoreCase("M")) {
        if (altura > 1.70) {
            if (idade <= 20) {
                pesoIdeal = (72.7 * altura) - 58;
            } else if (idade >= 21 && idade <= 39) {
                pesoIdeal = (72.7 * altura) - 53;
            } else {
                pesoIdeal = (72.7 * altura) - 45;
            }
        } else { 
            if (idade <= 40) {
                pesoIdeal = (72.7 * altura) - 50;
            } else { 
                pesoIdeal = (72.7 * altura) - 58;
            }
        }
    } else { 
        if (altura <= 1.50) {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if (idade >= 35) {
            pesoIdeal = (62.1 * altura) - 45;
        } else { // idade < 35
            pesoIdeal = (62.1 * altura) - 49;
        } 

    }
    System.out.println("Nome: " + nome);
    System.out.println("Peso ideal: " + pesoIdeal + " kg");

 }
}
