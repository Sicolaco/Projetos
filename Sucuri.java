package br.senac.sp.ado1;

public class Sucuri {
    private String nome;
    private int comprimento;
    private String cor;
    //ação
    private int movimento;
    private String come;

    public Sucuri(){
        this.cor="pink";
    }
    public Sucuri(String newCor) {
        this.cor = newCor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setMovimento(int movimento) {
        this.movimento = movimento;
    }

    public void setCome(String come) {
        this.come = come;
    }

    public int getComprimento() {
        return comprimento;
    }

    public String getCor() {
        return cor;
    }

    public int getMovimento() {
        return movimento;
    }

    public String getCome() {
        return come;
    }


public int movimento(){
    this.movimento+=5;
    return this.movimento;

}
public int movimento(int novoMovimento){
    this.movimento+=novoMovimento;
    return this.movimento;
}
public void come(){
    System.out.println("A Sucuri come uma capivara");
}
}

