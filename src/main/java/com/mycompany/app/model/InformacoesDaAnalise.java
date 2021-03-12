package com.mycompany.app.model;

import java.util.Date;

public class InformacoesDaAnalise {

    private Double numeroTalhao;
    private Double areaTotal;
    private Double areaTalhao;
    private String soloArgiloso;
    private Integer profundideAnalise;
    private Double numeroAnalise;
    private Date dataAnalise;
    private String responsavelTecnico;
    private Integer talhao;
    private Integer texturaSolo;

    public Double getNumeroTalhao() {
        return numeroTalhao;
    }

    public void setNumeroTalhao(Double numeroTalhao) {
        this.numeroTalhao = numeroTalhao;
    }

    public Double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(Double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public Double getAreaTalhao() {
        return areaTalhao;
    }

    public void setAreaTalhao(Double areaTalhao) {
        this.areaTalhao = areaTalhao;
    }

    public String getSoloArgiloso() {
        return soloArgiloso;
    }

    public void setSoloArgiloso(String soloArgiloso) {
        this.soloArgiloso = soloArgiloso;
    }

    public Integer getProfundideAnalise() {
        return profundideAnalise;
    }

    public void setProfundideAnalise(Integer profundideAnalise) {
        this.profundideAnalise = profundideAnalise;
    }

    public Double getNumeroAnalise() {
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

    public Integer getTalhao() {
        return talhao;
    }

    public void setTalhao(Integer talhao) {
        this.talhao = talhao;
    }

    public Integer getTexturaSolo() {
        return texturaSolo;
    }

    public void setTexturaSolo(Integer texturaSolo) {
        this.texturaSolo = texturaSolo;
    }
}
