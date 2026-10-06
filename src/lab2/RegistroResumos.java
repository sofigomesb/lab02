package lab2;

public class RegistroResumos {
    private String[] tema;
    private String[] conteúdo;
    private int numeroDeResumos;
    private int iproximo;
    private int limite;
// numeroDeResumos não está sendo inicializado, isso causava erro no meu código
    // limite e numerodeResumos tem a mesma função
    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.iproximo = 0;
        this.tema = new String[numeroDeResumos];
        this.conteúdo = new String[numeroDeResumos];
        this.limite = numeroDeResumos;
        this.numeroDeResumos = numeroDeResumos;

    }
// da para otimizar, if e else tem quase o mesmo código.
    public void adiciona(String tema, String conteúdo) {
        if (iproximo < limite) {
            this.tema[iproximo] = tema;
            this.conteúdo[iproximo] = conteúdo;
            this.iproximo += 1;
        }
        else {
            this.iproximo = 0;
            this.tema[iproximo] = tema;
            this.conteúdo[iproximo] = conteúdo;
            this.iproximo += 1;
        }
    }

    public String[] pegaResumos() {
        String[] resumos;

        if (tema[iproximo] == null) {
            resumos = new String[iproximo];
        }
        else {
            resumos = new String[limite];
        }

        for (int i = 0; i < resumos.length; i++) {
            resumos[i] = tema[i] + ": " + conteúdo[i];
        }
        return resumos;
    }

    public String imprimeResumos() {
        String tiposResumos = "- ";
        for (int i = 0; i < this.iproximo - 1; i++) {
            tiposResumos += tema[i];
            tiposResumos += " | ";
        }
        tiposResumos += tema[(this.iproximo)-1];
        return "- " + this.iproximo + " resumo(s) cadastrado(s)" + "\n" + tiposResumos;
    }

    public int conta() {
        int cont = 0;
        for (int i = 0; i < tema.length; i++) {
            if (!(tema[i] == null)) {
                cont += 1;
            }
        }
        return cont;
    }

    public boolean temResumo(String t) {
        for (int i = 0; i < this.iproximo; i++) {
            if (tema[i].equals(t)) {
                return true;
            }
        }
        return false;
    }
}
