import javax.swing.*;
import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        VehiculoMotorizado vh1 = new VehiculoMotorizado();
        JTextArea exit = new JTextArea(30, 20);
        JScrollPane scroll = new JScrollPane(exit);

        ArrayList<VehiculoMotorizado> lista = new ArrayList();
        ArrayList<Moto> listam = new ArrayList();
        ArrayList<Carro> listac = new ArrayList();
        ArrayList<Camion> listaca = new ArrayList();

        CapacidadLimite cl1 = new CapacidadLimite(8);
        CapacidadLimite cl2 = new CapacidadLimite(4);
        CapacidadLimite cl3 = new CapacidadLimite(10);
        CapacidadLimite cl4 = new CapacidadLimite(5);

        int opc = Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opcion\n" +
                "1.-)Ingresar datos\n" +
                "2.-)Imprimir datos\n"
        ));

        switch (opc) {
            case 1:
                int op = Integer.parseInt(JOptionPane.showInputDialog("que clase de vehiculo desea ingresar?\n" +
                        "1.-) moto\n" +
                        "2.-) Carro\n" +
                        "3.-) Camion"));
                switch (op) {
                    case 1:
                        Moto m1 = new Moto();
                        m1.setFabricante(JOptionPane.showInputDialog("Ingresa el fabricante :D"));
                        m1.setModelo(JOptionPane.showInputDialog("Ingresa el modelo"));
                        m1.setAño(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año del modelo")));
                        m1.setKilometraje(Integer.parseInt(JOptionPane.showInputDialog("ingresa el kilometraje")));
                        m1.setUso(JOptionPane.showInputDialog("ingrese el uso"));
                        listam.add(m1);
                        break;
                    case 2:
                        Carro c1 = new Carro();
                        c1.setFabricante(JOptionPane.showInputDialog("Ingresa el fabricante :D"));
                        c1.setModelo(JOptionPane.showInputDialog("Ingresa el modelo"));
                        c1.setAño(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año del modelo")));
                        c1.setKilometraje(Integer.parseInt(JOptionPane.showInputDialog("ingresa el kilometraje")));
                        c1.setEstilo(Integer.parseInt(JOptionPane.showInputDialog("ingrese el estilo\n" + "1.-) VAN\n" + "2.-)Deportivo\n" + "3.-)Clasico")));
                        if (c1.getEstilo() == 1) {
                            c1.setPasajeros(cl1);
                        } else c1.setPasajeros(cl2);
                        listac.add(c1);
                        break;
                    case 3:
                        Camion cm1 = new Camion();
                        cm1.setFabricante(JOptionPane.showInputDialog("Ingresa el fabricante :D"));
                        cm1.setModelo(JOptionPane.showInputDialog("Ingresa el modelo"));
                        cm1.setAño(Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año del modelo")));
                        cm1.setKilometraje(Integer.parseInt(JOptionPane.showInputDialog("ingresa el kilometraje")));
                        cm1.setNumremolques(Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de remolques")));
                        if (cm1.getNumremolques() > 2) {
                            cm1.setPasajeros(cl3);
                        } else cm1.setPasajeros(cl4);
                        listaca.add(cm1);
                        break;

                }
            case 2:
                        if (!listam.isEmpty()){
                            exit.setText("Fabricante\t" + "Modelo\t" + "Año\t"+"Kilometraje\t"+"Uso\n");
                                for (int i = 0; i < listam.size(); i++) {
                                    exit.append(listam.get(i).getFabricante()+"\t"+listam.get(i).getModelo()+"\t"+listam.get(i).getAño()+"\t"+listam.get(i).getKilometraje()+"\t"+listam.get(i).getUso()+"\n");
                                }
                            JOptionPane.showMessageDialog(null, scroll);break;
                        }else if (!listac.isEmpty()){
                            exit.setText("Fabricante\t" + "Modelo\t" + "Año\t"+"Kilometraje\t"+"Estilo\t"+"Limite Pasajeros\n");
                                for (int i = 0; i < listac.size(); i++) {
                                    exit.append(listac.get(i).getFabricante()+"\t"+listac.get(i).getModelo()+"\t"+listac.get(i).getKilometraje()+"\t"+listac.get(i).getModelo()+"\t"+listac.get(i).getPasajeros()+"\n");
                                }
                            JOptionPane.showMessageDialog(null, scroll); break;
                        } else if (!listaca.isEmpty()) {
                            exit.setText("Fabricante\t" + "Modelo\t" + "Año\t"+"Kilometraje\t"+"Remolques\t"+"Limite Pasajeros\n");
                                for (int i = 0; i < listaca.size(); i++) {
                                    exit.append(listaca.get(i).getFabricante() + "\t" + listaca.get(i).getModelo() + "\t" + listaca.get(i).getKilometraje() + "\t" + listaca.get(i).getNumremolques() + "\t" + listaca.get(i).getPasajeros() + "\n");
                                }
                        }
                         JOptionPane.showMessageDialog(null, scroll); break;
            case 3:JOptionPane.showMessageDialog(null,"chaoo");
                System.exit(0);


        }

    }
}