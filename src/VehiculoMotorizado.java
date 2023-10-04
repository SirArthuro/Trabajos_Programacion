public class VehiculoMotorizado {
    private String fabricante;
    private String modelo;
    private int año;
    private int kilometraje;

    public VehiculoMotorizado() {
        this("","",0,0);
    }

    public VehiculoMotorizado(String fabricante, String modelo, int año, int kilometraje) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "VehiculoMotorizado{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", kilometraje=" + kilometraje +
                '}';
    }
}
