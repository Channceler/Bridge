// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GerenteTest {
    GerenteTest() {
   }

   @Test
   void deveRetornarSalarioGerenteComEnsinoMedio() {
      Escolaridade escolaridade = new EnsinoMedio();
      Gerente gerente = new Gerente(2000.0F);
      gerente.setEscolaridade(escolaridade);
      Assertions.assertEquals(2000.0F, gerente.calcularSalario(), 0.01F);
   }

   @Test
   void deveRetornarSalarioGerenteComGraduacao() {
      Escolaridade escolaridade = new Graduacao();
      Gerente gerente = new Gerente(2000.0F);
      gerente.setEscolaridade(escolaridade);
      Assertions.assertEquals(2200.0F, gerente.calcularSalario(), 0.01F);
   }

   @Test
   void deveRetornarSalarioGerenteComMestrado() {
      Escolaridade escolaridade = new Mestrado();
      Gerente gerente = new Gerente(2000.0F);
      gerente.setEscolaridade(escolaridade);
      Assertions.assertEquals(2400.0F, gerente.calcularSalario(), 0.01F);
   }

   @Test
   void deveRetornarSalarioGerenteComDoutorado() {
      Escolaridade escolaridade = new Doutorado();
      Gerente gerente = new Gerente(2000.0F);
      gerente.setEscolaridade(escolaridade);
      Assertions.assertEquals(2600.0F, Gerente.calcularSalario(), 0.01F);
   }
}
