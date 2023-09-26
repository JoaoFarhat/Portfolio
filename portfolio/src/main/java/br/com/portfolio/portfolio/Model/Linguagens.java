package br.com.portfolio.portfolio.Model;

public class Linguagens {
    private String nome;
    private int conhecimento;

    public Linguagens(){
        
    }

    public Linguagens(String nome, int conhecimento) {
        this.nome = nome;
        this.conhecimento = conhecimento;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getConhecimento() {
        return conhecimento;
    }
    public void setConhecimento(int conhecimento) {
        this.conhecimento = conhecimento;
    }

    
    
}
