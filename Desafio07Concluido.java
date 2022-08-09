import javax.management.openmbean.InvalidKeyException;

/*
 * Questão #1

Dado um array de números inteiros ordenados e um numero alvo, retorne os índices do array que correspondem a soma do número alvo.

Entrada:
array: {2,4,7,8,12}
alvo: 9

Saída:
{0, 2}

Porque o índice 0 contém 2 e o índice 2 contém 7. 2+7=9
 */

public class Desafio07Concluido {

    public static void main(String[] args) {
        int[] nums = {5, 2, 8, 4, 9, 1, 7};
        int[] resultado = Solucao.somaDois(nums, 14);
        for (int i : resultado) {
            System.out.println(i);
        }
    }

    public static class Solucao {
         public static int[] somaDois(int[] nums, int alvo) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == alvo && !(i == (nums.length -1))) {
                        System.out.println("Achou: " + nums[i] + " + " + nums[j] + " == " + alvo);
                         int[] retorno = {i, j};
                         return retorno;
                    } else {
                        System.out.println("Calculou: " + nums[i] + " + " + nums[j] + " == " + (nums[i] + nums[j]));
                    }
                }
            }
            throw new InvalidKeyException("Não existe soma de dois valores que resulte no alvo");
        }
    }
}


//  List<Integer> numbers = new ArrayList<Integer>();
// for (Integer integer : nums) {
//     numbers.add(integer);

//     int result = numbers
//     .stream()
//     .reduce(0, (subtotal, element) -> subtotal + element);
    
//     //assertThat(result).isEqualTo(21);
// }

// https://www.baeldung.com/java-stream-reduce
