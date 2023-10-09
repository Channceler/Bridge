// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.bridge;

public abstract class Cargo {
   protected Escolaridade escolaridade;
   protected float salarioBase;

   public Cargo(float salarioBase) {
      this.salarioBase = salarioBase;
   }

   public void setEscolaridade(Escolaridade escolaridade) {
      this.escolaridade = escolaridade;
   }

   public void setSalarioBase(float salarioBase) {
      this.salarioBase = salarioBase;
   }

   public abstract float calcularSalario();
}
