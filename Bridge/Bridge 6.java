// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.bridge;

public class Coordenador extends Cargo {
   public Coordenador(float salarioBase) {
      super(salarioBase);
   }

   public float calcularSalario() {
      return this.salarioBase * (1.0F + this.escolaridade.percentualAumento());
   }
}
