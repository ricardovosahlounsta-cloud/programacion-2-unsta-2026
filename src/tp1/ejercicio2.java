import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota1, nota2, nota3;
        double promedio;

        System.out.println("Ingrese la primera nota:");
        nota1 = sc.nextInt();

        System.out.println("Ingrese la segunda nota:");
        nota2 = sc.nextInt();

        System.out.println("Ingrese la tercera nota:");
        nota3 = sc.nextInt();

        promedio = (nota1 + nota2 + nota3) / 3;

        if (promedio >= 8) {
            System.out.println("El alumno esta promocionado");
        } else {
            System.out.println("El alumno no esta promocionado");
        }

    }
}