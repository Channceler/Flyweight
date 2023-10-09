// Source code is decompiled from a .class file using FernFlower decompiler.
package padroesestruturais.flyweight;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BancoTest {
   BancoTest() {
   }

   @Test
   void deveRetornarCliente() {
      Banco banco = new Banco();
      banco.conta("Jose", "Juiz de Fora", "MG");
      banco.conta("Maria", "Juiz de Fora", "MG");
      banco.conta("Ana", "Juiz de Fora", "MG");
      banco.conta("Joao", "Santos Dumont", "MG");
      List<String> saida = Arrays.asList("Cliente{nome='Jose', cidade='Juiz de Fora', uf='MG'}", "Cliente{nome='Maria', cidade='Juiz de Fora', uf='MG'}", "Cliente{nome='Ana', cidade='Juiz de Fora', uf='MG'}", "Cliente{nome='Joao', cidade='Santos Dumont', uf='MG'}");
      Assertions.assertEquals(saida, banco.obterCliente());
   }

   @Test
   void deveRetornarTotalCidades() {
      Banco banco = new Banco();
      banco.matricular("Jose", "Juiz de Fora", "MG");
      banco.matricular("Maria", "Juiz de Fora", "MG");
      banco.matricular("Ana", "Juiz de Fora", "MG");
      banco.matricular("Joao", "Santos Dumont", "MG");
      Assertions.assertEquals(2, CidadeFactory.getTotalCidades());
   }
}
