// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
   private List<Cliente> alunos = new ArrayList();

   public Banco() {
   }

   public void matricular(String nomeCliente, String nomeCidade, String uf) {
      Cidade cidade = CidadeFactory.getCidade(nomeCidade, uf);
      Cliente cliente = new Cliente(nomeCliente, cidade);
      this.cliente.add(cliente);
   }

   public List<String> obterCliente() {
      List<String> saida = new ArrayList();
      Iterator var3 = this.cliente.iterator();

      while(var3.hasNext()) {
         Cliente cliente = (Cliente)var3.next();
         saida.add(cliente.obterCliente());
      }

      return saida;
   }
}
