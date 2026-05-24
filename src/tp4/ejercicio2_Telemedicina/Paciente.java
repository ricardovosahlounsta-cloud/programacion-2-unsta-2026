package tp4.ejercicio2_Telemedicina;

public class Paciente {

    private String dni;
    private String nombre;
    private ExpedienteClinico expediente;
    private boolean activo;

    public Paciente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.expediente = new ExpedienteClinico("EXP-" + dni);
        this.activo = true;
    }

    public void agregarEntrada(String fecha, String tipo, String descripcion, Medico medico) {
        if (activo == false) {
            System.out.println("El paciente " + nombre + " esta dado de baja, no se puede agregar entrada");
            return;
        }
        EntradaMedica entrada = new EntradaMedica(fecha, tipo, descripcion, medico);
        expediente.agregarEntrada(entrada);
    }

    public void mostrarHistorial() {
        if (activo == false) {
            System.out.println("El paciente " + nombre + " esta dado de baja, expediente eliminado");
            return;
        }
        expediente.mostrarHistorial();
    }

    public void mostrarReporteEvolucion() {
        if (activo == false) {
            System.out.println("El paciente " + nombre + " esta dado de baja, sin reporte disponible");
            return;
        }
        System.out.println("Reporte de evolucion del paciente: " + nombre);
        expediente.mostrarSoloDiagnosticos();
    }

    public void darDeBaja() {
        System.out.println("Dando de baja al paciente " + nombre);
        System.out.println("Eliminando expediente " + expediente.getNumero() + " con " + expediente.getCantidadEntradas() + " entradas");
        expediente = null;
        activo = false;
        System.out.println("Paciente dado de baja. Expediente eliminado por privacidad");
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActivo() {
        return activo;
    }

    public String toString() {
        return "Paciente: " + nombre + " - DNI: " + dni + " - Activo: " + activo;
    }
}