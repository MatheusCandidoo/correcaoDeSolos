package com.mycompany.app.controller;

public class correcaoDePotassio {

    private Double participacaoPotassioDesejada;
    private Integer fontePotassioEscolhida;
    private Integer texturaDoSolo;
    private Double potassioNoSolo;
    private Double calcioNoSolo;
    private Double magnesioNoSolo;
    private Double hALNoSolo;
    private Double eficienciaDoPotassio = 85.00;


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

    public Double participacaoPotassioAposCorrecao() {
        if ((participacaoPotassioDesejada) > 0.001) {
            return participacaoPotassioDesejada;
        }
        return 0.0;
    }

    public Double participacaoAtualDoPotassio() {
        return potassioNoSolo / ((calcioNoSolo + magnesioNoSolo + potassioNoSolo) + hALNoSolo) * 100;
    }

    public Double participacaoIdealPotassioCTC() {
        if (texturaDoSolo == 1 || texturaDoSolo == 2) {
            return 3.0;
        }
        return 0.0;
    }

    public Double calculoNecessidadePotassioEmDecimetroCubico() {
        double calculoDePotassio = ((potassioNoSolo * participacaoPotassioDesejada) / participacaoAtualDoPotassio()) - potassioNoSolo;

        if (calculoDePotassio < 0.01) {
            return 0.0;
        }

        return calculoDePotassio;
    }

    public Double calculoAplicacaoDePotassio() {
        return ((((((calculoNecessidadePotassioEmDecimetroCubico() * 39.1 * 10) * 2) * 1.2) * 100) / eficienciaDoPotassio / 100) * 100) / informacoesPotassio();
    }

}
