package com.mycompany.app.model;

import java.util.Date;

public class InformacoesDoSolo {
  
    private String Elemento;
    private double QuantidateAtual;
    private double QuantidadeIdeal;

    public String getElemento() {
        return Elemento;
    }

    public void setElemento(String elemento) {
        Elemento = elemento;
    }

    public double getQuantidateAtual() {
        return QuantidateAtual;
    }

    public void setQuantidateAtual(Double quantidateAtual) {
        QuantidateAtual = quantidateAtual;
    }

    public double getQuantidadeIdeal() {
        return QuantidadeIdeal;
    }

    public void setQuantidadeIdeal(Double quantidadeIdeal) {
        QuantidadeIdeal = quantidadeIdeal;
    }


}