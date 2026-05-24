package tp4.ejercicio2_Telemedicina;

public class TestTelemedicina {

    public static void main(String[] args) {

        System.out.println("=== TEST 1: Crear medicos ===");
        Medico medico1 = new Medico("MAT-001", "Ana Garcia", "Cardiologia");
        Medico medico2 = new Medico("MAT-002", "Luis Torres", "Clinica General");
        System.out.println(medico1);
        System.out.println(medico2);

        System.out.println("\n=== TEST 2: Crear paciente con expediente ===");
        Paciente paciente = new Paciente("12345678", "Carlos Rodriguez");
        System.out.println(paciente);

        System.out.println("\n=== TEST 3: Agregar entradas medicas al expediente ===");
        paciente.agregarEntrada("01/05/2026", "DIAGNOSTICO", "Hipertension leve detectada", medico1);
        paciente.agregarEntrada("01/05/2026", "RECETA", "Enalapril 10mg una vez al dia", medico1);
        paciente.agregarEntrada("15/05/2026", "DIAGNOSTICO", "Presion estabilizada, mejora notable", medico2);
        paciente.agregarEntrada("15/05/2026", "RECETA", "Continuar tratamiento y reducir sal", medico2);

        System.out.println("\n=== TEST 4: Mostrar historial completo ===");
        paciente.mostrarHistorial();

        System.out.println("\n=== TEST 5: Mostrar reporte de evolucion solo diagnosticos ===");
        paciente.mostrarReporteEvolucion();

        System.out.println("\n=== TEST 6: Dar de baja al paciente y su expediente se elimina ===");
        paciente.darDeBaja();

        System.out.println("\n=== TEST 7: Intentar ver historial de paciente dado de baja ===");
        paciente.mostrarHistorial();

        System.out.println("\n=== TEST 8: Intentar agregar entrada a paciente dado de baja ===");
        paciente.agregarEntrada("20/05/2026", "DIAGNOSTICO", "Esto no deberia registrarse", medico1);

        System.out.println("\n=== TEST 9: Los medicos siguen existiendo aunque el paciente fue dado de baja ===");
        System.out.println(medico1);
        System.out.println(medico2);
    }
}