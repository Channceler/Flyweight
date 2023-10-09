// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CidadeFactory {
   private static Map<String, Cidade> cidades = new HashMap();

   public CidadeFactory() {
   }

   public static Cidade getCidade(String nome, String uf) {
      Cidade cidade = (Cidade)cidades.get(nome);
      if (cidade == null) {
         cidade = new Cidade(nome, uf);
         cidades.put(nome, cidade);
      }

      return cidade;
   }

   public static int getTotalCidades() {
      return cidades.size();
   }
}