package com.mycompany.app.model;

import java.util.Date;

public class InformacoesDoSolo {
  
    private String Elemento;
    private Double QuantidateAtual;
    private Double QuantidadeIdeal;

    public String getElemento() {
        return Elemento;
    }

    public void setElemento(String elemento) {
        Elemento = elemento;
    }

    public Double getQuantidateAtual() {
        return QuantidateAtual;
    }

    public void setQuantidateAtual(Double quantidateAtual) {
        QuantidateAtual = quantidateAtual;
    }

    public Double getQuantidadeIdeal() {
        return QuantidadeIdeal;
    }

    public void setQuantidadeIdeal(Double quantidadeIdeal) {
        QuantidadeIdeal = quantidadeIdeal;
    }
}