package tp4.ejercicio5_Esports;

import java.util.ArrayList;

public class Equipo {

    private String nombre;
    private ArrayList<Jugador> jugadores;
    private Historial historial;
    private boolean activo;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
        this.historial = new Historial();
        this.activo = true;
    }

    public void agregarJugador(Jugador jugador) {
        if (activo == false) {
            System.out.println("El equipo esta disuelto, no se puede agregar jugador");
            return;
        }
        jugadores.add(jugador);
        jugador.setAgenteLibre(false);
        System.out.println(jugador.getNombre() + " fue agregado al equipo " + nombre);
    }

    public void agregarTrofeo(String nombreTrofeo, String torneo, int anio) {
        Trofeo trofeo = new Trofeo(nombreTrofeo, torneo, anio);
        historial.agregarTrofeo(trofeo);
    }

    public void disolver() {
        System.out.println("Disolviendo el equipo " + nombre);
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).setAgenteLibre(true);
            System.out.println(jugadores.get(i).getNombre() + " ahora es agente libre");
        }
        jugadores.clear();
        historial.desactivar();
        activo = false;
    }

    public void mostrarEstado() {
        String estado;
        if (activo == true) {
            estado = "ACTIVO";
        } else {
            estado = "DISUELTO";
        }
        System.out.println("Equipo: " + nombre + " - " + estado);
        System.out.println("Jugadores (" + jugadores.size() + "):");
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).mostrarEstadisticas();
        }
        System.out.println("Trofeos (" + historial.getCantidadTrofeos() + "):");
        historial.mostrarTrofeos();
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }
}