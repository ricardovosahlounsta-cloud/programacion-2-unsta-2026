package tp4.ejercicio3_TrenAzucarero;

import java.util.ArrayList;

public class TrenAzucarero {

    private String id;
    private Locomotora locomotora;
    private ArrayList<VagonCanero> vagones;
    private HojaDeRuta hojaDeRuta;

    public TrenAzucarero(String id, Locomotora locomotora) {
        this.id = id;
        this.locomotora = locomotora;
        this.vagones = new ArrayList<>();
        this.hojaDeRuta = null;
    }

    public void asignarHojaDeRuta(HojaDeRuta hoja) {
        this.hojaDeRuta = hoja;
        System.out.println("Hoja de ruta " + hoja.getCodigo() + " asignada al tren " + id);
    }

    public void engancharVagon(VagonCanero vagon) {
        vagones.add(vagon);
        System.out.println("Vagon " + vagon.getId() + " enganchado al tren " + id);
    }

    public VagonCanero desengancharVagon(String idVagon) {
        for (int i = 0; i < vagones.size(); i++) {
            if (vagones.get(i).getId().equals(idVagon)) {
                VagonCanero vagon = vagones.remove(i);
                System.out.println("Vagon " + idVagon + " desenganchado del tren " + id);
                return vagon;
            }
        }
        System.out.println("No se encontro el vagon " + idVagon + " en el tren " + id);
        return null;
    }

    public double getCapacidadTotalMaxima() {
        double total = 0;
        for (int i = 0; i < vagones.size(); i++) {
            total = total + vagones.get(i).getCapacidadMaxima();
        }
        return total;
    }

    public double getCargaTotalActual() {
        double total = 0;
        for (int i = 0; i < vagones.size(); i++) {
            total = total + vagones.get(i).getCargaActual();
        }
        return total;
    }

    public void cancelarViaje() {
        System.out.println("Cancelando viaje del tren " + id);
        if (hojaDeRuta != null) {
            hojaDeRuta.invalidar();
        }
    }

    public void mostrarEstado() {
        System.out.println("Tren: " + id);
        System.out.println("  " + locomotora);
        System.out.println("  Vagones (" + vagones.size() + "):");
        for (int i = 0; i < vagones.size(); i++) {
            System.out.println("    " + vagones.get(i));
        }
        System.out.println("  Capacidad total maxima: " + getCapacidadTotalMaxima() + " ton");
        System.out.println("  Carga total actual: " + getCargaTotalActual() + " ton");
        if (hojaDeRuta != null) {
            System.out.println("  " + hojaDeRuta);
        }
    }

    public String getId() {
        return id;
    }
}