public class Perfil {
    private int apto=0;
    private int inapto=0;




public void adicionarInfo(String sexo, String saude,int idade){
    if(sexo.equals("H") && idade ==18 && saude.equals("boa") ){
        System.out.println("O candidato esta apto a servir");
        apto++;
      }else{
          System.out.println("O candidato esta dispensado dos serviços militares");
          inapto++;
      }
}
public void contaTotal(){
    System.out.println("O total de aptos a servir: "+apto);
    System.out.println("O total de inaptos a servir: "+inapto);


}


}

