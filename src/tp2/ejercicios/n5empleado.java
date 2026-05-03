package ejercicios;

public class n5empleado {

    int legajo;
    String nombre;
    double salario;

    static int contador = 0;

    public n5empleado(String nom, double sal) {
        contador = contador + 1;
        legajo = contador;
        nombre = nom;
        salario = sal;
    }

    public void aumentarPorcentaje(double porcentaje) {
        double aumento;
        aumento = salario * porcentaje / 100;
        salario = salario + aumento;
        System.out.println("Aumento por porcentaje aplicado");
    }

    public void aumentarFijo(double monto) {
        salario = salario + monto;
        System.out.println("Aumento fijo aplicado");
    }

    public void mostrarEmpleado() {
        System.out.println("Legajo: " + legajo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
    }

    public static void mostrarCantidadEmpleados() {
        System.out.println("Cantidad de empleados: " + contador);
    }
}