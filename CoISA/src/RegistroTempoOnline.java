public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineUsado;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUsado += tempo;
    }

    public boolean atingiuMetaTempoOnline() {
        boolean status = false;
        if (tempoOnlineUsado >= tempoOnlineEsperado) {
            status = true;
        }
        return status;
    }

    public String toString() {

    }
}
