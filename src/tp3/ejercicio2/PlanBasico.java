package tp3.ejercicio2;

public class PlanBasico extends Suscripcion {

    public PlanBasico(String email, int numeroCliente, double costoBase) {
        super(email, numeroCliente, costoBase);
    }

    public double calcularCosto() {
        return costoBase;
    }
}