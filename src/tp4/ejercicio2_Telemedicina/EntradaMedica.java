package tp4.ejercicio2_Telemedicina;

public class EntradaMedica {

    private String fecha;
    private String tipo;
    private String descripcion;
    private Medico medico;

    public EntradaMedica(String fecha, String tipo, String descripcion, Medico medico) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.medico = medico;
    }

    public String getFecha() {
        return fecha;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Medico getMedico() {
        return medico;
    }

    public String toString() {
        return "[" + fecha + "] " + tipo + ": " + descripcion + " - Atendido por: " + medico.getNombre();
    }
}