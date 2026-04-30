package tp3.ejercicio4;

public class Smartphone implements TomarFoto, Wifi {

    public void tomarFoto() {
        System.out.println("Smartphone toma una foto");
    }

    public void conectarWifi() {
        System.out.println("Smartphone conectado a WiFi");
    }
}