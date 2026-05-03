package ejercicios;

import java.util.Scanner;

public class reloj {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        n2reloj r = new n2reloj();

        int h;
        int m;
        int s;

        System.out.println("Ingrese la hora:");
        h = teclado.nextInt();

        System.out.println("Ingrese los minutos:");
        m = teclado.nextInt();

        System.out.println("Ingrese los segundos:");
        s = teclado.nextInt();

        r.establecerHora(h, m, s);

        r.mostrarHora();

        r.avanzarSegundo();

        r.mostrarHora();
    }
}