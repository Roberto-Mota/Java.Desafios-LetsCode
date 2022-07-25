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
                // message = message.replaceAll("( )+", " "); //Aparentemente isso não é
                // necessário, porém não sei o motivo
                StringBuilder strBuilder = new StringBuilder(message.trim());
                while (strBuilder.indexOf(" ") >= 0) {
                    strBuilder = strBuilder.replace(strBuilder.indexOf(" "), (strBuilder.indexOf(" ") + 2),
                            String.valueOf(Character.toUpperCase(strBuilder.charAt(strBuilder.indexOf(" ") + 1))));
                }
                return strBuilder.toString();

            case MAIUSCULO:
                return message.toUpperCase();

            case MINUSCULO:
                return message.toLowerCase();

            default:
                return message;
        }
    }
}