package tp4.ejercicio4_Coworking;

import java.util.ArrayList;

public class TestCoworking {

    public static void main(String[] args) {

        System.out.println("=== TEST 1: Crear edificio ===");
        Edificio edificio = new Edificio("Torre Norte", "Buenos Aires");

        System.out.println("\n=== TEST 2: Agregar oficinas al edificio ===");
        Oficina oficina1 = new Oficina("101", 10);
        Oficina oficina2 = new Oficina("102", 6);
        Oficina oficina3 = new Oficina("103", 20);
        edificio.agregarOficina(oficina1);
        edificio.agregarOficina(oficina2);
        edificio.agregarOficina(oficina3);

        System.out.println("\n=== TEST 3: Crear muebles y asignarlos a las oficinas ===");
        Mueble escritorio1 = new Mueble("ESC-001", "Escritorio");
        Mueble escritorio2 = new Mueble("ESC-002", "Escritorio");
        Mueble silla1 = new Mueble("SIL-001", "Silla");
        Mueble silla2 = new Mueble("SIL-002", "Silla");
        Mueble silla3 = new Mueble("SIL-003", "Silla");
        oficina1.agregarMueble(escritorio1);
        oficina1.agregarMueble(silla1);
        oficina1.agregarMueble(silla2);
        oficina2.agregarMueble(escritorio2);
        oficina2.agregarMueble(silla3);
        oficina3.setDisponible(false);

        System.out.println("\n=== TEST 4: Mostrar todas las oficinas ===");
        edificio.mostrarOficinas();

        System.out.println("\n=== TEST 5: Mostrar solo las oficinas disponibles ===");
        edificio.mostrarOficinasDisponibles();

        System.out.println("\n=== TEST 6: Remodelar oficina 1, los muebles van al deposito ===");
        ArrayList<Mueble> mueblesRetirados = oficina1.retirarMuebles();
        System.out.println("Cantidad de muebles retirados: " + mueblesRetirados.size());
        for (int i = 0; i < mueblesRetirados.size(); i++) {
            System.out.println("  " + mueblesRetirados.get(i));
        }

        System.out.println("\n=== TEST 7: Reasignar un mueble del deposito a la oficina 3 ===");
        oficina3.agregarMueble(mueblesRetirados.get(0));
        oficina3.setDisponible(true);

        System.out.println("\n=== TEST 8: Ver estado final de todas las oficinas ===");
        edificio.mostrarOficinas();

        System.out.println("\n=== TEST 9: Ver oficinas disponibles actualizadas ===");
        edificio.mostrarOficinasDisponibles();
    }
}