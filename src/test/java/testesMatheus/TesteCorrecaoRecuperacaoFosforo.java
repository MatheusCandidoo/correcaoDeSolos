/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testesMatheus;

import com.mycompany.app.constantes.FonteDeFosforo;
import com.mycompany.app.controller.CorrecaoDeFosforo;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author candido
 */
public class TesteCorrecaoRecuperacaoFosforo {
    
   @Test
   public void testeQuantidadeDeFosforoAplicar(){
       assertEquals(123.95, new CorrecaoDeFosforo(12, 8.59, FonteDeFosforo.Superfosfato_Simples, 70 ).quantidadeAplicarFosforo(), 0.1);
   }
   
   @Test
   public void testeCustoHectare(){
       assertEquals(156.18, new CorrecaoDeFosforo(12, 8.59, FonteDeFosforo.Superfosfato_Simples, 70).custoDeAplicacaoHectare(1260.0), 0.1);
   }
   
   @Test
   public void testeCorrecaoElementosExtras(){
       assertEquals("Enxofre: 12.395079365079367\nCálcio: 34.70622222222223", new CorrecaoDeFosforo(12, 8.59, FonteDeFosforo.Superfosfato_Simples, 70).calculoNutrienteResultanteCorrecao2(FonteDeFosforo.Superfosfato_Simples));
   }
}
