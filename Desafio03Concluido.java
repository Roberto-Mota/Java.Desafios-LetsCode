import java.util.ArrayList;
import java.util.List;

/**
 * Desafio03
 */
public class Desafio03Concluido {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(List.of("a", "acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"));
        String maiorOrdem = organizar(lista);
        System.out.println();
        System.out.println("Organização completa, maior ordem:");
        System.out.println(maiorOrdem);
    }

    // Tá listando as strings de forma adequada, porém as comparações estão completamente errôneas.
    public static String organizar(ArrayList<String> lista) {
        Character caracterAtual;
        Character caracterPosterior;
        ArrayList<String> maioresOrdens = new ArrayList<>();
        for (int p = 0; p < lista.size(); p++) {
            String palavra = lista.get(p);
            System.out.println();
            System.out.println("----------------------------");
            System.out.println("Checar palavra: " + palavra);
            if (p == 3) {
                System.out.println("aqui");
            }

            StringBuilder acumulador = new StringBuilder();
            StringBuilder maiorOrdem = new StringBuilder("");

            Boolean isSequence = false;
            for (int l = 0; l < palavra.length(); l++) {
                caracterAtual = palavra.charAt(l);
                System.out.print("Char Atual e Posterior: " + caracterAtual);

                try {
                    caracterPosterior = palavra.charAt(l + 1);
                    System.out.print(" - " + caracterPosterior);
                } catch (IndexOutOfBoundsException e) {
                    // TODO: Não tem posterior para comparar, encerrar comparação
                    if(isSequence && acumulador.length() >= maiorOrdem.length()) {
                        acumulador.append(caracterAtual);
                        maiorOrdem = acumulador;
                    }
                    maioresOrdens.add(maiorOrdem.toString());
                    break;
                }
                if ((caracterAtual.compareTo(caracterPosterior) <= 0)) { // True: está na ordem alfabética
                    // TODO: guardar a proxima letra em um novo array (criar um novo array de
                    // maiores ordens)
                    acumulador.append(caracterAtual);
                    System.out.println(" (Sequencia!)");
                    isSequence = true;

                    // maiorOrdem.concat(caracterAtual);
                } else { // Não está em ordem
                         // TODO: acumular as letras e sobrescrever a array da maior ordem, caso seja
                         // maior
                         // Pra adicionar a primeira letra da ordem (que nao foi incluida), usar um
                         // String.find e alocar a primeira (ou vice-versa)
                         System.out.println();
                    acumulador.append(caracterAtual);
                    isSequence = false;
                }

                if (!isSequence) {
                    if (acumulador.length() > maiorOrdem.length()) {
                        System.out.println("O acumulador: " + acumulador.toString());
                        maiorOrdem.delete(0, maiorOrdem.length());
                        maiorOrdem.append(acumulador);
                    } 
                    acumulador.delete(0, acumulador.length());
                   // System.out.println("Nova maior ordem: " + maiorOrdem.toString());
                }

            }
            System.out.println();
            System.out.println("Maior ordem dessa palavra: " + maiorOrdem.toString());

        }
        String maiorOrdemTotal = "";
        for (String string : maioresOrdens) {
            if (string.length() > maiorOrdemTotal.length()) {
                maiorOrdemTotal = string;
            }
        }
        return maiorOrdemTotal;
    }

}

// /*
// * Enunciado
// Enunciado

// Dada uma lista de Strings, determine qual a maior sequência de letras em
// ordem alfabética crescente.

// Entrada:

// acbda, fasdlkh, poiwqd, zxcqwtop, qfgophl

// Saída:

// fgop
// */

// public class Desafio03 {
// public static void main(String[] args) {
// ArrayList<String> lista = new ArrayList<>(List.of("acbda", "fasdlkh",
// "poiwqd", "zxcqwtop", "qfgophl"));

// Integer resultado = 0;
// Integer resultadoAnterior = 0;
// Integer indexComeco = 0;
// Integer indexFinal = 0;
// for (int i = 0; i < lista.size(); i++) { //Pra cada String

// Integer maiorSequencia = 0;
// for (int j = 0; j < lista.get(i).length(); j++) { //Pra cada caracter da
// String
// Character caracter = lista.get(i).charAt(j);
// Character caracterPosterior = lista.get(i).charAt(j+1);
// if (j+1 <= lista.get(i).length() - 1) { //Evitar
// ArrayIndexOutOfBoundsException

// System.out.println("compare: " + caracter + " com " + caracterPosterior + ":
// " + caracter.compareTo(caracterPosterior));
// // Se for a primeira checagem pula, mas se for da segunda pra diante, se der
// -1 e a anterior também ter dado -1 == é sequencia
// if (j != 0 && resultado == -1) { //Ponto, mas é sequência?
// indexComeco = j;
// while (resultado == -1 && resultadoAnterior == -1) {
// System.out.println("É sequência!");
// indexFinal = j;
// resultado = caracter.compareTo(caracterPosterior);
// resultadoAnterior = resultado;
// // Posso talvez usar subString ou subsequence

// }

// // if (resultadoAnterior == -1) { //Sequencia cresce

// // } else if (resultadoAnterior != -1) { // Já é outra sequência

// // }
// }

// }

// if ((caracter.compareTo(caracterPosterior) == -1)) { // Se for -1 significa
// que está na ordem alfabética
// //TODO: guardar essas duas letras em um novo array (criar um novo array de
// maiores ordens )

// }

// }
// // System.out.println("j: " + j + " -> Lista.get(i).length(): " +
// lista.get(i).length());
// // System.out.println();

// }

// // Copiei uma solução de contagem de booleanos em sequência:
// // boolean[] input = {true, false, false, true, true, false};

// // int count = 0;

// // List<Integer> output = new ArrayList<>();

// // for (int i = 0; i < input.length; i++) {
// // if (input[i]) {
// // count++;
// // } else {
// // if (count > 0) {
// // output.add(count);
// // }
// // count = 0;
// // }

// // if (i == input.length - 1 && count > 0) {
// // output.add(count);
// // }
// // }

// // System.out.println(output);

// }
// }
