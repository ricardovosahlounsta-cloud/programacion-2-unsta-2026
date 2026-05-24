package tp4.ejercicio1_Neobanco;

public class TestNeobanco {

    public static void main(String[] args) {

        System.out.println("=== TEST 1: Crear usuario con billetera ===");
        Usuario usuario = new Usuario("Juan Perez", "BILL-001");
        System.out.println(usuario);

        System.out.println("\n=== TEST 2: Agregar cuentas a la billetera ===");
        Cuenta cuentaPesos = new Cuenta("PESOS", "ARS", 50000);
        Cuenta cuentaDolares = new Cuenta("DOLARES", "USD", 200);
        Cuenta cuentaCripto = new Cuenta("CRIPTO", "BTC", 0.05);
        usuario.getBilletera().agregarCuenta(cuentaPesos);
        usuario.getBilletera().agregarCuenta(cuentaDolares);
        usuario.getBilletera().agregarCuenta(cuentaCripto);

        System.out.println("\n=== TEST 3: Agregar tarjetas a la billetera ===");
        TarjetaCredito tc1 = new TarjetaCredito("4111-1111", "Juan Perez", 100000);
        TarjetaCredito tc2 = new TarjetaCredito("5500-2222", "Juan Perez", 50000);
        usuario.getBilletera().agregarTarjeta(tc1);
        usuario.getBilletera().agregarTarjeta(tc2);

        System.out.println("\n=== TEST 4: Ver estado de la billetera ===");
        usuario.getBilletera().mostrarEstado();

        System.out.println("\n=== TEST 5: Transferencia exitosa entre cuentas ===");
        usuario.getBilletera().transferir("PESOS", "DOLARES", 10000);

        System.out.println("\n=== TEST 6: Transferencia fallida por saldo insuficiente ===");
        usuario.getBilletera().transferir("PESOS", "DOLARES", 999999);

        System.out.println("\n=== TEST 7: Solicitar nueva billetera (cuentas se eliminan, tarjetas migran) ===");
        usuario.solicitarNuevaBilletera("BILL-002");

        System.out.println("\n=== TEST 8: Ver estado de la nueva billetera ===");
        usuario.getBilletera().mostrarEstado();

        System.out.println("\n=== TEST 9: Agregar nuevas cuentas a la nueva billetera ===");
        usuario.getBilletera().agregarCuenta(new Cuenta("PESOS", "ARS", 0));
        usuario.getBilletera().mostrarEstado();
    }
}