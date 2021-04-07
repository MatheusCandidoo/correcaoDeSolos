package com.mycompany.app.controller;

import com.mycompany.app.constantes.FonteDeFosforo;

public class CorrecaoDeFosforo {

    private Double teorNoSoloAtingir;
    private Double teorNoSoloAtual;
    private FonteDeFosforo fonteDeFosforo;
    private Double eficienciaDeFosforo;
    private Double calculoTrasformacaoIdeal = transformacaoIdeal(teorNoSoloAtingir, teorNoSoloAtual);
    private Double calculoTeorPentoxidoDeFosforo = ((teorDePentoxidoDeFosforo(fonteDeFosforo) * 2) * 2.29) * 100;

    public double teorDePentoxidoDeFosforo(FonteDeFosforo fonteDoTeor) {
        switch (fonteDoTeor) {
            case Superfosfato_Simples:
                return 18;
            case Superfosfato_Triplo:
                return 41;
            case MAP:
                return 48;
            case DAP:
                return 45;
            case Yoorin:
                return 18;
            case Fosfato_Arad:
                return 33;
            case Fosfato_Gafsa:
                return 29;
            case Fosfato_Daoui:
                return 32;
            case Fosf_Patos_Minas:
                return 24;
            case Escoria_de_Thomas:
                return 18.5;
            case Acido_Fosforico:
                return 52;
            case Multif_Magnesiano:
                return 18;
        }
        return 0;
    }

    public Double transformacaoIdeal(Double teorNoSoloAtingir, Double teorNoSoloAtual) {
        if ((teorNoSoloAtingir - teorNoSoloAtual) < 0.01) {
            return 0.0;
        }
        return (teorNoSoloAtingir - teorNoSoloAtual);
    }

    public Double quantidadeAplicarFosforo() {
        return (calculoTeorPentoxidoDeFosforo / eficienciaDeFosforo) * 100 / calculoTrasformacaoIdeal;
    }

}


