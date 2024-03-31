public class Nadador {

public void classificarNadador(int idade){
if(idade<5 ){
    System.out.println("Muito movo para competir");
}else if(idade<=7){
    System.out.println("Infantil A ");
}
else if(idade<=10){
    System.out.println("Infantil B ");
}else if(idade<=13){
    System.out.println("Juvenil A");
}else if(idade<=17){
    System.out.println("Juvenil B ");
}else if(idade<=25){
    System.out.println("Senior ");
}else{
    System.out.println("idade fora da faixa etária");
}

}



}
