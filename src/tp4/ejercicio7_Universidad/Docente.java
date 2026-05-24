package tp4.ejercicio7_Universidad;

public class Docente {

    private String nombre;
    private String legajo;
    private int horasMaximas;
    private int horasActuales;

    public Docente(String nombre, String legajo, int horasMaximas) {
        this.nombre = nombre;
        this.legajo = legajo;
        this.horasMaximas = horasMaximas;
        this.horasActuales = 0;
    }

    public void agregarHoras(int horas) {
        horasActuales = horasActuales + horas;
    }

    public void quitarHoras(int horas) {
        horasActuales = horasActuales - horas;
        if (horasActuales < 0) {
            horasActuales = 0;
        }
    }

    public boolean puedeTomarHoras(int horas) {
        return (horasActuales + horas) <= horasMaximas;
    }

    public void mostrarCarga() {
        String estado;
        if (horasActuales <= horasMaximas) {
            estado = "OK";
        } else {
            estado = "EXCEDE EL LIMITE";
        }
        System.out.println("  Docente: " + nombre + " | Horas: " + horasActuales + "/" + horasMaximas + " | " + estado);
    }

    public String getNombre() {
        return nombre;
    }

    public String getLegajo() {
        return legajo;
    }

    public int getHorasActuales() {
        return horasActuales;
    }

    public int getHorasMaximas() {
        return horasMaximas;
    }

    public String toString() {
        return "Docente: " + nombre + " - Legajo: " + legajo + " - Horas: " + horasActuales + "/" + horasMaximas;
    }
}