import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.stream.Stream;

/*
 * Enunciado

Um funcionário recebe uma comissão de 0.5% sobre o valor do seu dia trabalhado.

Criar uma função para receber o valor do salário mensal e o ano e partir dessas informações calcular a previsão do salário mês a mês.

Considerar apenas os dias úteis (segunda a sexta).

 */

public class Desafio19 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), 1); //LocalDate.of(inputStart);
        LocalDate end = LocalDate.now();                                                                    //LocalDate.of(inputEnd);
        Stream<LocalDate> streamTeste = start.datesUntil(end);
        // streamTeste.filter(predicate) or streamTeste.reduce(predicate)
        streamTeste = streamTeste.filter((dia) -> (dia.getDayOfWeek().getValue() <= 5) ); // a ideia foi boa, mas ta devolvendo outra coisa  do que imaginei, preciso rever
        System.out.println("teste");
        System.out.println(streamTeste.count());
        //start.datesUntil(endExclusive, step) talvez aqui tenha como introduzir um step pulando os dias da semana
        Integer diasUteis = 0;
        Integer finalDeSemana = 0;
        for (int i = 1; i <= start.lengthOfMonth(); i++) {
            start = LocalDate.of(LocalDate.now().getYear(), LocalDate.now().getMonth(), i);
            System.out.println(start.getDayOfWeek() + " num: " + start.getDayOfWeek().getValue() + " Dia mês:" + start.getDayOfMonth());
            if (start.getDayOfWeek().getValue() <= 5 ) {
                diasUteis++;
            } else {
                finalDeSemana++;
            }

            System.out.println("diasUteis " + diasUteis);
            System.out.println("finalDeSemana " + finalDeSemana);
        }
        //dia.lengthOfMonth()
        // 6 || 7 == FDS
        // dia = dia.plusDays(-3);
        // System.out.println(getDayNumberNew(dia));
    }
    // public static int getDayNumberNew(LocalDate date) {
    //     DayOfWeek day = date.getDayOfWeek();
    //     return day.getValue();
    // }
    public static int getDayNumberNew(LocalDate date) {
        return date.getDayOfWeek().getValue();
    }
}
