package lab2;

import java.util.Arrays;

/**
* Representação de uma disciplina de estudos. Toda disciplina
* precisa de um nome, as horas de estudo dedicadas à ela, as
 * notas e seus pesos correspondentes.
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
     * Define o número de notas registradas da disciplina.
     */
    private int numeroNotas;
    /**
     * Pesos de cada uma das notas.
     */
    private int[] pesosNotas;

    /**
    * Constrói uma disciplina a partir do seu nome.
    * Toda disciplina começa com o campo array notas de tamanho
    * quatro, sem valores correspondentes.
    *
    * @param nomeDisciplina nome da matéria cursada
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroNotas = 4;
        this.notas = new double[numeroNotas];
        this.horasEstudo = 0;
        this.pesosNotas = new int[numeroNotas];
        Arrays.fill(pesosNotas, 1);
    }

    /**
     * Constrói uma disciplina a partir do seu nome e do número de notas a serem
     * adicionadas. O campo array notas começa com o tamanho da quantidade de notas
     * que serão adicionadas.
     *
     * @param nomeDisciplina nome da matéria cursada
     * @param numeroNotas quantidade de notas da disciplina
     */
    public Disciplina(String nomeDisciplina, int numeroNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroNotas = numeroNotas;
        this.notas = new double[numeroNotas];
        this.horasEstudo = 0;
        this.pesosNotas = new int[numeroNotas];
        Arrays.fill(pesosNotas, 1);
    }

    /**
     * Constrói uma disciplina a partir do seu nome, do número de notas a serem
     * adicionadas e do array de pesos de cada nota. Os campos array notas e pesos notas
     * começam com o tamanho da quantidade de notas que serão adicionadas.
     *
     * @param nomeDisciplina nome da disciplina cursada
     * @param numeroNotas quantidade de notas da disciplina
     * @param pesosNotas array com os pesos de cada nota
     */
    public Disciplina(String nomeDisciplina, int numeroNotas, int[] pesosNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.numeroNotas = numeroNotas;
        this.pesosNotas = Arrays.copyOf(pesosNotas, numeroNotas);
        this.notas = new double[numeroNotas];
        this.horasEstudo = 0;
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
    * Cadastra ou atualiza o valor de uma nota da disciplina.
    *
    * @param nota número da nota a ser cadastrada
    * @param valorNota a nota tirada pelo aluno
     */
    public void cadastraNota(int nota, double valorNota) {
       if (nota >= 1 && nota <= numeroNotas) {
           this.notas[nota - 1] = valorNota;
       }
    }

    /**
    * Calcula a média das notas da disciplina considerando os pesos
     * definidos para cada avaliação.
    *
    * @return a média das notas do aluno.
     */
    public double calculaMedia() {

        double media = 0;
        int somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            media += notas[i] * pesosNotas[i];
            somaPesos += pesosNotas[i];
        }
        return media/somaPesos;
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
