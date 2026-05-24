package tp4.ejercicio4_Coworking;

import java.util.ArrayList;

public class Oficina {

    private String numero;
    private int capacidad;
    private boolean disponible;
    private ArrayList<Mueble> muebles;

    public Oficina(String numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.disponible = true;
        this.muebles = new ArrayList<>();
    }

    public void agregarMueble(Mueble mueble) {
        muebles.add(mueble);
        mueble.asignarAOficina();
        System.out.println("El mueble " + mueble.getId() + " fue agregado a la oficina " + numero);
    }

    public ArrayList<Mueble> retirarMuebles() {
        System.out.println("Retirando todos los muebles de la oficina " + numero);
        ArrayList<Mueble> retirados = new ArrayList<>(muebles);
        for (int i = 0; i < retirados.size(); i++) {
            retirados.get(i).enviarADeposito();
        }
        muebles.clear();
        return retirados;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public String getNumero() {
        return numero;
    }

    public void mostrarInfo() {
        String estado;
        if (disponible == true) {
            estado = "DISPONIBLE";
        } else {
            estado = "OCUPADA";
        }
        System.out.println("  Oficina " + numero + " - Capacidad: " + capacidad + " personas - " + estado);
        for (int i = 0; i < muebles.size(); i++) {
            System.out.println("    " + muebles.get(i));
        }
    }
}