import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Desafio13Andamento {
    /*
     * Enunciado
     * 
     * Crie um programa para aplicar uma cadeia de descontos no total da compra.
     * 
     * Os descontos são:
     * 
     * Se comprar 15 itens ou mais, aplicar 10% de desconto.
     * Se comprar 10 itens e menos de 15 aplicar 8% de desconto.
     * Se comprar 5 itens e menos de 10 aplicar 5% de desconto.
     * Se comprar menos que 5 itens não aplicar desconto.
     * 
     * Ao aplicar o desconto encerre a cadeia de verificações.
     * Deixe o código aberto para que outros tipos de descontos sejam aplicados
     * futuramente.
     * 
     */
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner scanner = new Scanner(System.in);

        BigDecimal somaCarrinho = new BigDecimal(0);
        HashMap<String, BigDecimal> catalogoItens = new HashMap<>();
        catalogoItens.put("Scooter", new BigDecimal(875.29));
        catalogoItens.put("Geladeira", new BigDecimal(1810.99));
        catalogoItens.put("Forno", new BigDecimal(425.00));
        catalogoItens.put("Lixeira", new BigDecimal(42.20));
        catalogoItens.put("Chuveiro", new BigDecimal(64.00));
        catalogoItens.put("Caneca", new BigDecimal(19.75));
        catalogoItens.put("Cama Casal", new BigDecimal(1200.25));

        Integer itens = 0;
        while (true) {
            //TODO: fazer com que a lista sempre apareça e apenas as alterações (produto adicionado, etc, atualize)
            //TODO: Possibilidade de voltar a fazer as compras no carrinho depois de sair e checar o desconto
            listarProdutos(catalogoItens);
            String input = scanner.nextLine();
            if (catalogoItens.containsKey(input)) {
                somaCarrinho = somaCarrinho.add(catalogoItens.get(input));
                itens++;
                System.out.printf("Produto adicionado ao carrinho (Total: %d -> R$%.2f)\n", itens, somaCarrinho);
            } else if (input.isEmpty()) {
                break;
            } else {
                System.out.println("Produto não identificado, por favor, tente novamente");
            }

        }

        aplicarDesconto(itens, somaCarrinho);
        scanner.close();
    }

    public static void limparTela() throws InterruptedException, IOException {
                    //Limpar tela:
                    final String os = System.getProperty("os.name");
                    if (os.contains("Windows"))
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                    else
                        Runtime.getRuntime().exec("clear");
    }

    public static void aplicarDesconto(Integer itens, BigDecimal somaCarrinho) {
        System.out.println("Valor final no carrinho:");
        if (itens < 5) {
            System.out.println(somaCarrinho);
        } else if (itens >= 5 && itens < 10) {
            System.out.println("Desconto de 5% aplicado.");
            somaCarrinho = somaCarrinho.multiply(new BigDecimal(0.95));

        } else if (itens >= 10 && itens < 15) {
            System.out.println("Desconto de 8% aplicado.");
            somaCarrinho = somaCarrinho.multiply(new BigDecimal(0.92));

        } else if (itens >= 15) {
            System.out.println("Desconto de 10% aplicado.");
            somaCarrinho = somaCarrinho.multiply(new BigDecimal(0.90));
        }
        System.out.printf("Programa encerrado, valor final: R$%.2f", somaCarrinho);
    }

    public static void listarProdutos(HashMap<String, BigDecimal> catalogoItens) {
        System.out.println(
                "Selecione um item do catálogo (Escrevendo o nome do produto) para adicionar ao seu carrinho:");
        for (String item : catalogoItens.keySet()) {
            BigDecimal valor = catalogoItens.get(item);
            System.out.printf("%15s: R$%.2f\n", item, valor);
        }
        System.out.println("Para checar valor final do carrinho, pressione ENTER");
    }
}
