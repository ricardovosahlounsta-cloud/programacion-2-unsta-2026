package tp3.ejercicio4;

public class Test {

    public static void main(String[] args) {

        Controlador c = new Controlador();

        CamaraSeguridad cam = new CamaraSeguridad();
        TermostatoInteligente t = new TermostatoInteligente();
        Smartphone s = new Smartphone();

        c.agregar(cam);
        c.agregar(t);
        c.agregar(s);

        System.out.println("Conectar WiFi:");
        c.conectarDispositivos();

        System.out.println("Tomar fotos:");
        c.tomarFotos();
    }
}