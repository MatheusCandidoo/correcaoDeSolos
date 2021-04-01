package com.mycompany.app.controller;

public class CorrecaoDeFosforo {

    private Double teorNoSoloAtingir;
    private Double teorNoSoloAtual;
    private int fonteDeFosforo;
    private Double eficienciaDeFosforo;

    public double teorDePentoxidoDeFosforo(int fonteDeFosforo) {
        switch (fonteDeFosforo) {
            case 1:
                return 18;
            case 2:
                return 41;
            case 3:
                return 48;
            case 4:
                return 45;
            case 5:
                return 18;
            case 6:
                return 33;
            case 7:
                return 29;
            case 8:
                return 32;
            case 9:
                return 24;
            case 10:
                return 18.5;
            case 11:
                return 52;
            case 12:
                return 18;
        }
        return 0;
    }

    public Double transformacaoIdeal(Double teorNoSoloAtingir, Double teorNoSoloAtual) {
        if ((teorNoSoloAtingir - teorNoSoloAtual) < 0.01) {
            return 0.0;
        }
        return (teorNoSoloAtingir - teorNoSoloAtual)
    }

    public Double quantidadeAplicarFosforo() {
        return (((teorDePentoxidoDeFosforo(fonteDeFosforo) * 2) * 2.29) * 100 / eficienciaDeFosforo) * 100 / transformacaoIdeal(teorNoSoloAtingir, teorNoSoloAtual)
    }

}


