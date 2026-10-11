package lab2;

/**
 * Representação de um resumo, que é composto pelo tema e
 * pelo seu conteúdo.
 *
 * @author Sofia Gomes Braga
 */
public class Resumo {

    /**
     * Tema do resumo.
     */
    private String tema;

    /**
     * Descrição do que é abordado no resumo.
     */
    private String conteúdo;

    /**
     * Constrói um resumo a partir do tema e
     * do seu conteúdo.
     *
     * @param tema nome do resumo.
     * @param conteúdo o que é abordado no resumo.
     */
    public Resumo(String tema, String conteúdo) {
        this.tema = tema;
        this.conteúdo = conteúdo;
    }

    /**
     * Retorna a String que define o tema do resumo.
     *
     * @return a representação em String do tema.
     */
    public String getTema() {
        return this.tema;
    }

    /**
     * Retorna a String que define o conteúdo do resumo.
     *
     * @return a representação em String da descrição do resumo.
     */
    public String getConteúdo() {
        return conteúdo;
    }

    /**
     * Retorna a String que representa o tema e o conteúdo de respectivo resumo.
     * A representação segue o formato "Tema: Conteúdo".
     *
     * @return a representação em String de um resumo.
     */
    @Override
    public String toString() {
        return this.tema + ": " + this.conteúdo;
    }
}
