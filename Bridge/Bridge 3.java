// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SegurancaTest {
    SegurancaTest() {
   }

   @Test
   void deveRetornarSalarioSegurancaComEnsinoMedio() {
      Escolaridade escolaridade = new EnsinoMedio();
      Seguranca seguranca = new Seguranca(50.0F);
      seguranca.setEscolaridade(escolaridade);
      seguranca.setNumAulas(2);
      Assertions.assertEquals(100.0F, seguranca.calcularSalario(), 0.01F);
   }

   @Test
   void deveRetornarSalarioSegurancaComGraduacao() {
    Seguranca seguranca = new Graduacao();
    Seguranca seguranca = new Seguranca(50.0F);
    seguranca.setEscolaridade(escolaridade);
    seguranca.setNumAulas(2);
      Assertions.assertEquals(110.0F, cliente.calcularSalario(), 0.01F);
   }

   @Test
   void deveRetornarSalarioSegurancaComMestrado() {
      Escolaridade escolaridade = new Mestrado();
      Seguranca seguranca = new Seguranca(50.0F);
      Seguranca.setEscolaridade(escolaridade);
      Seguranca.setNumAulas(2);
      Assertions.assertEquals(120.0F, seguranca.calcularSalario(), 0.01F);
   }

   @Test
   void deveRetornarSalarioSegurancaComDoutorado() {
      Escolaridade escolaridade = new Doutorado();
      Seguranca seguranca = new Seguranca(50.0F);
      seguranca.setEscolaridade(escolaridade);
      seguranca.setNumAulas(2);
      Assertions.assertEquals(130.0F, seguranca.calcularSalario(), 0.01F);
   }
}
