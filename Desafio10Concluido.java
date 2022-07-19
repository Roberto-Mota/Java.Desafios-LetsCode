import java.util.ArrayList;
import java.util.Collections;
import java.lang.Integer;

/*
 * Enunciado
Crie um programa que recebe duas listas de números separadas por vírgula.
Criar uma terceira lista para unir as duas listas recebidas,
 eliminando os itens repetidos. Imprimir a lista final em ordem decrescente.
Entrada:
    Lista 1 => 1,2,3,4
    Lista 2 => 2,5
    Saida: 5,4,3,2,1
 */

public class Desafio10Concluido {
    public static void main(String[] args) {
        CommaSeparator.organize("1,2,3,4", "2,5");
    }

    public static class CommaSeparator {
        public static void organize(String list1, String list2) {
            String[] listArray1 = list1.split(",");
            String[] listArray2 = list2.split(",");

            ArrayList<Integer> listaFinal = new ArrayList<>();

            for (int i = 0; i < listArray1.length; i++) {
                try {
                    if (!listaFinal.contains(Integer.valueOf(listArray1[i]))) {
                    listaFinal.add(Integer.valueOf(listArray1[i]));
                    }
                } catch (Exception e) {
                    // NaN, shouldn't be added.
                }
            }
            for (int i = 0; i < listArray2.length; i++) {
                try {

                    if (!listaFinal.contains(Integer.valueOf(listArray2[i]))) {
                        listaFinal.add(Integer.valueOf(listArray2[i]));
                    }
                } catch (Exception e) {
                    // NaN, shouldn't be added.
                }
            }
            listaFinal.sort((Integer num1, Integer num2) -> num1.compareTo(num2));
            Collections.reverse(listaFinal);
            System.out.println(listaFinal);
        }
    }
}