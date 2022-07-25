package Desafio12Mensageria;
/**
 * Desafio12
 * 
//Crie uma estrutura de classes para simular o envio de uma mensagem por e-mail, mas, antes de enviar a mensagem, disponibilizar diversos tipos de formatações. A mensagem pode ser enviada com nenhuma, uma ou mais de uma das seguintes formatações

    Formatar tudo em maiúsculo
    Formatar tudo em minúsculo
    Formatar em camelCase
    Remover acentuação

 {
    
}
 */
public class Desafio12 {
    public static void main(String[] args) {
        Mensagem msg = new Mensagem();
        msg.sendMessage("téste", "teste", Formatacao.MAIUSCULO);
    }


}

//TODO: Função que recebe 3 parametros: mensagem, e-mail, formatação (sobrescrita de sem formatação)
