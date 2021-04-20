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

    public double calculoAplicacaoDePotassio() {
        double eficienciaDoPotassio = 85.00;
        return (((((calculoNecessidadePotassioEmDecimetroCubico() * 39.1 * 10) * 2) * 1.2) / eficienciaDoPotassio) * 100) / informacoesPotassio();
    }

}
