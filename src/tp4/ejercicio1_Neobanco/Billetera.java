package tp4.ejercicio1_Neobanco;

import java.util.ArrayList;

public class Billetera {

    private String id;
    private ArrayList<Cuenta> cuentas;
    private ArrayList<TarjetaCredito> tarjetas;

    public Billetera(String id) {
        this.id = id;
        this.cuentas = new ArrayList<>();
        this.tarjetas = new ArrayList<>();
    }

    public void agregarCuenta(Cuenta cuenta) {
        cuentas.add(cuenta);
        System.out.println("Cuenta " + cuenta.getTipo() + " agregada a la billetera " + id);
    }

    public void agregarTarjeta(TarjetaCredito tarjeta) {
        tarjetas.add(tarjeta);
        System.out.println("Tarjeta " + tarjeta.getNumero() + " agregada a la billetera " + id);
    }

    public TarjetaCredito quitarTarjeta(String numero) {
        for (int i = 0; i < tarjetas.size(); i++) {
            if (tarjetas.get(i).getNumero().equals(numero)) {
                TarjetaCredito tarjeta = tarjetas.remove(i);
                System.out.println("Tarjeta " + numero + " quitada de la billetera " + id);
                return tarjeta;
            }
        }
        System.out.println("No se encontro la tarjeta " + numero);
        return null;
    }

    public void transferir(String tipoOrigen, String tipoDestino, double monto) {
        Cuenta origen = null;
        Cuenta destino = null;

        for (int i = 0; i < cuentas.size(); i++) {
            if (cuentas.get(i).getTipo().equals(tipoOrigen)) {
                origen = cuentas.get(i);
            }
            if (cuentas.get(i).getTipo().equals(tipoDestino)) {
                destino = cuentas.get(i);
            }
        }

        if (origen == null || destino == null) {
            System.out.println("No se encontraron las cuentas indicadas");
            return;
        }

        System.out.println("Transfiriendo " + monto + " de " + tipoOrigen + " a " + tipoDestino);
        boolean ok = origen.extraer(monto);
        if (ok) {
            destino.depositar(monto);
            System.out.println("Transferencia exitosa");
        }
    }

    public double getSaldoConsolidado() {
        double total = 0;
        for (int i = 0; i < cuentas.size(); i++) {
            total = total + cuentas.get(i).getSaldo();
        }
        return total;
    }

    public ArrayList<TarjetaCredito> cerrarBilletera() {
        System.out.println("Cerrando billetera " + id + ". Las cuentas se eliminan.");
        cuentas.clear();
        ArrayList<TarjetaCredito> tarjetasLiberadas = new ArrayList<>(tarjetas);
        tarjetas.clear();
        return tarjetasLiberadas;
    }

    public void mostrarEstado() {
        System.out.println("Billetera: " + id);
        System.out.println("Cuentas:");
        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println("  " + cuentas.get(i));
        }
        System.out.println("Tarjetas:");
        for (int i = 0; i < tarjetas.size(); i++) {
            System.out.println("  " + tarjetas.get(i));
        }
        System.out.println("Saldo consolidado: $" + getSaldoConsolidado());
    }

    public String getId() {
        return id;
    }
}