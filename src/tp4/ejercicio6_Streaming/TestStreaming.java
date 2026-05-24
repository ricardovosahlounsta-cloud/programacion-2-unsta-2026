package tp4.ejercicio6_Streaming;

public class TestStreaming {

    public static void main(String[] args) {

        System.out.println("=== TEST 1: Crear actores ===");
        Actor actor1 = new Actor("Bryan Cranston", "Estadounidense");
        Actor actor2 = new Actor("Aaron Paul", "Estadounidense");
        Actor actor3 = new Actor("Anna Gunn", "Estadounidense");
        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);

        System.out.println("\n=== TEST 2: Crear episodios y agregar actores ===");
        Episodio ep1 = new Episodio(1, "Piloto", 58);
        ep1.agregarActor(actor1);
        ep1.agregarActor(actor2);

        Episodio ep2 = new Episodio(2, "El Gato en el Bolso", 48);
        ep2.agregarActor(actor1);
        ep2.agregarActor(actor3);

        Episodio ep3 = new Episodio(3, "Y la Bolsa Llorara", 48);
        ep3.agregarActor(actor1);

        Episodio ep4 = new Episodio(1, "Seven Thirty Seven", 47);
        ep4.agregarActor(actor1);
        ep4.agregarActor(actor2);

        Episodio ep5 = new Episodio(2, "Grilled", 47);
        ep5.agregarActor(actor1);

        System.out.println("\n=== TEST 3: Crear temporadas y agregar episodios ===");
        Temporada temporada1 = new Temporada(1, 2008);
        temporada1.agregarEpisodio(ep1);
        temporada1.agregarEpisodio(ep2);
        temporada1.agregarEpisodio(ep3);

        Temporada temporada2 = new Temporada(2, 2009);
        temporada2.agregarEpisodio(ep4);
        temporada2.agregarEpisodio(ep5);

        System.out.println("\n=== TEST 4: Crear serie y agregar temporadas ===");
        Serie serie = new Serie("Breaking Bad", "Drama");
        serie.agregarTemporada(temporada1);
        serie.agregarTemporada(temporada2);

        System.out.println("\n=== TEST 5: Mostrar informacion completa de la serie ===");
        serie.mostrarInfo();

        System.out.println("\n=== TEST 6: Mostrar duracion total de la serie en horas y minutos ===");
        int minutos = serie.getDuracionTotal();
        int horas = minutos / 60;
        int minutosRestantes = minutos % 60;
        System.out.println("Duracion total de " + serie.getTitulo() + ": " + minutos + " min (" + horas + "h " + minutosRestantes + "min)");

        System.out.println("\n=== TEST 7: Un actor puede estar en otra serie ===");
        Serie serie2 = new Serie("Malcolm in the Middle", "Comedia");
        Temporada temp1Serie2 = new Temporada(1, 2000);
        Episodio ep1Serie2 = new Episodio(1, "Piloto", 22);
        ep1Serie2.agregarActor(actor1);
        temp1Serie2.agregarEpisodio(ep1Serie2);
        serie2.agregarTemporada(temp1Serie2);
        serie2.mostrarInfo();

        System.out.println("\n=== TEST 8: Los actores siguen existiendo independientemente ===");
        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);
    }
}