import java.util.ArrayList;

/*
 * Enunciado

Inverter numeros

Uma empresa do ramo de fotografia lhe contratou para criar um aplicativo para desfazer o erro de um dos funcionários.
 O almoxarifado desta empresa continha milhares de arquivos fotográficos, cada um com seu código numérico.
  No entanto este código estava escrito em fotolito (uma lâmina transparente). O fato de estar transparente causou
   uma confusão tal que todos os códigos numéricos foram armazenados invertidos no banco de dados.Você,
    como desenvolvedor Java, precisa criar um programa que reverta o código numérico para seu estado original.

ENTRADA 1 98765

SAIDA 1 56789

Entrada 2 -8674

SAIDA 2 -4768

Os códigos variam de -2^31 a 2^31-1
 */

public class Desafio02 {
    public static void main(String[] args) {
        Solucao.inverter(1234);
    }

    public static class Solucao {
        public static int inverter(int numero) {
   
        String numeroString = String.valueOf(numero);

        ArrayList<Character> numeroOrdenado = new ArrayList<>();
        if (numeroString.startsWith("-")) {
            numeroOrdenado.add(numeroString.charAt(0));
            numeroString = numeroString.substring(1);
        }
        for (int i = numeroString.length() -1; i >= 0; i--) {
            numeroOrdenado.add(numeroString.charAt(i));
        }
        numeroString = String.valueOf(numeroOrdenado);

        StringBuilder builder = new StringBuilder(numeroOrdenado.size());
        for(Character ch: numeroOrdenado)
        {
            builder.append(ch);
        }
        System.out.println(builder);
        
        return (Integer.parseInt(builder.toString()));
        }
    }
}
