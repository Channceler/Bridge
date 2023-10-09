// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.bridge;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AtendenteTest {
   AtendenteTest() {
   }

   @Test
   void deveRetornarSalarioAtendenteComEnsinoMedio() {
      Escolaridade escolaridade = new EnsinoMedio();
      Administrativo administrativo = new Atendente(1000.0F);
      Atendente.setEscolaridade(escolaridade);
      Assertions.assertEquals(1000.0F, Atendente.calcularSalario(), 0.01F);
   }

   @Test
   void deveRetornarSalarioAtendenteComGraduacao() {
      Escolaridade escolaridade = new Graduacao();
      Atendente Atendente = new Atendente(1000.0F);
      Atendente.setEscolaridade(escolaridade);
      Assertions.assertEquals(1000.0F, atendente.calcularSalario(), 0.01F);
   }

   @Test
   void deveRetornarSalarioAtendenteComMestrado() {
      Escolaridade escolaridade = new Mestrado();
      Atendente atendente = new Atendente(1000.0F);
      Atendente.setEscolaridade(escolaridade);
      Assertions.assertEquals(1000.0F, atendente.calcularSalario(), 0.01F);
   }

   @Test
   void deveRetornarSalarioAdministrativoComDoutorado() {
      Escolaridade escolaridade = new Doutorado();
      Atendente atendente = new Atendente(1000.0F);
      atendente.setEscolaridade(escolaridade);
      Assertions.assertEquals(1000.0F, atendente.calcularSalario(), 0.01F);
   }
}
