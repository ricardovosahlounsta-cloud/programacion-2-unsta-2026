import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Ingrese el valor de x:");
        x = sc.nextInt();

        System.out.println("Ingrese el valor de y:");
        y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("1er cuadrante");
        } else {
            if (x < 0 && y > 0) {
                System.out.println("2do cuadrante");
            } else {
                if (x < 0 && y < 0) {
                    System.out.println("3er cuadrante");
                } else {
                    if (x > 0 && y < 0) {
                        System.out.println("4to cuadrante");
                    } else {
                        System.out.println("No esta en un cuadrante");
                    }
                }
            }
        }

    }
}