public class Camion extends VehiculoMotorizado{
    private int numremolques;
    private CapacidadLimite pasajeros;

    public Camion (){

    }
    public Camion(String fabricante, String modelo, int año, int kilometraje, int numremolques, CapacidadLimite pasajeros) {
        super(fabricante, modelo, año, kilometraje);
        this.numremolques = numremolques;
        this.pasajeros = pasajeros;
    }

    public int getNumremolques() {
        return numremolques;
    }

    public void setNumremolques(int numremolques) {
        this.numremolques = numremolques;
    }

    public CapacidadLimite getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(CapacidadLimite pasajeros) {
        this.pasajeros = pasajeros;
    }


    @Override
    public String toString() {
        return "Camion{" +
                "numremolques=" + numremolques +
                ", pasajeros=" + pasajeros +
                "} " + super.toString();
    }
}

