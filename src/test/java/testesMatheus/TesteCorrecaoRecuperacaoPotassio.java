/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesMatheus;

import com.mycompany.app.controller.CorrecaoDePotassio;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author candido
 */
public class TesteCorrecaoRecuperacaoPotassio {
    
    @Test
    public void testeParticipacaoAtualDoPotassioNoSolo(){
        assertEquals(1.1636927851047323, new CorrecaoDePotassio(0.15, 5.76, 1.63, 5.35).participacaoAtualDoPotassio(), 0.0);
    }
    
    @Test
    public void testeQuantidadeAplicar(){
        assertEquals(0.2367, new CorrecaoDePotassio(0.15, 5.76, 1.63, 5.35, 3.0, 1).calculoNecessidadePotassioEmDecimetroCubico(), 0.0);
        assertEquals(92.5497, new CorrecaoDePotassio(0.15, 5.76, 1.63, 5.35, 3.0, 1).calculoNecessidadePotassioEmMiligrama(), 0.0);
        assertEquals(185.0994, new CorrecaoDePotassio(0.15, 5.76, 1.63, 5.35, 3.0, 1).calculaNecessidadeDePotassioEmKilogramaPorHectare(), 0.0);
        assertEquals(222.11928, new CorrecaoDePotassio(0.15, 5.76, 1.63, 5.35, 3.0, 1).calculaNecessidadedeOxidoDePotassio(), 0.0);
        assertEquals(261.3168, new CorrecaoDePotassio(0.15, 5.76, 1.63, 5.35, 3.0, 1).calculaOxidoDePotassioConsiderandoEficiencia(85.0), 0.0);
        assertEquals(450.5462068965517, new CorrecaoDePotassio(0.15, 5.76, 1.63, 5.35, 3.0, 1).calculoAplicacaoDePotassioPorHectare(), 0.0);
    }
    
    @Test
    public void testeCustoPorHectare(){
        assertEquals(1126.37, new CorrecaoDePotassio(0.15, 5.76, 1.63, 5.35, 3.0, 1).calculaCustoAplicacaoPorHectare(2500.0), 0.1);
    }
    
}
