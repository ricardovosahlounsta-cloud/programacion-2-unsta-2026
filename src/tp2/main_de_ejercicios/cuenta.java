package ejercicios;

import java.util.Scanner;

public class cuenta {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String numero;
        String nombre;
        double saldo;

        System.out.println("Ingrese numero de cuenta:");
        numero = teclado.nextLine();

        System.out.println("Ingrese nombre del titular:");
        nombre = teclado.nextLine();

        System.out.println("Ingrese saldo inicial:");
        saldo = teclado.nextDouble();

        ejercicios.n3cuentabancaria c = new ejercicios.n3cuentabancaria(numero, nombre, saldo);

        double deposito;
        double retiro;

        System.out.println("Ingrese monto a depositar:");
        deposito = teclado.nextDouble();
        c.depositar(deposito);

        System.out.println("Ingrese monto a retirar:");
        retiro = teclado.nextDouble();
        c.retirar(retiro);

        System.out.println("Saldo actual: " + c.consultarSaldo());
    }
}