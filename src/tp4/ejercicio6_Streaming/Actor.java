package tp4.ejercicio6_Streaming;

public class Actor {

    private String nombre;
    private String nacionalidad;

    public Actor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String toString() {
        return "Actor: " + nombre + " - Nacionalidad: " + nacionalidad;
    }
}