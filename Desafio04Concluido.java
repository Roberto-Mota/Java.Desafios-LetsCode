public class Desafio04Concluido {
    public static void main(String[] args) {
        int[] array1 = { 1, 3, 5, 7 };
        int[] array2 = { 2, 4, 6, 8, 12, 15 };
        int[] arrayConsolidado = new int[0];
        juntarArrays(array1, array2, arrayConsolidado);
    }
    
    public static void juntarArrays(int[] array1, int[] array2, int[] arrayConsolidado) {

        arrayConsolidado = new int[array1.length + array2.length];
        int i = 0;
        int a = 0;
        int b = 0;
        Boolean array1IsNotEmpty = true;
        Boolean array2IsNotEmpty = true;

        while (array1IsNotEmpty && array2IsNotEmpty) {
            if (a >= array1.length) {
                array1IsNotEmpty = false;
                break;
            } else if (b >= array2.length) {
                array2IsNotEmpty = false;
                break;
            }
            if (array1[a] < array2[b]) {
                arrayConsolidado[i++] = array1[a++];
            } else if (array1[a] > array2[b]) {
                arrayConsolidado[i++] = array2[b++];
            } else {
                arrayConsolidado[i++] = array2[b++];
                arrayConsolidado[i++] = array1[a++];
            }
        }
        while (array1IsNotEmpty) {
            arrayConsolidado[i++] = array1[a++];
            if (a >= array1.length) {
                array1IsNotEmpty = false;
            }
        }
        while (array2IsNotEmpty) {
            arrayConsolidado[i++] = array2[b++];
            if (b >= array2.length) {
                array2IsNotEmpty = false;
            }
        }
        for (int item : arrayConsolidado) {
            System.out.println(item);
        }
    }
}

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

