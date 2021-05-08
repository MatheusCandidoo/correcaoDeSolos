package com.mycompany.app.controller;

import com.mycompany.app.constantes.TexturaDoSolo;

public class CorrecaoDePotassio {

    private double participacaoPotassioDesejada;
    private int fontePotassioEscolhida;
    private TexturaDoSolo texturaDoSolo;
    private double potassioNoSolo;
    private double calcioNoSolo;
    private double magnesioNoSolo;
    private double hALNoSolo;
    
    public CorrecaoDePotassio(double potassioNoSolo, double calcioNoSolo, double magnesioNoSolo, double hALNoSolo){
        this.potassioNoSolo = potassioNoSolo;
        this.calcioNoSolo = calcioNoSolo;
        this.magnesioNoSolo = magnesioNoSolo;
        this.hALNoSolo = hALNoSolo;
    }
    
    public CorrecaoDePotassio(double potassioNoSolo, double calcioNoSolo, double magnesioNoSolo, double hALNoSolo, double participacaoPotassioDesejada, int fontePotassioEscolhida){
        this.potassioNoSolo = potassioNoSolo;
        this.calcioNoSolo = calcioNoSolo;
        this.magnesioNoSolo = magnesioNoSolo;
        this.hALNoSolo = hALNoSolo;
        this.participacaoPotassioDesejada = participacaoPotassioDesejada;
        this.fontePotassioEscolhida = fontePotassioEscolhida;
    }


    public double informacoesPotassio() {
        switch (fontePotassioEscolhida) {
            case 1:
                return 58;
            case 2:
                return 52;
            case 3:
                return 22;
            case 4:
                return 44;
            default:
                return 0.0;
        }
    }

    public double participacaoPotassioAposCorrecao() {
        if ((participacaoPotassioDesejada) > 0.001) {
            return participacaoPotassioDesejada;
        }
        return 0.0;
    }

    public double participacaoAtualDoPotassio() {
        return potassioNoSolo / ((calcioNoSolo + magnesioNoSolo + potassioNoSolo) + hALNoSolo) * 100;
    }

    public double participacaoIdealPotassioCTC() {
        return 3.0;
    }

    public double calculoNecessidadePotassioEmDecimetroCubico() {
        return ((potassioNoSolo * participacaoPotassioDesejada) / participacaoAtualDoPotassio()) - potassioNoSolo;
    }
    
    public double calculoNecessidadePotassioEmMiligrama(){
        return (calculoNecessidadePotassioEmDecimetroCubico() * 39.1)*10;
    }
    
    public double calculaNecessidadeDePotassioEmKilogramaPorHectare(){
        return calculoNecessidadePotassioEmMiligrama() * 2;
    }

    public double calculaNecessidadedeOxidoDePotassio(){
        return calculaNecessidadeDePotassioEmKilogramaPorHectare() * 1.2;
    }
    
    public double calculaOxidoDePotassioConsiderandoEficiencia(double eficienciaPotassio){
        return calculaNecessidadedeOxidoDePotassio() / (eficienciaPotassio /100);  
    }
    
    public double calculoAplicacaoDePotassioPorHectare() {
        double eficienciaDoPotassio = 85;
        return (calculaOxidoDePotassioConsiderandoEficiencia(eficienciaDoPotassio) *100)/ informacoesPotassio();
    }
    
    public double calculaCustoAplicacaoPorHectare(double valorDaFonteCorrecao){
        return (calculoAplicacaoDePotassioPorHectare() * valorDaFonteCorrecao)/1000;
    }

}
