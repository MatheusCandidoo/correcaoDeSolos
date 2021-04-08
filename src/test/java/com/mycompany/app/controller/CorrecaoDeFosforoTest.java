package com.mycompany.app.controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class CorrecaoDeFosforoTest {


    @Test
    public void quantidadeAplicarFosforo() {
        CorrecaoDeFosforo correcaoDeFosforo = new CorrecaoDeFosforo(1.0,2.0,2,1.0);
        assertEquals(1,correcaoDeFosforo.quantidadeAplicarFosforo());
    }
}