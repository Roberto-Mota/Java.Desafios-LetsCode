import java.math.BigDecimal;

/*
 * Enunciado

Dado um array de inteiros e um número de combinaçoes, encontre a maior combinaçao de números vizinhos.

Ex. 1:

ENTRADA
array: {15,30,100,50,23}
numero: 3

SAIDA
180, porque a maior combinacao de números 3 seguidos é 30,100 e 50

Ex. 2:
ENTRADA
array: {1000,1,500,600,100}
numero: 2

SAIDA
1110, porque a maior combinacao de números 2 seguidos é 500 e 600

Ex. 3:
ENTRADA
array: {1000,1,500,600,100}
numero: 10

SAIDA
-1, porque nao ha elementos suficientes no array

Complexidade de tempo requerida: O(n)

Restriçoes:
Nao utilizar usar Collections
Nao utilizar loops aninhados (for dentro de for, ou recursoes dentro de loops). Somente O(n) é aceitável.
// A resposta tá no substring
 */

public class Desafio06 {
    public static void main(String[] args) {
        {

            // Get N
            int N = 5, sum = 0;

            // Input values of an array
            int array[] = { 1, 2, 3, 4, 5 };

            // Find the sum
            sum = Desafio06.operate(array, N);

            // Print the sum
            System.out.print(sum);
        }
        // maximoCombinacoes();
    }

    private static int operate(int array[], int N) {
        int sum = 0, index = 0;
        while (true) {
            sum += array[index++];
            if (index < N) {
                continue;
            } else {
                break;
            }
        }

        // return the sum
        return sum;
    }

    // public static int maximoCombinacoes(int array[], int num) {
    // for (int i = 0; i < array.length; i++) {

    // String numeroString = String.valueOf(array[1]);
    // numeroString.substring(i, num);
    // BigDecimal teste = new BigDecimal(10);

    // //Posso utilizar o Substring talvez -?-

    // }

    // }
}
