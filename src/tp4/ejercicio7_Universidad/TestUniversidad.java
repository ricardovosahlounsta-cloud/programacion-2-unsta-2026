package tp4.ejercicio7_Universidad;

import java.util.ArrayList;

public class TestUniversidad {

    public static void main(String[] args) {

        System.out.println("=== TEST 1: Crear docentes ===");
        Docente docente1 = new Docente("Carlos Lopez", "DOC-001", 20);
        Docente docente2 = new Docente("Maria Gomez", "DOC-002", 16);
        Docente docente3 = new Docente("Pedro Ruiz", "DOC-003", 24);
        System.out.println(docente1);
        System.out.println(docente2);
        System.out.println(docente3);

        System.out.println("\n=== TEST 2: Crear materias ===");
        Materia prog1 = new Materia("Programacion 1", "INF-101", 6);
        Materia prog2 = new Materia("Programacion 2", "INF-102", 6);
        Materia baseDatos = new Materia("Base de Datos", "INF-201", 4);
        Materia redes = new Materia("Redes", "INF-301", 4);
        Materia calculo = new Materia("Calculo 1", "CIV-101", 6);
        Materia fisica = new Materia("Fisica 1", "CIV-102", 6);

        System.out.println("\n=== TEST 3: Crear carreras con sus materias ===");
        Carrera informatica = new Carrera("Ingenieria Informatica", "2024");
        informatica.agregarMateria(prog1);
        informatica.agregarMateria(prog2);
        informatica.agregarMateria(baseDatos);
        informatica.agregarMateria(redes);

        Carrera civil = new Carrera("Ingenieria Civil", "2023");
        civil.agregarMateria(calculo);
        civil.agregarMateria(fisica);

        System.out.println("\n=== TEST 4: Crear facultad y agregar carreras ===");
        Facultad facultad = new Facultad("Facultad de Ingenieria");
        facultad.agregarCarrera(informatica);
        facultad.agregarCarrera(civil);

        System.out.println("\n=== TEST 5: Asignar docentes a materias ===");
        prog1.asignarDocente(docente1);
        prog2.asignarDocente(docente1);
        baseDatos.asignarDocente(docente2);
        redes.asignarDocente(docente3);
        calculo.asignarDocente(docente3);
        fisica.asignarDocente(docente2);

        System.out.println("\n=== TEST 6: Mostrar estructura de la facultad ===");
        facultad.mostrarInfo();

        System.out.println("\n=== TEST 7: Validar carga horaria de los docentes ===");
        ArrayList<Docente> docentes = new ArrayList<>();
        docentes.add(docente1);
        docentes.add(docente2);
        docentes.add(docente3);
        facultad.validarCargaDocentes(docentes);

        System.out.println("\n=== TEST 8: Intentar exceder carga horaria de un docente ===");
        Materia inteligenciaArtificial = new Materia("Inteligencia Artificial", "INF-401", 8);
        informatica.agregarMateria(inteligenciaArtificial);
        inteligenciaArtificial.asignarDocente(docente1);
        Materia machineLearning = new Materia("Machine Learning", "INF-402", 6);
        informatica.agregarMateria(machineLearning);
        machineLearning.asignarDocente(docente1);
        facultad.validarCargaDocentes(docentes);

        System.out.println("\n=== TEST 9: Cerrar la facultad y las carreras desaparecen ===");
        facultad.cerrar();
        facultad.mostrarInfo();

        System.out.println("\n=== TEST 10: Los docentes siguen existiendo aunque la facultad cerro ===");
        System.out.println(docente1);
        System.out.println(docente2);
        System.out.println(docente3);

        System.out.println("\n=== TEST 11: Intentar agregar carrera a facultad cerrada ===");
        facultad.agregarCarrera(new Carrera("Ingenieria Mecanica", "2024"));
    }
}