public class Fabrica{

public static final double imposto=0.28;
public static final double distribuidor=0.45;

public static double calculaCunsumidor(double custo){
    double valorImposto= (imposto*custo)+custo;
    double valorDistribuidor= (distribuidor*custo)+custo;
    return valorDistribuidor+valorImposto;
}


}
