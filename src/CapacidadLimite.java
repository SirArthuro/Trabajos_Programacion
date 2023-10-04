public class CapacidadLimite {
    private int capacidad;


    public CapacidadLimite(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return " "+capacidad;

    }
}
