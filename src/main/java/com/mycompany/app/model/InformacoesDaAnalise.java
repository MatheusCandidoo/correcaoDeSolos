package com.mycompany.app.model;

import java.util.Date;

public class InformacoesDaAnalise {

    private double numeroTalhao;
    private double areaTotal;
    private double areaTalhao;
    private String soloArgiloso;
    private int profundideAnalise;
    private double numeroAnalise;
    private Date dataAnalise;
    private String responsavelTecnico;
    private int talhao;
    private int texturaSolo;

    public double getNumeroTalhao() {
        return numeroTalhao;
    }

    public void setNumeroTalhao(double numeroTalhao) {
        this.numeroTalhao = numeroTalhao;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getAreaTalhao() {
        return areaTalhao;
    }

    public void setAreaTalhao(double areaTalhao) {
        this.areaTalhao = areaTalhao;
    }

    public String getSoloArgiloso() {
        return soloArgiloso;
    }

    public void setSoloArgiloso(String soloArgiloso) {
        this.soloArgiloso = soloArgiloso;
    }

    public int getProfundideAnalise() {
        return profundideAnalise;
    }

    public void setProfundideAnalise(int profundideAnalise) {
        this.profundideAnalise = profundideAnalise;
    }

    public double getNumeroAnalise() {
        return numeroAnalise;
    }

    public void setNumeroAnalise(Double numeroAnalise) {
        this.numeroAnalise = numeroAnalise;
    }

    public Date getDataAnalise() {
        return dataAnalise;
    }

    public void setDataAnalise(Date dataAnalise) {
        this.dataAnalise = dataAnalise;
    }

    public String getResponsavelTecnico() {
        return responsavelTecnico;
    }

    public void setResponsavelTecnico(String responsavelTecnico) {
        this.responsavelTecnico = responsavelTecnico;
    }

    public int getTalhao() {
        return talhao;
    }

    public void setTalhao(int talhao) {
        this.talhao = talhao;
    }

    public int getTexturaSolo() {
        return texturaSolo;
    }

    public void setTexturaSolo(int texturaSolo) {
        this.texturaSolo = texturaSolo;
    }
}
