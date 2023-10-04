public class Moto extends VehiculoMotorizado{
    private String uso;

    public Moto(String fabricante, String modelo, int año, int kilometraje, String uso) {
        super(fabricante, modelo, año, kilometraje);
        this.uso = uso;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public Moto() {
        super();
    }


    @Override
    public String toString() {
        return "Moto{" +super.toString()+
                "uso='" + uso + '\'' +
                "} "  ;
    }
}
