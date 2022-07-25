package Desafio12Mensageria;

import java.text.Normalizer;

public class Mensagem {

    public void sendMessage(String message, String email) {

        System.out.printf("Mensagem enviada para %s: \n %s", email, message);
    }

    public void sendMessage(String message, String email, Formatacao formatacao) {
        message = messageFormat(message, formatacao);
        System.out.printf("Mensagem enviada para %s: \n %s", message, email);
    }

    private String messageFormat(String message, Formatacao formatacao) {
        switch (formatacao) {
            case REMOVEACCENTS:
                message = Normalizer.normalize(message, Normalizer.Form.NFD);
                message = message.replaceAll("[^\\p{ASCII}]", "");
                // If the text is in unicode, should use this instead:
                // string = string.replaceAll("\\p{M}", "");
                return message;

            case CAMELCASE:
                // TODO: While com (Achar espaço, pegar o proximo caracter, colocar como uppercase e
                // colocar no lugar do espaço)
                return message;

            case MAIUSCULO:
                return message.toUpperCase();

            case MINUSCULO:
                return message.toLowerCase();

            default:
                return message;

        }
    }
}