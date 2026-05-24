package tp4.ejercicio3_TrenAzucarero;

public class TestTrenAzucarero {

    public static void main(String[] args) {

        System.out.println("=== TEST 1: Crear tren con locomotora ===");
        Locomotora locomotora1 = new Locomotora("LOCO-01", "General Motors GT26", 3600);
        TrenAzucarero tren1 = new TrenAzucarero("TREN-01", locomotora1);
        System.out.println(locomotora1);

        System.out.println("\n=== TEST 2: Crear vagones y engancharlos al tren ===");
        VagonCanero v1 = new VagonCanero("VAG-01", 50);
        VagonCanero v2 = new VagonCanero("VAG-02", 50);
        VagonCanero v3 = new VagonCanero("VAG-03", 40);
        tren1.engancharVagon(v1);
        tren1.engancharVagon(v2);
        tren1.engancharVagon(v3);

        System.out.println("\n=== TEST 3: Asignar hoja de ruta al tren ===");
        HojaDeRuta hoja1 = new HojaDeRuta("HR-2026-001", "Tucuman", "Rosario", 1100);
        tren1.asignarHojaDeRuta(hoja1);

        System.out.println("\n=== TEST 4: Cargar vagones ===");
        v1.cargar(45);
        v2.cargar(50);
        v3.cargar(30);

        System.out.println("\n=== TEST 5: Intentar cargar mas de la capacidad ===");
        v1.cargar(999);

        System.out.println("\n=== TEST 6: Ver estado del tren con capacidad dinamica ===");
        tren1.mostrarEstado();

        System.out.println("\n=== TEST 7: Desenganchar un vagon y asignarlo a otro tren ===");
        Locomotora locomotora2 = new Locomotora("LOCO-02", "Alco RSD", 2800);
        TrenAzucarero tren2 = new TrenAzucarero("TREN-02", locomotora2);
        VagonCanero vagonReasignado = tren1.desengancharVagon("VAG-03");
        tren2.engancharVagon(vagonReasignado);

        System.out.println("\n=== TEST 8: Ver capacidad actualizada del tren 1 y del tren 2 ===");
        System.out.println("Capacidad maxima tren 1: " + tren1.getCapacidadTotalMaxima() + " ton");
        System.out.println("Capacidad maxima tren 2: " + tren2.getCapacidadTotalMaxima() + " ton");

        System.out.println("\n=== TEST 9: Cancelar viaje del tren 1 y la hoja de ruta se invalida ===");
        tren1.cancelarViaje();
        System.out.println(hoja1);

        System.out.println("\n=== TEST 10: Los vagones siguen existiendo aunque se desengancharon ===");
        System.out.println(vagonReasignado);
        tren2.mostrarEstado();
    }
}