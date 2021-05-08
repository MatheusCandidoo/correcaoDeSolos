/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesMatheus;

import com.mycompany.app.controller.ControleDeQualidade;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author candido
 */
public class TesteTexturaSolo {
    
    @Test
    public void testeSoloArgiloso(){
        assertEquals(9.0, new ControleDeQualidade().controleDeQualidade("fosforo", 1), 0);
        assertEquals(0.35, new ControleDeQualidade().controleDeQualidade("potassio", 1), 0);
        assertEquals(6.0, new ControleDeQualidade().controleDeQualidade("calcio", 1), 0);
        assertEquals(1.5, new ControleDeQualidade().controleDeQualidade("magnesio", 1), 0);
        assertEquals(9.0, new ControleDeQualidade().controleDeQualidade("enxofre", 1), 0);
        assertEquals(0.0, new ControleDeQualidade().controleDeQualidade("aluminio", 1), 0);
        assertEquals(0.0, new ControleDeQualidade().controleDeQualidade("hal", 1), 0);
    }
    
    @Test
    public void testeSoloTexturaMedia(){
        assertEquals(12.0, new ControleDeQualidade().controleDeQualidade("fosforo", 2), 0);
        assertEquals(0.25, new ControleDeQualidade().controleDeQualidade("potassio", 2), 0);
        assertEquals(4.0, new ControleDeQualidade().controleDeQualidade("calcio", 2), 0);
        assertEquals(1.0, new ControleDeQualidade().controleDeQualidade("magnesio", 2), 0);
        assertEquals(6.0, new ControleDeQualidade().controleDeQualidade("enxofre", 2), 0);
        assertEquals(0.0, new ControleDeQualidade().controleDeQualidade("aluminio", 2), 0);
        assertEquals(0.0, new ControleDeQualidade().controleDeQualidade("hal", 2), 0);
    }
    
}
