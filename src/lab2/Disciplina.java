package lab2;

import java.util.Arrays;

/**
* Representação de uma matéria de estudos. Toda disciplina
* precisa de um nome, as horas de estudo dedicadas à ela e
* quatro notas correspondentes.
*
* @author Sofia Gomes Braga
 */
public class Disciplina {
    /**
     * Nome da matéria
     */
    private String nomeDisciplina;
    /**
     * Quantidade de horas dedicadas ao estudo da matéria
     */
    private int horasEstudo;
    /**
     * Notas das avaliações da matéria
     */
    private double[] notas;

    /**
    * Constrói uma disciplina a partir do seu nome.
    * Toda disciplina começa com o campo array notas de tamanho
    * quatro, sem valores correspondentes.
    *
    * @param nomeDisciplina nome da matéria cursada
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[4];
    }

    /**
    * Adiciona a quantidade de horas estudadas pelo aluno.
    *
    * @param horas quantidade de horas a ser adicionada
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo += horas;
    }

    /**
    * Cadastra as quatro da matéria no array notas.
    *
    * @param nota nota a ser cadastrada entre 1, 2, 3 e 4
    * @param valorNota a nota tirada pelo aluno
     */
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

    /**
    * Retorna o double que representa a média total das
    * notas da disciplina.
    *
    * @return a média das quatro notas do aluno.
     */
    public double calculaMedia() {

        double media = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i];
        }
        return media/4;
    }

    /**
    * Retorna o boolean que define se o aluno foi ou não aprovado.
    * Caso tenha tirado média acima ou igual a 7, ele foi
    * aprovado e é retornado true. Caso contrário, ele não
    * foi aprovado e o valor retornado é false.
    *
    * @return true caso o aluno tenha sido aprovado e false, caso o contário tenha acontecido.
     */
    public boolean aprovado() {
        return calculaMedia() >= 7;
    }

    /**
    * Retorna a String que representa a disciplina. A representação
    * segue o formato "Nome disciplina Horas de estudo Média Notas".
    *
    * @return a representação em String de uma disciplina.
     */
    @Override
    public String toString() {
        return this.nomeDisciplina  + " " + this.horasEstudo + " " + this.calculaMedia() + " " + Arrays.toString(this.notas);
    }

}
