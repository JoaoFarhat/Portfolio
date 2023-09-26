package br.com.portfolio.portfolio.Model;

public class Experiencias {
    private int anoInicio;
    private int anoFinal;
    private String lugar;
    private String cargo;
    private String resumo;

    public Experiencias(int anoInicio, int anoFinal, String lugar, String cargo, String resumo) {
        this.anoInicio = anoInicio;
        this.anoFinal = anoFinal;
        this.lugar = lugar;
        this.cargo = cargo;
        this.resumo = resumo;
    }

    public Experiencias(){

    }

    public int getAnoInicio() {
        return anoInicio;
    }
    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }
    public int getAnoFinal() {
        return anoFinal;
    }
    public void setAnoFinal(int anoFinal) {
        this.anoFinal = anoFinal;
    }
    public String getLugar() {
        return lugar;
    }
    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String tipo) {
        this.cargo = tipo;
    }
    public String getResumo() {
        return resumo;
    }
    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    
}
