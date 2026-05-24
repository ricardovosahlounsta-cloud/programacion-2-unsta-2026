package tp4.ejercicio6_Streaming;

import java.util.ArrayList;

public class Temporada {

    private int numero;
    private int anio;
    private ArrayList<Episodio> episodios;

    public Temporada(int numero, int anio) {
        this.numero = numero;
        this.anio = anio;
        this.episodios = new ArrayList<>();
    }

    public void agregarEpisodio(Episodio episodio) {
        episodios.add(episodio);
        System.out.println("Episodio " + episodio.getNumero() + " agregado a la temporada " + numero);
    }

    public int getDuracionTotal() {
        int total = 0;
        for (int i = 0; i < episodios.size(); i++) {
            total = total + episodios.get(i).getDuracion();
        }
        return total;
    }

    public int getNumero() {
        return numero;
    }

    public int getCantidadEpisodios() {
        return episodios.size();
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public void mostrarInfo() {
        System.out.println("  Temporada " + numero + " (" + anio + ") - " + episodios.size() + " episodios - " + getDuracionTotal() + " min en total");
        for (int i = 0; i < episodios.size(); i++) {
            episodios.get(i).mostrarInfo();
        }
    }
}