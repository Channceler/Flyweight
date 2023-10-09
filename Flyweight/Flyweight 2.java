// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.flyweight;

public class Cliente {
   private String nome;
   private Cidade cidadeResidencia;

   public Cliente(String nome, Cidade cidadeResidencia) {
      this.nome = nome;
      this.cidadeResidencia = cidadeResidencia;
   }

   public String obterCliente() {
      String var10000 = this.nome;
      return "Cliente{nome='" + var10000 + "', cidade='" + this.cidadeResidencia.getNome() + "', uf='" + this.cidadeResidencia.getUf() + "'}";
   }
}
