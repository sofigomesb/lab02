package lab2;
import java.util.Arrays;

/**
* Registra os resumos dos estudantes. Esses registros devem conter os resumos definidos
* pela classe Resumo, onde são definidos o tema e uma descrição dos seus respectivos conteúdos.
 * Na classe RegistroResumos, também é definido o número total de resumos e uma variável que
 * define o índice do próximo item a ser adicionado nos temas e nos seus conteúdos.
 */
public class RegistroResumos {
    /**
     * Array que contêm os resumos, definidos pela classe Resumo.
     */
    private Resumo[] resumos;
    /**
     * Quantidade total de resumos.
     */
    private int numeroDeResumos;
    /**
     * Índice da próxima posição de inserção.
     */
    private int iproximo;

    /**
     * Constrói os registros de resumos a partir do número de resumos.
     * Cria um array de objetos Resumo do tamanho da quantidade
     * total de resumos. O índice do resumo a ser adicionado começa sempre
     * com zero.
     *
     * @param numeroDeResumos quantidade total de resumos
     */
    public RegistroResumos(int numeroDeResumos) {
        this.iproximo = 0;
        this.resumos = new Resumo[numeroDeResumos];
        this.numeroDeResumos = numeroDeResumos;

    }

    /**
     * Adiciona o tema e o conteúdo ao próximo índice dos arrays
     * de temas e de conteúdos.
     *
     * @param tema     nome do tema
     * @param conteúdo descrição do tema, seu conteúdo
     */
    public void adiciona(String tema, String conteúdo) {
        if(temResumo(tema)) {
            return;
        }

        if (iproximo >= numeroDeResumos) {
            this.iproximo = 0;
        }

        this.resumos[iproximo] = new Resumo(tema, conteúdo);
        this.iproximo += 1;

    }

    /**
     * Retorna uma String que representa os resumos. A representação
     * segue o formato "Tema: Conteúdo".
     *
     * @return a representação dos temas e dos conteúdos de cada resumo.
     */
    public String[] pegaResumos() {
        String[] mostra = new String[conta()];

        int indice = 0;
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                mostra[indice] = resumos[i].getTema() + ": " + resumos[i].getConteúdo();
                indice += 1;
            }
        }

        return mostra;
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
        String tiposResumos = "";
        for (int i = 0; i < resumos.length; i++) {
            if (resumos[i] != null) {
                if (!tiposResumos.isEmpty()) {
                    tiposResumos += " | ";
                }
                tiposResumos += resumos[i].getTema();
            }
        }
        return "- " + this.iproximo + " resumo(s) cadastrado(s)" + "\n- " + tiposResumos;
    }

        /**
         * Retorna o inteiro que representa a quantidade de resumos cadastrados.
         *
         * @return o inteiro que define a quantidade total de resumos
         */
        public int conta () {
            int cont = 0;
            for (int i = 0; i < resumos.length; i++) {
                if (!(resumos[i] == null)) {
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
        public boolean temResumo (String t){
            for (int i = 0; i < resumos.length; i++) {
                if (resumos[i] != null && resumos[i].getTema().equals(t)) {
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
         * conteúdo, em ordem alfabética.
         */
        public String[] busca (String chaveDeBusca){
            int cont = 0;
            for (int i = 0; i < resumos.length; i++) {
                if (resumos[i] != null && resumos[i].getConteúdo().toLowerCase().contains(chaveDeBusca.toLowerCase())) {
                    cont += 1;
                }
            }

            String[] buscaTemas = new String[cont];

            int indice = 0;
            for (int i = 0; i < resumos.length; i++) {
                if (resumos[i] != null && resumos[i].getConteúdo().toLowerCase().contains(chaveDeBusca.toLowerCase())) {
                    buscaTemas[indice] = resumos[i].getTema();
                    indice += 1;
                }
            }
            Arrays.sort(buscaTemas);
            return buscaTemas;
        }
    }
