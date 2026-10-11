package lab2;

/**
 * Representação do tempo de uso online que o aluno tem dedicado a uma disciplina remota.
 * Os registros precisam apresentar o nome da disciplina, o tempo online usado nessa disciplina e o tempo
 * esperado para ser dedicado nela.
 *
 * @author Sofia Gomes Braga
 */
public class RegistroTempoOnline {
    /**
     * Nome da disciplina a ser registrada.
     */
    private String nomeDisciplina;
    /**
     * Tempo online já dedicado à disciplina, em horas.
     */
    private int tempoOnlineUsado;
    /**
     * Tempo online esperado para a disciplina, em horas.
     */
    private int tempoOnlineEsperado;

    /**
     * Constrói um registro de tempo a partir do nome da disciplina e do tempo online esperado
     * para ser dedicado a ela.
     *
     * @param nomeDisciplina nome da disciplina a ser registrada.
     * @param tempoOnlineEsperado tempo online esperado, em horas.
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Constrói um registro de tempo a partir do nome da disciplina.
     * Nesse construtor, o tempo online esperado começa com 120 horas.
     *
     * @param nomeDisciplina nome da disciplina a ser registrada.
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }

    /**
     * Adiciona o tempo online dedicado à matéria. O tempo informado é
     * somado ao tempo já registrado.
     *
     * @param tempo horas a serem adicionadas.
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUsado += tempo;
    }

    /**
     * Retorna um boolean que define se a meta de tempo dedicado
     * a certa matéria foi atingida. Caso tenha sido atingida, retorna true,
     * caso contrário, retorna false.
     *
     * @return true se a meta foi atingida e false caso contrário.
     */
    public boolean atingiuMetaTempoOnline() {
        return tempoOnlineUsado >= tempoOnlineEsperado;
    }

    /**
     * Retorna a String que representa a disciplina e a quantidade de
     * horas dedicadas em relação à quantidade de horas esperadas. A
     * representação segue o formato "Nome da disciplina Tempo online usado/Tempo online esperado".
     * @return a representação em String da disciplina, das horas usadas e das horas esperadas.
     */
    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoOnlineUsado + "/" + tempoOnlineEsperado;
    }
}
