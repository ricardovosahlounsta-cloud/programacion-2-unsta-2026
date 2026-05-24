package tp4.ejercicio1_Neobanco;

public class Cuenta {

    private String tipo;
    private String moneda;
    private double saldo;

    public Cuenta(String tipo, String moneda, double saldoInicial) {
        this.tipo = tipo;
        this.moneda = moneda;
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println("Se deposito " + monto + " " + moneda + ". Saldo actual: " + saldo);
    }

    public boolean extraer(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo insuficiente en cuenta " + tipo + ". Saldo actual: " + saldo);
            return false;
        }
        saldo = saldo - monto;
        System.out.println("Se extrajeron " + monto + " " + moneda + ". Saldo actual: " + saldo);
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getMoneda() {
        return moneda;
    }

    public String toString() {
        return "Cuenta " + tipo + " en " + moneda + " - Saldo: " + saldo;
    }
}