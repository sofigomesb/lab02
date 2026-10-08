package lab2;
import java.util.Arrays;

/**
* Registra os resumos dos estudantes. Esses registros devem conter
* o tema e uma descrição dos seus respectivos conteúdos, além do
* número total de resumos e uma variável que define o índice do próximo
* item a ser adicionado nos temas e nos seus conteúdos.
 */
public class RegistroResumos {
    /**
     * Os temas dos resumos.
     */
    private String[] tema;
    /**
     * Sobre o quê são os resumos
     */
    private String[] conteúdo;
    /**
     * Quantidade total de resumos
     */
    private int numeroDeResumos;
    /**
     * Índice do próximo resumo a ser adicionado nos arrays tema e conteúdo
     */
    private int iproximo;

    /**
    * Constrói os registros de resumos a partir do número de resumos.
    * Cria dois arrays, de tema e de conteúdo, do tamanho da quantidade
    * total de resumos. O índice do resumo a ser adicionado começa sempre
    * com zero.
    *
    * @param numeroDeResumos quantidade total de resumos
     */
    public RegistroResumos(int numeroDeResumos) {
        this.iproximo = 0;
        this.tema = new String[numeroDeResumos];
        this.conteúdo = new String[numeroDeResumos];
        this.numeroDeResumos = numeroDeResumos;

    }

    /**
    * Adiciona o tema e o conteúdo ao próximo índice dos arrays
    * de temas e de conteúdos.
    *
    * @param tema nome do tema
    * @param conteúdo descrição do tema, seu conteúdo
     */
    public void adiciona(String tema, String conteúdo) {
        if (iproximo >= numeroDeResumos) {
            this.iproximo = 0;
        }

        this.tema[iproximo] = tema;
        this.conteúdo[iproximo] = conteúdo;
        this.iproximo += 1;
    }

    /**
    * Retorna uma String que representa os resumos. A representação
    * segue o formato "Tema: Conteúdo".
    *
    * @return a representação dos temas e dos conteúdos de cada resumo.
     */
    public String[] pegaResumos() {
        String[] resumos;

        if (tema[iproximo] == null) {
            resumos = new String[iproximo];
        }
        else {
            resumos = new String[numeroDeResumos];
        }

        for (int i = 0; i < resumos.length; i++) {
            resumos[i] = String.valueOf(new Resumo(tema[i], conteúdo[i]));
        }
        return resumos;
    }

    /**
    * Retorna a String que representa a quantidade de resumos cadastrados
    * e os tipos de cada resumo. A representação segue o formato:
    * "Resumos:
    * - Número de resumos resumo(s) cadastrado(s)
    * - Tipos de resumos (separados por '|')"
    *
    * @return a representação em String da quantidade de resumos e
    * dos tipos cadastrados.
     */
    public String imprimeResumos() {
        String tiposResumos = "- ";
        for (int i = 0; i < this.iproximo - 1; i++) {
            tiposResumos += tema[i];
            tiposResumos += " | ";
        }
        tiposResumos += tema[(this.iproximo)-1];
        return "- " + this.iproximo + " resumo(s) cadastrado(s)" + "\n" + tiposResumos;
    }

    /**
    * Retorna o inteiro que representa a quantidade de resumos cadastrados.
    *
    * @return o inteiro que define a quantidade total de resumos
     */
    public int conta() {
        int cont = 0;
        for (int i = 0; i < tema.length; i++) {
            if (!(tema[i] == null)) {
                cont += 1;
            }
        }
        return cont;
    }

    /**
     * Retorna o boolean que define se o aluno inseriu o resumo do respectivo tema.
     * Caso tenha inserido, retorna true, caso contrário, retorna false.
     * @param t o tema a ser procurado
     * @return o boolean que define se tem algum resumo ou não
     */
    public boolean temResumo(String t) {
        for (int i = 0; i < this.iproximo; i++) {
            if (tema[i].equals(t)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Retorna uma lista de Strings com os temas onde a palavra buscada faz parte do conteúdo,
     * ignorando se a chave de pesquisa está em minúscula ou em maiúscula. O array retornado
     * é apresentado em ordem alfabética.
     *
     * @param chaveDeBusca a palavra que será buscada no conteúdo.
     * @return o array de Strings que contêm os temas nos quais a palavra está inserida no
     * conteúdo, em orem alfabética.
     */
    public String[] busca(String chaveDeBusca) {
        int cont = 0;
        for (String c : conteúdo) {
            if (c.toLowerCase().contains(chaveDeBusca.toLowerCase())) {
                cont += 1;
            }
        }

        String[] buscaTemas = new String[cont];

        for (int i = 0; i < conteúdo.length; i++) {
            if (conteúdo[i].toLowerCase().contains(chaveDeBusca.toLowerCase())) {
                buscaTemas[i] = tema[i];
            }
        }
        Arrays.sort(buscaTemas);
        return buscaTemas;
    }
}
