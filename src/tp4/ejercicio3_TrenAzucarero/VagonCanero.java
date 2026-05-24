package tp4.ejercicio3_TrenAzucarero;

public class VagonCanero {

    private String id;
    private double capacidadMaxima;
    private double cargaActual;

    public VagonCanero(String id, double capacidadMaxima) {
        this.id = id;
        this.capacidadMaxima = capacidadMaxima;
        this.cargaActual = 0;
    }

    public void cargar(double toneladas) {
        double espacioLibre = capacidadMaxima - cargaActual;
        if (toneladas > espacioLibre) {
            System.out.println("El vagon " + id + " no tiene espacio suficiente. Espacio libre: " + espacioLibre + " ton");
            return;
        }
        cargaActual = cargaActual + toneladas;
        System.out.println("Vagon " + id + " cargado con " + toneladas + " ton. Carga actual: " + cargaActual + " ton");
    }

    public void descargar() {
        System.out.println("Vagon " + id + " descargado. Tenia " + cargaActual + " ton");
        cargaActual = 0;
    }

    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCargaActual() {
        return cargaActual;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Vagon [" + id + "] - Carga: " + cargaActual + "/" + capacidadMaxima + " ton";
    }
}