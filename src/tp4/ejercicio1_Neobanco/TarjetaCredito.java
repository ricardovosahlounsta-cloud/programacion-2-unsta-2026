package tp4.ejercicio1_Neobanco;

public class TarjetaCredito {

    private String numero;
    private String titular;
    private double limiteCredito;

    public TarjetaCredito(String numero, String titular, double limiteCredito) {
        this.numero = numero;
        this.titular = titular;
        this.limiteCredito = limiteCredito;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public String toString() {
        return "Tarjeta [" + numero + "] - Titular: " + titular + " - Limite: $" + limiteCredito;
    }
}