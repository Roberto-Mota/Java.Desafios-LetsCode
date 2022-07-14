public class Desafio09 {
    public static void main(String[] args) {
        System.out.println(threeX("frdts2XXX6xxbl2XXXeee5"));
    }

    public static Boolean threeX(String string) {
        string = string.toLowerCase();
        while (string.contains("xxx")) {
            Integer index = string.indexOf("xxx");
            String parte = string.substring(index -1, index + 4);

            if(Character.isDigit(parte.charAt(0)) && Character.isDigit(parte.charAt(4))){
                Integer valor1 = Integer.valueOf(parte.substring(0, 1));
                Integer valor2 = Integer.valueOf(parte.substring(4, 5));
                if (valor1 + valor2 == 8) {
                    return true; 
                }
            }
            string = string.replaceFirst("xxx", "");
            }
            return false;
        }
    }

    /*
 * Enunciado

Escreva um algoritmo que receba um parâmetro String.

    Verificar se há 3 letras "X" em sequência entre dois números que somam 8.

Exemplo: frdts2XXX6xxbl2XXXeee5

Retorna true pois a String possui a combinação "2XXX6" (Sequencia de 3 "X" entre os números 6 e 2 que somam 8).

 */
    

