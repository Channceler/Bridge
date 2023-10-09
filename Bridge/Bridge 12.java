// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.bridge;

public class Seguranca extends Cargo {
   private int numHoras;

   public Seguranca(float salarioBase) {
      super(salarioBase);
   }

   public void setNumHoras(int numHoras) {
      this.numHoras = numHoras;
   }

   public float calcularSalario() {
      return this.salarioBase * (float)this.numHoras * (1.0F + this.escolaridade.percentualAumento());
   }
}
