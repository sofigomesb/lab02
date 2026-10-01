public class RegistroResumos {
    private String[] tema;
    private String[] conteúdo;
    private int numeroDeResumos;
    private int iproximo;
    private int limite;

    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.iproximo = 0;
        this.tema = new String[numeroDeResumos];
        this.conteúdo = new String[numeroDeResumos];
        this.limite = numeroDeResumos;

    }

    public void adicionaResumo(String tema, String conteúdo) {
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
        if (tema[iproximo] == null) {
            String[] resumos = new String[iproximo-1];
        }
        else {
            String[] resumos = new String[limite];
        }

        for (int i = 0; i < resumos; i++) {
            resumos[i] = tema[i] + ": " + conteúdo[i];
        }
    }
}
