package com.mycompany.app.controller;

public class ControleDeQualidade {

    public double controleDeQualidade(String elemento, double texturaDoSolo) {
        switch (elemento) {
            case "fosforo":
                if (texturaDoSolo == 1) {
                    return 9.0;
                } else if (texturaDoSolo == 2) {
                    return 12.0;
                }
                return 0.0;

            case "potassio":
                if (texturaDoSolo == 1) {
                    return 0.35;
                } else if (texturaDoSolo == 2) {
                    return 0.25;
                }
                return 0.0;

            case "calcio":
                if (texturaDoSolo == 1) {
                    return 6.0;
                } else if (texturaDoSolo == 2) {
                    return 4.0;
                }
                return 0.0;

            case "magnesio":
                if (texturaDoSolo == 1) {
                    return 1.5;
                } else if (texturaDoSolo == 2) {
                    return 1.0;
                }
                return 0.0;

            case "enxofre":
                if (texturaDoSolo == 1) {
                    return 9.0;
                } else if (texturaDoSolo == 2) {
                    return 6.0;
                }
                return 0.0;
            case "aluminio":
                return 0.0;

        }
        return 0.0;

    }

}
