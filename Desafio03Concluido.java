import java.util.ArrayList;
import java.util.List;

public class Desafio03Concluido {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>(List.of("acbda", "fasdlkh", "poiwqd", "zxcqwtop", "qfgophl"));
        String[] input = new String[lista.size()];
        for (int i = 0; i < input.length; i++) {
            input[i] = lista.get(i);
        }

        Desafio03Concluido desafio = new Desafio03Concluido();
        String maiorOrdem = desafio.substring(input);
        System.out.println("Maior ordem: ");
        System.out.println(maiorOrdem);
    }

    public String substring(String[] lista) {
        ArrayList<String> listaArray = new ArrayList<>();

        for (int i = 0; i < lista.length; i++) {
            listaArray.add(lista[i]);
        }

        Character caracterAtual;
        Character caracterPosterior;
        ArrayList<String> maioresOrdens = new ArrayList<>();
        for (int p = 0; p < listaArray.size(); p++) {
            String palavra = listaArray.get(p);
            StringBuilder acumulador = new StringBuilder();
            StringBuilder maiorOrdem = new StringBuilder("");
            Boolean isSequence = false;
            for (int l = 0; l < palavra.length(); l++) {
                caracterAtual = palavra.charAt(l);
                try {
                    caracterPosterior = palavra.charAt(l + 1);
                } catch (IndexOutOfBoundsException e) {
                    if (isSequence && acumulador.length() >= maiorOrdem.length()) {
                        acumulador.append(caracterAtual);
                        maiorOrdem = acumulador;
                    }
                    maioresOrdens.add(maiorOrdem.toString());
                    break;
                }
                if ((caracterAtual.compareTo(caracterPosterior) <= 0)) {
                    acumulador.append(caracterAtual);
                    isSequence = true;
                } else {
                    acumulador.append(caracterAtual);
                    isSequence = false;
                }
                if (!isSequence) {
                    if (acumulador.length() > maiorOrdem.length()) {
                        maiorOrdem.delete(0, maiorOrdem.length());
                        maiorOrdem.append(acumulador);
                    }
                    acumulador.delete(0, acumulador.length());
                }
            }
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

// Dada uma lista de Strings, determine qual a maior sequ??ncia de letras em
// ordem alfab??tica crescente.

// Entrada:

// acbda, fasdlkh, poiwqd, zxcqwtop, qfgophl

// Sa??da:

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
// -1 e a anterior tamb??m ter dado -1 == ?? sequencia
// if (j != 0 && resultado == -1) { //Ponto, mas ?? sequ??ncia?
// indexComeco = j;
// while (resultado == -1 && resultadoAnterior == -1) {
// System.out.println("?? sequ??ncia!");
// indexFinal = j;
// resultado = caracter.compareTo(caracterPosterior);
// resultadoAnterior = resultado;
// // Posso talvez usar subString ou subsequence

// }

// // if (resultadoAnterior == -1) { //Sequencia cresce

// // } else if (resultadoAnterior != -1) { // J?? ?? outra sequ??ncia

// // }
// }

// }

// if ((caracter.compareTo(caracterPosterior) == -1)) { // Se for -1 significa
// que est?? na ordem alfab??tica
// //TODO: guardar essas duas letras em um novo array (criar um novo array de
// maiores ordens )

// }

// }
// // System.out.println("j: " + j + " -> Lista.get(i).length(): " +
// lista.get(i).length());
// // System.out.println();

// }

// // Copiei uma solu????o de contagem de booleanos em sequ??ncia:
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
