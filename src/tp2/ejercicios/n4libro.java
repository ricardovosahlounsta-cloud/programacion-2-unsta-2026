package ejercicios;

public class n4libro {

    String titulo;
    String autor;
    String isbn;
    boolean disponible;

    public n4libro(String t, String a, String i) {
        titulo = t;
        autor = a;
        isbn = i;
        disponible = true;
    }

    public void prestar() {
        if (disponible == true) {
            disponible = false;
            System.out.println("El libro fue prestado");
        } else {
            System.out.println("El libro ya esta prestado");
        }
    }

    public void devolver() {
        disponible = true;
        System.out.println("El libro fue devuelto");
    }

    public void mostrarInformacion() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);

        if (disponible == true) {
            System.out.println("Estado: Disponible");
        } else {
            System.out.println("Estado: Prestado");
        }
    }
}