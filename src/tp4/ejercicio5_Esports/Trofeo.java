package tp4.ejercicio5_Esports;

public class Trofeo {

    private String nombre;
    private String torneo;
    private int anio;

    public Trofeo(String nombre, String torneo, int anio) {
        this.nombre = nombre;
        this.torneo = torneo;
        this.anio = anio;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Trofeo: " + nombre + " - Torneo: " + torneo + " - Anio: " + anio;
    }
}