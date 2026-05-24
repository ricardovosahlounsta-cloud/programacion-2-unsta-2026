package tp4.ejercicio7_Universidad;

import java.util.ArrayList;

public class Facultad {

    private String nombre;
    private ArrayList<Carrera> carreras;
    private boolean activa;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.carreras = new ArrayList<>();
        this.activa = true;
    }

    public void agregarCarrera(Carrera carrera) {
        if (activa == false) {
            System.out.println("La facultad esta cerrada, no se puede agregar la carrera " + carrera.getNombre());
            return;
        }
        carreras.add(carrera);
        System.out.println("Carrera " + carrera.getNombre() + " agregada a la facultad " + nombre);
    }

    public void cerrar() {
        System.out.println("Cerrando la facultad " + nombre);
        System.out.println("Las siguientes carreras dejan de dictarse:");
        for (int i = 0; i < carreras.size(); i++) {
            System.out.println("  - " + carreras.get(i).getNombre());
        }
        carreras.clear();
        activa = false;
        System.out.println("Facultad cerrada");
    }

    public void validarCargaDocentes(ArrayList<Docente> docentes) {
        System.out.println("Validacion de carga horaria de docentes:");
        for (int i = 0; i < docentes.size(); i++) {
            docentes.get(i).mostrarCarga();
        }
    }

    public void mostrarInfo() {
        String estado;
        if (activa == true) {
            estado = "ACTIVA";
        } else {
            estado = "CERRADA";
        }
        System.out.println("Facultad: " + nombre + " - " + estado);
        if (carreras.size() == 0) {
            System.out.println("  Sin carreras activas");
            return;
        }
        for (int i = 0; i < carreras.size(); i++) {
            carreras.get(i).mostrarInfo();
        }
    }

    public boolean isActiva() {
        return activa;
    }
}