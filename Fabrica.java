package brSpSenacExcAviao;


public class Fabrica {
    public static void main (String[] args){
        Aviao aviao1 = new Aviao();
        String cor = aviao1.getCor();

        System.out.println("Cor do primeiro avião");
        System.out.println(cor);

        Aviao aviao2 = new Aviao("Amarelo");
            System.out.println("Cor do aviao 2: " + aviao2.getCor());

        }
    }

