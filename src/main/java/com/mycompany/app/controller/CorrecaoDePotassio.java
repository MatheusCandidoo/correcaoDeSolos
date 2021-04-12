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
    private double eficienciaDoPotassio = 85.00;


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
        if (texturaDoSolo == TexturaDoSolo.Argiloso || texturaDoSolo == TexturaDoSolo.Textura_Media) {
            return 3.0;
        }
        return 0.0;
    }

    public double calculoNecessidadePotassioEmDecimetroCubico() {
        double calculoDePotassio = ((potassioNoSolo * participacaoPotassioDesejada) / participacaoAtualDoPotassio()) - potassioNoSolo;

        if (calculoDePotassio < 0.01) {
            return 0.0;
        }

        return calculoDePotassio;
    }

    public double calculoAplicacaoDePotassio() {
        return ((((((calculoNecessidadePotassioEmDecimetroCubico() * 39.1 * 10) * 2) * 1.2) * 100) / eficienciaDoPotassio / 100) * 100) / informacoesPotassio();
    }

}
