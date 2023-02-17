package brSpSenacExcAviao;

public class Aviao {
    private String marca = "Senac";
    private String modelo;
    private String cor;
    private int velocidade;
    private int altitude;
    private int portas = 4;
    private int asas = 2;
    private int assentos;
    private int janelas;

    public Aviao(){
        this.cor="Branco";
    }
    public Aviao (String pNovaCor){
        this.cor = pNovaCor;
    }
    public String getCor(){
        return this.cor.toUpperCase();
    }
    public void setCor(String pNovaCor){
        this.cor = pNovaCor;
    }
    public int getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(int pNovaVelocidade){
        this.velocidade = pNovaVelocidade;
    }
    public int acelerar(){
        this.velocidade += 20;
        return this.velocidade;
    }
    public int acelerar(int novaAceleracao){
        this.velocidade += 50;
        return this.velocidade;
    }
    public void decolar(){

    }
    public void pousar(){

    }

}
