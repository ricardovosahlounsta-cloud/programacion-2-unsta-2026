package tp4.ejercicio5_Esports;

public class Jugador {

    private String nombre;
    private String juego;
    private int kills;
    private int muertes;
    private int victorias;
    private boolean agenteLibre;

    public Jugador(String nombre, String juego) {
        this.nombre = nombre;
        this.juego = juego;
        this.kills = 0;
        this.muertes = 0;
        this.victorias = 0;
        this.agenteLibre = true;
    }

    public void registrarPartida(int kills, int muertes, boolean victoria) {
        this.kills = this.kills + kills;
        this.muertes = this.muertes + muertes;
        if (victoria == true) {
            this.victorias = this.victorias + 1;
        }
    }

    public void setAgenteLibre(boolean agenteLibre) {
        this.agenteLibre = agenteLibre;
    }

    public boolean isAgenteLibre() {
        return agenteLibre;
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarEstadisticas() {
        String estado;
        if (agenteLibre == true) {
            estado = "AGENTE LIBRE";
        } else {
            estado = "EN EQUIPO";
        }
        System.out.println("  Jugador: " + nombre + " | Juego: " + juego + " | Kills: " + kills + " | Muertes: " + muertes + " | Victorias: " + victorias + " | " + estado);
    }

    public String toString() {
        return "Jugador: " + nombre + " - Juego: " + juego;
    }
}