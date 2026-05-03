package ejercicios;

public class n3cuentabancaria {

    String numeroCuenta;
    String titular;
    double saldo;

    // CONSTRUCTOR
    public n3cuentabancaria(String num, String nom, double sal) {
        numeroCuenta = num;
        titular = nom;
        saldo = sal;
    }

    public void depositar(double monto) {
        saldo = saldo + monto;
        System.out.println("Deposito realizado");
    }

    public void retirar(double monto) {
        if (saldo >= monto) {
            saldo = saldo - monto;
            System.out.println("Retiro realizado");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double consultarSaldo() {
        return saldo;
    }
}