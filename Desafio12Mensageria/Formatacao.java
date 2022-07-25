package Desafio12Mensageria;
/*
 *  Formatar tudo em maiúsculo
    Formatar tudo em minúsculo
    Formatar em camelCase
    Remover acentuação
 */
public enum Formatacao {
    MAIUSCULO("Maiúsculo"),
    MINUSCULO("Minúsculo"),
    CAMELCASE("Camel Case"),
    REMOVEACCENTS("Remoção de acentos");

    private final String getFormatacao;

    Formatacao(String formatacaoString) {
        getFormatacao = formatacaoString;
    }

    @Override
    public String toString() {
        return getFormatacao;
    }
}
