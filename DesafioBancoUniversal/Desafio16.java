package DesafioBancoUniversal;
/*
 * O Banco Universal deseja expandir sua área de atuação para oferecer mais opções de investimentos para seus clientes. Para oferecer os produtos de investimento corretos para seus clientes, o banco categorizou os clientes de acordo com seus perfis: Conservador, Arrojado ou Moderado. Assim, por exemplo, o perfil conversador deve adicionar em carteira apenas o tipo Renda Fixa.

Observe o diagrama a seguir

(diagramaDesafio.png na pasta Downloads)

Com base no diagrama e no código a seguir, defina a classe abstrata Cliente e as classes-filhas ClienteConservador e ClienteArrojado de forma a fazer o código funcionar. Observe para cumprir a regra de só poder adicionar os produtos de acordo com o perfil do cliente. Caso contrário, deve ocorrer erro de compilação se tentar adicionar um tipo de investimento diferente do previsto para ao perfil do cliente.

public static void main(String[] args) {
    var conservador = new ClienteConservador();
//método contratarInvestimento adiciona na lista de investimentos do cliente
    conservador.contratarInvestimento(new CDB());
    conservador.contratarInvestimento(new Tesouro());

        conservador.contratarInvestimento(new Acao());//ERRO de compilação
        for (Investimento i : conservador.getCarteiraInvestimentos()) {
        System.out.println(i);
    }

    var arrojado = new ClienteArrojado();
    arrojado.contratarInvestimento(new Acao());
    arrojado.contratarInvestimento(new FundoImobiliario());

    arrojado.contratarInvestimento(new Tesouro());//ERRO de compilação
        for (Investimento i : arrojado.getCarteiraInvestimentos()) {
        System.out.println(i);
    }
}


 * 
 */

public class Desafio16 {
   
}
