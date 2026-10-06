package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineUsado;
    private int tempoOnlineEsperado;

    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }

    public void adicionaTempoOnline(int tempo) {
        this.tempoOnlineUsado += tempo;
    }
// esse if também não é necessário, assim como comentei em outro lugar. Mesmo caso.
    public boolean atingiuMetaTempoOnline() {
        boolean status = false;
        if (tempoOnlineUsado >= tempoOnlineEsperado) {
            status = true;
        }
        return status;
    }

    @Override
    public String toString() {
        return nomeDisciplina + " " + tempoOnlineUsado + "/" + tempoOnlineEsperado;
    }
}
