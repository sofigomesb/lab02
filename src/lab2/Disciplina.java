package lab2;

import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
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
// O 4 pode ser usado como constante private static final
    public double calculaMedia() {

        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        return media/4;
    }
// podia ser constante, ex: NOTA_DEAPROVAÇÃO = 7
    // If não ncessário, bastava return calculaMedia() >= que já retorna true ou false
    public boolean aprovado() {
        if (calculaMedia() >= 7) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.nomeDisciplina  + " " + this.horasEstudo + " " + this.calculaMedia() + " " + Arrays.toString(this.notas);
    }

}
