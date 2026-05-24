package tp4.ejercicio3_TrenAzucarero;

public class HojaDeRuta {

    private String codigo;
    private String origen;
    private String destino;
    private double distanciaKm;
    private boolean valida;

    public HojaDeRuta(String codigo, String origen, String destino, double distanciaKm) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.distanciaKm = distanciaKm;
        this.valida = true;
    }

    public void invalidar() {
        this.valida = false;
        System.out.println("Hoja de ruta " + codigo + " invalidada porque el viaje fue cancelado");
    }

    public boolean isValida() {
        return valida;
    }

    public String getCodigo() {
        return codigo;
    }

    public String toString() {
        String estado;
        if (valida == true) {
            estado = "VALIDA";
        } else {
            estado = "INVALIDA";
        }
        return "HojaDeRuta [" + codigo + "] " + origen + " -> " + destino + " (" + distanciaKm + " km) - " + estado;
    }
}