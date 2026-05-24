package tp4.ejercicio5_Esports;

import java.util.ArrayList;

public class Historial {

    private ArrayList<Trofeo> trofeos;
    private boolean activo;

    public Historial() {
        this.trofeos = new ArrayList<>();
        this.activo = true;
    }

    public void agregarTrofeo(Trofeo trofeo) {
        if (activo == false) {
            System.out.println("El historial no esta activo, no se puede agregar trofeo");
            return;
        }
        trofeos.add(trofeo);
        System.out.println("Trofeo agregado: " + trofeo.getNombre());
    }

    public void mostrarTrofeos() {
        if (activo == false) {
            System.out.println("  El historial no esta activo, el equipo fue disuelto");
            return;
        }
        if (trofeos.size() == 0) {
            System.out.println("  Sin trofeos todavia");
            return;
        }
        for (int i = 0; i < trofeos.size(); i++) {
            System.out.println("  " + trofeos.get(i));
        }
    }

    public void desactivar() {
        activo = false;
        System.out.println("Historial desactivado porque el equipo fue disuelto");
    }

    public int getCantidadTrofeos() {
        return trofeos.size();
    }

    public boolean isActivo() {
        return activo;
    }
}