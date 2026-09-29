public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        if (nota == 1) {
            this.notas[0] = valorNota;
        }
        else if (nota == 2) {
            this.notas[1] = valorNota;
        }
        else if (nota == 3) {
            this.notas[2] = valorNota;
        }
        else {
            this.notas[3] = valorNota;
        }
    }

    public

}
