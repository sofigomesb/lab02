package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemanas;

    public void defineHorasDescanso(int horasDescanso) {
        this.horasDescanso = horasDescanso;
    }

    public void defineNumeroSemanas(int numeroSemanas) {
        this.numeroSemanas = numeroSemanas;
    }

    public String getStatusGeral() {
        String status = "cansado";
        if (horasDescanso/numeroSemanas >= 26) {
            status = "descansado";
        }
        return status;
    }
}
