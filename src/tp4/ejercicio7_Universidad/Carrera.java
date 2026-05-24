package tp4.ejercicio7_Universidad;

public class Carrera {

    private String nombre;
    private PlanDeEstudios plan;

    public Carrera(String nombre, String versionPlan) {
        this.nombre = nombre;
        this.plan = new PlanDeEstudios(versionPlan);
    }

    public void agregarMateria(Materia materia) {
        plan.agregarMateria(materia);
    }

    public PlanDeEstudios getPlan() {
        return plan;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInfo() {
        System.out.println("  Carrera: " + nombre);
        plan.mostrarInfo();
    }
}