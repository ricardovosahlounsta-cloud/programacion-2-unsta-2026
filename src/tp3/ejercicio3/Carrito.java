package tp3.ejercicio3;

public class Carrito {

    public void pagar(Pago metodo, double monto) {
        metodo.procesarPago(monto);
    }
}