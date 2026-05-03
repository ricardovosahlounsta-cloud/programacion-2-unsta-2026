package ejercicios;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        n1calculadora c = new n1calculadora();

        double num1;
        double num2;

        System.out.println("Ingrese el primer numero:");
        num1 = teclado.nextDouble();

        System.out.println("Ingrese el segundo numero:");
        num2 = teclado.nextDouble();

        System.out.println("Suma: " + c.sumar(num1, num2));
        System.out.println("Resta: " + c.restar(num1, num2));
        System.out.println("Multiplicacion: " + c.multiplicar(num1, num2));
        System.out.println("Division: " + c.dividir(num1, num2));
    }
}