package tp4.ejercicio6_Streaming;

import java.util.ArrayList;

public class Episodio {

    private int numero;
    private String titulo;
    private int duracion;
    private ArrayList<Actor> actores;

    public Episodio(int numero, String titulo, int duracion) {
        this.numero = numero;
        this.titulo = titulo;
        this.duracion = duracion;
        this.actores = new ArrayList<>();
    }

    public void agregarActor(Actor actor) {
        actores.add(actor);
        System.out.println("Actor " + actor.getNombre() + " agregado al episodio " + numero);
    }

    public int getDuracion() {
        return duracion;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void mostrarInfo() {
        System.out.println("    Episodio " + numero + ": " + titulo + " - Duracion: " + duracion + " min");
        for (int i = 0; i < actores.size(); i++) {
            System.out.println("      " + actores.get(i));
        }
    }

    public String toString() {
        return "Episodio " + numero + ": " + titulo + " - " + duracion + " min";
    }
}
