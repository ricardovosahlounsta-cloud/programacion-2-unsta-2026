package tp4.ejercicio5_Esports;

public class TestEsports {

    public static void main(String[] args) {

        System.out.println("=== TEST 1: Crear equipo ===");
        Equipo equipo = new Equipo("Dragon Force");

        System.out.println("\n=== TEST 2: Crear jugadores y agregarlos al equipo ===");
        Jugador jugador1 = new Jugador("ShadowX", "CS2");
        Jugador jugador2 = new Jugador("NightFury", "CS2");
        Jugador jugador3 = new Jugador("BladeRunner", "CS2");
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);
        equipo.agregarJugador(jugador3);

        System.out.println("\n=== TEST 3: Registrar estadisticas de los jugadores ===");
        jugador1.registrarPartida(25, 10, true);
        jugador2.registrarPartida(18, 12, false);
        jugador3.registrarPartida(30, 8, true);

        System.out.println("\n=== TEST 4: Agregar trofeos al historial del equipo ===");
        equipo.agregarTrofeo("Campeon Nacional", "Liga Argentina CS2", 2025);
        equipo.agregarTrofeo("Copa Sudamericana", "CASLA Open 2025", 2025);

        System.out.println("\n=== TEST 5: Ver estado del equipo ===");
        equipo.mostrarEstado();

        System.out.println("\n=== TEST 6: Disolver el equipo ===");
        equipo.disolver();

        System.out.println("\n=== TEST 7: Los jugadores siguen existiendo como agentes libres ===");
        jugador1.mostrarEstadisticas();
        jugador2.mostrarEstadisticas();
        jugador3.mostrarEstadisticas();

        System.out.println("\n=== TEST 8: El historial ya no esta activo ===");
        equipo.mostrarEstado();

        System.out.println("\n=== TEST 9: Intentar agregar jugador a equipo disuelto ===");
        equipo.agregarJugador(new Jugador("Nuevo", "CS2"));

        System.out.println("\n=== TEST 10: Intentar agregar trofeo a historial desactivado ===");
        equipo.agregarTrofeo("Trofeo Fantasma", "Torneo Inexistente", 2026);
    }
}