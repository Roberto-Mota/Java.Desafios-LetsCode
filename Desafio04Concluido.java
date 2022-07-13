/*
 * Enunciado

Una dois arrays de inteiros em um único array
Regras: - Não é permitido uso de Collections ou java.util.Arrays
 - Não é permitido uso de arrays temporários, com exceção do arrayConsolidado
 
 Ex.: ENTRADA [1, 3, 5, 7] [2, 4, 6, 8, 12, 15]
SAIDA [1, 2, 3, 4, 5, 6, 7, 8, 12, 15]

public void juntarArrays(int[] array1, int[] array2, 
    int[] arrayConsolidado) {

}


 */

public class Desafio04Concluido {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5, 7};
        int[] array2 = {2, 4, 6, 8, 12, 15};
        int[] arrayConsolidado = new int[0];

        
        juntarArrays(array1, array2, arrayConsolidado);

    }

    public static void juntarArrays(int[] array1, int[] array2, int[] arrayConsolidado) {

        arrayConsolidado = new int[array1.length + array2.length];
        int i = 0;
        Boolean array1IsNotEmpty = true;
        Boolean array2IsNotEmpty = true;

        while (array1IsNotEmpty && array2IsNotEmpty) {
            if (i > array1.length) {
                array1IsNotEmpty = false;
                break;
            } else if (i > array2.length) {
                array2IsNotEmpty = false;
                break;
            }
            if (array1[i] < array2[i]) {
                arrayConsolidado[i] = array1[i];
                arrayConsolidado[i+1] = array2[i];
                i += 2; 
            } else {
                arrayConsolidado[i] = array2[i];
                arrayConsolidado[i+1] = array1[i];
                i += 2;
            }
            
        }
        while (array1IsNotEmpty) {
            arrayConsolidado[i] = array1[i];
            i++;
            if (array1[i] + 1 == array1.length) {
                array1IsNotEmpty = false;
            }
        }
        while (array2IsNotEmpty) {

            arrayConsolidado[i] = array2[i];
            i++;
            if (array2[i] + 1 == array1.length) {
                array1IsNotEmpty = false;
            }
        }

        for (int item : arrayConsolidado) {
            System.out.println(item);
        }
    }
}
