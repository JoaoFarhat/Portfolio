package br.com.portfolio.portfolio.Model;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String sobre1;
    private String sobre2;
    private String sobre3;
    private String sobre4;
    private String resumo;
    private String profissao;
    private String email;
    private String telefone;


    

    public Pessoa(String nome, String sobrenome, String sobre1, String sobre2, String sobre3, String sobre4,
            String resumo, String profissao, String email, String telefone) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sobre1 = sobre1;
        this.sobre2 = sobre2;
        this.sobre3 = sobre3;
        this.sobre4 = sobre4;
        this.resumo = resumo;
        this.profissao = profissao;
        this.email = email;
        this.telefone = telefone;
    }

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getSobre1() {
        return sobre1;
    }

    public void setSobre1(String sobre1) {
        this.sobre1 = sobre1;
    }

    public String getSobre2() {
        return sobre2;
    }

    public void setSobre2(String sobre2) {
        this.sobre2 = sobre2;
    }

    public String getSobre3() {
        return sobre3;
    }

    public void setSobre3(String sobre3) {
        this.sobre3 = sobre3;
    }

    public String getSobre4() {
        return sobre4;
    }

    public void setSobre4(String sobre4) {
        this.sobre4 = sobre4;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    

    
    
}
