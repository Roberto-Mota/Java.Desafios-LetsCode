/*abstractEnunciado

Crie um programa que receba dois numeros como parametro e escreva todos os numeros do intervalo (ordem crescente) e tambem a soma.

    Entrada: 3 1
    Saida: 1, 2, 3 Soma: 5

    Entrada: 2 6
    Saida: 2,3,4,5,6 Soma: 20

NAO USAR: Collections, Arrays, metodos utilitarios sort
 */

public class Desafio11Concluido {
    public static void readAndSum(int num1, int num2) {
        Integer start;
        Integer end;

        if (num1 > num2) {
            start = num2;
            end = num1;

        } else if (num1 < num2) {
            start = num1;
            end = num2;

        } else {
            System.out.println("Os números são iguais");
            return;
        }

        Integer c = 0;
        for (int i = start; i <= end; i++) {
            c += i;
            if (i == end) {
                System.out.println(i + ".");
                System.out.println("Sum: " + c);
            } else {
                System.out.print(i + " -> ");
            }

        }

    }

}
