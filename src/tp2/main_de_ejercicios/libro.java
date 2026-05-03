package ejercicios;

import java.util.Scanner;

public class libro {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        String titulo;
        String autor;
        String isbn;

        System.out.println("Ingrese el titulo del libro:");
        titulo = teclado.nextLine();

        System.out.println("Ingrese el autor:");
        autor = teclado.nextLine();

        System.out.println("Ingrese el ISBN:");
        isbn = teclado.nextLine();

        n4libro l = new n4libro(titulo, autor, isbn);

        l.mostrarInformacion();

        l.prestar();
        l.mostrarInformacion();

        l.devolver();
        l.mostrarInformacion();
    }
}