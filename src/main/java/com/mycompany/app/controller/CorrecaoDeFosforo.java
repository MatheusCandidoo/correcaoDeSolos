package com.mycompany.app.controller;

import com.mycompany.app.constantes.FonteDeFosforo;

public class CorrecaoDeFosforo {

    private double teorDeFosforoAtingir;
    private double teorDeFosforoNoSolo;
    private FonteDeFosforo fonteDeFosforo;
    private double eficienciaDeFosforo;
    private double custoDeAplicacao;

    public CorrecaoDeFosforo(double teorDeFosforoAtingir, double teorDeFosforoNoSolo, FonteDeFosforo fonteDeFosforo, double eficienciaDeFosforo) {
        this.teorDeFosforoAtingir = teorDeFosforoAtingir;
        this.teorDeFosforoNoSolo = teorDeFosforoNoSolo;
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

    public double transformacaoIdeal() {
        return (teorDeFosforoAtingir - teorDeFosforoNoSolo);
    }

    public double calculoTeorPentoxidoDeFosforo() {
        return ((teorDePentoxidoDeFosforo(fonteDeFosforo) * 2) * 2.29) * 100;
    }

    public double quantidadeAplicarFosforo() {
        return (calculoTeorPentoxidoDeFosforo() / eficienciaDeFosforo) * 100 / transformacaoIdeal();
    }

    public double calculoDeEficienciaDaTranformacaoIdeal() {
        return ((transformacaoIdeal() * 2) * 2.29) / eficienciaDeFosforo;
    }

    public double custoDeAplicacaoDaCorrecaoDeFosforo(FonteDeFosforo fonteDoTeor, double custoDoFosforoPorFonte) {
        switch (fonteDoTeor) {
            case Superfosfato_Simples:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 18 * 2.42;
            case Superfosfato_Triplo:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 41 * 2.42;
            case MAP:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 48 * 2.42;
            case DAP:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 45 * 2.42;
            case Yoorin:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 18 * 2.42;
            case Fosfato_Arad:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 33 * 2.42;
            case Fosfato_Gafsa:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 29 * 2.42;
            case Fosfato_Daoui:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 32 * 2.42;
            case Fosf_Patos_Minas:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 24 * 2.42;
            case Escoria_de_Thomas:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 18.5 * 2.42;
            case Acido_Fosforico:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 52 * 2.42;
            case Multif_Magnesiano:
                return custoDoFosforoPorFonte * calculoDeEficienciaDaTranformacaoIdeal() / 18 * 2.42;
        }
        return 0.0;
    }

    public double calculoNutrienteResultanteCorrecao1(FonteDeFosforo fonteDoTeor) {
        switch (fonteDoTeor) {
            case Superfosfato_Simples:
                return  calculoDeEficienciaDaTranformacaoIdeal() * 0.10;
            case Yoorin:
                return  calculoDeEficienciaDaTranformacaoIdeal() / 18 * 0.15;
            case Multif_Magnesiano:
                return  calculoDeEficienciaDaTranformacaoIdeal() * 0.11;
        }
        return 0.0;
    }

    public String nomeNutrienteResultanteCorrecao1(FonteDeFosforo fonteDoTeor) {
        switch (fonteDoTeor) {
            case Superfosfato_Simples:
            case Yoorin:
                return  "enxofre";
            case Multif_Magnesiano:
                return "magnesio";
        }
        return "";
    }

    public double calculoNutrienteResultanteCorrecao2(FonteDeFosforo fonteDoTeor) {
        switch (fonteDoTeor) {
            case Superfosfato_Simples:
                return  calculoDeEficienciaDaTranformacaoIdeal() / 18 * 0.28;
            case Superfosfato_Triplo:
                return  calculoDeEficienciaDaTranformacaoIdeal() / 41 * 0.20;
            case MAP:
                return calculoDeEficienciaDaTranformacaoIdeal() / 48 * 0.09;
            case DAP:
                return  calculoDeEficienciaDaTranformacaoIdeal() / 45 * 0.16;
            case Yoorin:
                return calculoDeEficienciaDaTranformacaoIdeal() / 18 * 0.28;
            case Fosfato_Arad:
                return  calculoDeEficienciaDaTranformacaoIdeal() / 33 * 0.52;
            case Fosfato_Gafsa:
                return calculoDeEficienciaDaTranformacaoIdeal() / 29 * 0.52;
            case Fosfato_Daoui:
                return  calculoDeEficienciaDaTranformacaoIdeal() / 32 * 0.45;
            case Fosf_Patos_Minas:
                return calculoDeEficienciaDaTranformacaoIdeal() / 24 * 0.28;
            case Escoria_de_Thomas:
                return calculoDeEficienciaDaTranformacaoIdeal() / 18.5 * 0.44;
            case Acido_Fosforico:
                return  calculoDeEficienciaDaTranformacaoIdeal() / 52 * 0.00;
            case Multif_Magnesiano:
                return  calculoDeEficienciaDaTranformacaoIdeal() / 18 * 0.18;
        return 0.0;
    }}

    public String nomeNutrienteResultanteCorrecao2(FonteDeFosforo fonteDoTeor) {
        switch (fonteDoTeor) {
            case Superfosfato_Simples:
            case Superfosfato_Triplo:
            case Yoorin:
            case Fosfato_Arad:
            case Fosfato_Gafsa:
            case Fosfato_Daoui:
            case Fosf_Patos_Minas:
            case Escoria_de_Thomas:
            case Multif_Magnesiano:
                return "calcio";
            case MAP:
            case DAP:
                return "nitrogenio";
            case Acido_Fosforico:
                return "";
        }
        return "";
    }
}


