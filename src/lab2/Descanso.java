package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemanas = 1;
    }

    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }
// Aqui pode ter uma divisão por 0
    public String getStatusGeral() {
        String status = "cansado";
        if (horasDescanso/numeroSemanas >= 26) {
            status = "descansado";
        }
        return status;
    }
}
