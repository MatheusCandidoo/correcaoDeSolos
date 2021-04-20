package com.mycompany.app.controller;

import com.mycompany.app.constantes.FonteDeFosforo;

public class CorrecaoDeFosforo {

    private double teorNoSoloAtingir;
    private double teorNoSoloAtual;
    private FonteDeFosforo fonteDeFosforo;
    private double eficienciaDeFosforo;

    public CorrecaoDeFosforo(double teorNoSoloAtingir, double teorNoSoloAtual, FonteDeFosforo fonteDeFosforo, double eficienciaDeFosforo) {
        this.teorNoSoloAtingir = teorNoSoloAtingir;
        this.teorNoSoloAtual = teorNoSoloAtual;
        this.fonteDeFosforo = fonteDeFosforo;
        this.eficienciaDeFosforo = eficienciaDeFosforo;
    }


    public double teorDePentoxidoDeFosforo(FonteDeFosforo fonteDoTeor) {
        switch (fonteDoTeor) {
            case Superfosfato_Simples:
                return 18.0;
            case Superfosfato_Triplo:
                return 41.0;
            case MAP:
                return 48.0;
            case DAP:
                return 45.0;
            case Yoorin:
                return 18.0;
            case Fosfato_Arad:
                return 33.0;
            case Fosfato_Gafsa:
                return 29.0;
            case Fosfato_Daoui:
                return 32.0;
            case Fosf_Patos_Minas:
                return 24.0;
            case Escoria_de_Thomas:
                return 18.5;
            case Acido_Fosforico:
                return 52.0;
            case Multif_Magnesiano:
                return 18.0;
        }
        return 0.0;
    }

    public double transformacaoIdeal(Double teorNoSoloAtingir, Double teorNoSoloAtual) {

        return (teorNoSoloAtingir - teorNoSoloAtual);
    }

    public double calculoTrasformacaoIdeal(){
        return transformacaoIdeal(teorNoSoloAtingir, teorNoSoloAtual);
    }

    public double calculoTeorPentoxidoDeFosforo(){
        return ((teorDePentoxidoDeFosforo(fonteDeFosforo) * 2) * 2.29) * 100;
    }

    public double quantidadeAplicarFosforo() {
        return (calculoTeorPentoxidoDeFosforo() / eficienciaDeFosforo) * 100 / calculoTrasformacaoIdeal();
    }

}


