package tp4.ejercicio2_Telemedicina;

public class Medico {

    private String matricula;
    private String nombre;
    private String especialidad;

    public Medico(String matricula, String nombre, String especialidad) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String toString() {
        return "Medico: " + nombre + " - Especialidad: " + especialidad + " - Matricula: " + matricula;
    }
}