package tp4.ejercicio7_Universidad;

import java.util.ArrayList;

public class PlanDeEstudios {

    private String version;
    private ArrayList<Materia> materias;

    public PlanDeEstudios(String version) {
        this.version = version;
        this.materias = new ArrayList<>();
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);
        System.out.println("Materia " + materia.getNombre() + " agregada al plan " + version);
    }

    public int getTotalHoras() {
        int total = 0;
        for (int i = 0; i < materias.size(); i++) {
            total = total + materias.get(i).getHorasSemanales();
        }
        return total;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void mostrarInfo() {
        System.out.println("  Plan de estudios version " + version + " - Total horas: " + getTotalHoras() + " hs/sem");
        for (int i = 0; i < materias.size(); i++) {
            System.out.println(materias.get(i));
        }
    }
}