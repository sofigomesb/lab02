package lab2;

/**
* Representação da rotina de descanso do aluno, que deve
* descansar 26 horas ou mais por semana para se considerar
* descansado, contando as atividades de lazer, sem incluir
* as horas de sono. Caso não tenha registrado horas de descanso
* ou número de semanas, o aluno começa cansado.
*
* @author Sofia Gomes Braga
 */
public class Descanso {
    /**
     * Horas totais descansadas.
     */
    private int horasDescanso;
    /**
     * Quantidade total de semanas.
     */
    private int numeroSemanas;

    /**
    * Constrói o descanso a partir das horas totais descansadas
    * e do número de semanas. Começa com os campos horasdescanso
    * e numeroSemanas iguais a zero.
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 0;
    }

    /**
    * Define as horas de descanso totais.
    *
    * @param horasDescanso as horas de descanso do aluno
     */
    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    /**
    * Define o número de semanas totais.
    *
    * @param numeroSemanas a quantidade de semanas totais
     */
    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    /**
    * Retorna a String que representa se o aluno está cansado
    * ou descansado. Caso o número de semanas ou as horas de
    * descanso sejam zero, o status do aluno é cansado. Caso
    * a média de horas de descanso por semana seja maior ou
    * igual a 26, o aluno está descansado.
    *
    * @return o status do aluno, cansado ou descansado
     */
    public String getStatusGeral() {
        String status = "cansado";
        if (numeroSemanas == 0 || horasDescanso == 0) {
            return status;
        }
        if (horasDescanso/numeroSemanas >= 26) {
            status = "descansado";
        }
        return status;
    }
}
