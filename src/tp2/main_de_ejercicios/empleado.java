package ejercicios;

import java.util.Scanner;

public class empleado {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String nombre;
        double salario;

        System.out.println("Ingrese nombre del empleado 1:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese salario:");
        salario = teclado.nextDouble();

        n5empleado e1 = new n5empleado(nombre, salario);

        teclado.nextLine(); // limpiar buffer

        System.out.println("Ingrese nombre del empleado 2:");
        nombre = teclado.nextLine();
        System.out.println("Ingrese salario:");
        salario = teclado.nextDouble();

        n5empleado e2 = new n5empleado(nombre, salario);

        e1.mostrarEmpleado();
        e2.mostrarEmpleado();

        double porcentaje;
        double monto;

        System.out.println("Ingrese porcentaje de aumento para empleado 1:");
        porcentaje = teclado.nextDouble();
        e1.aumentarPorcentaje(porcentaje);

        System.out.println("Ingrese monto fijo para empleado 2:");
        monto = teclado.nextDouble();
        e2.aumentarFijo(monto);

        e1.mostrarEmpleado();
        e2.mostrarEmpleado();

        n5empleado.mostrarCantidadEmpleados();
    }
}