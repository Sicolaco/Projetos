package br.senac.sp.ado1;

public class Amazonia {
 public static void main(String [] args){
     Sucuri sucuri1 = new Sucuri();
     String cor = sucuri1.getCor();

     System.out.println("A cor do primeiro filhote é: rosa!");
     System.out.println(cor);

     Sucuri sucuri2 = new Sucuri("verde");
     System.out.println("A cor do segundo filhote é: " + sucuri2.getCor());

     Sucuri nome1 = new Sucuri();
     nome1.setNome("lulu");

     Sucuri nome2 = new Sucuri();
     nome2.setNome("lili");

 }
}
