import java.util.Objects;

public class Carro extends VehiculoMotorizado{

    private  int estilo;
    private CapacidadLimite pasajeros;

    public Carro() {
    }

    public Carro(String fabricante, String modelo, int año, int kilometraje, int estilo, CapacidadLimite pasajeros) {
        super(fabricante, modelo, año, kilometraje);
        this.estilo = estilo;
        this.pasajeros = pasajeros;
    }

    public int getEstilo() {
        return estilo;
    }

    public void setEstilo(int estilo) {
        this.estilo = estilo;
    }

    public CapacidadLimite getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(CapacidadLimite pasajeros) {
        this.pasajeros = pasajeros;
    }


    public Carro(String fabricante, String modelo, int año, int kilometraje) {
        super(fabricante, modelo, año, kilometraje);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "estilo='" + estilo + '\'' +
                ", pasajeros=" + pasajeros +
                "} " + super.toString();
    }
}
