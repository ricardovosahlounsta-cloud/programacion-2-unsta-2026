package tp4.ejercicio4_Coworking;

import java.util.ArrayList;

public class Edificio {

    private String nombre;
    private String ciudad;
    private ArrayList<Oficina> oficinas;

    public Edificio(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.oficinas = new ArrayList<>();
    }

    public void agregarOficina(Oficina oficina) {
        oficinas.add(oficina);
        System.out.println("Oficina " + oficina.getNumero() + " agregada al edificio " + nombre);
    }

    public void mostrarOficinas() {
        System.out.println("Edificio: " + nombre + " - Ciudad: " + ciudad);
        System.out.println("Total oficinas: " + oficinas.size());
        for (int i = 0; i < oficinas.size(); i++) {
            oficinas.get(i).mostrarInfo();
        }
    }

    public void mostrarOficinasDisponibles() {
        System.out.println("Oficinas disponibles en " + nombre + ":");
        boolean hayAlguna = false;
        for (int i = 0; i < oficinas.size(); i++) {
            if (oficinas.get(i).isDisponible() == true) {
                oficinas.get(i).mostrarInfo();
                hayAlguna = true;
            }
        }
        if (hayAlguna == false) {
            System.out.println("  No hay oficinas disponibles");
        }
    }

    public String getNombre() {
        return nombre;
    }
}