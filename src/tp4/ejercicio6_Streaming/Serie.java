package tp4.ejercicio6_Streaming;

import java.util.ArrayList;

public class Serie {

    private String titulo;
    private String genero;
    private ArrayList<Temporada> temporadas;

    public Serie(String titulo, String genero) {
        this.titulo = titulo;
        this.genero = genero;
        this.temporadas = new ArrayList<>();
    }

    public void agregarTemporada(Temporada temporada) {
        temporadas.add(temporada);
        System.out.println("Temporada " + temporada.getNumero() + " agregada a la serie " + titulo);
    }

    public int getDuracionTotal() {
        int total = 0;
        for (int i = 0; i < temporadas.size(); i++) {
            total = total + temporadas.get(i).getDuracionTotal();
        }
        return total;
    }

    public int getCantidadEpisodios() {
        int total = 0;
        for (int i = 0; i < temporadas.size(); i++) {
            total = total + temporadas.get(i).getCantidadEpisodios();
        }
        return total;
    }

    public void mostrarInfo() {
        System.out.println("Serie: " + titulo + " - Genero: " + genero);
        System.out.println("Temporadas: " + temporadas.size() + " - Episodios: " + getCantidadEpisodios() + " - Duracion total: " + getDuracionTotal() + " min");
        for (int i = 0; i < temporadas.size(); i++) {
            temporadas.get(i).mostrarInfo();
        }
    }

    public String getTitulo() {
        return titulo;
    }
}