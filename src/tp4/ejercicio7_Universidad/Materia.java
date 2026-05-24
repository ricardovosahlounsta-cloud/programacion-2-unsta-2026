package tp4.ejercicio7_Universidad;

public class Materia {

    private String nombre;
    private String codigo;
    private int horasSemanales;
    private Docente docente;

    public Materia(String nombre, String codigo, int horasSemanales) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horasSemanales = horasSemanales;
        this.docente = null;
    }

    public void asignarDocente(Docente docente) {
        if (this.docente != null) {
            this.docente.quitarHoras(horasSemanales);
        }
        if (docente.puedeTomarHoras(horasSemanales) == false) {
            System.out.println("ADVERTENCIA: " + docente.getNombre() + " excede su limite de horas con la materia " + nombre);
        }
        this.docente = docente;
        docente.agregarHoras(horasSemanales);
        System.out.println("Docente " + docente.getNombre() + " asignado a la materia " + nombre + " (" + horasSemanales + " hs)");
    }

    public int getHorasSemanales() {
        return horasSemanales;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public String toString() {
        String nombreDocente;
        if (docente == null) {
            nombreDocente = "Sin docente";
        } else {
            nombreDocente = docente.getNombre();
        }
        return "    Materia: " + nombre + " [" + codigo + "] - " + horasSemanales + " hs/sem - Docente: " + nombreDocente;
    }
}