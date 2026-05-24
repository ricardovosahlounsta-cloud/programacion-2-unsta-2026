package tp4.ejercicio1_Neobanco;

import java.util.ArrayList;

public class Usuario {

    private String nombre;
    private Billetera billetera;

    public Usuario(String nombre, String idBilletera) {
        this.nombre = nombre;
        this.billetera = new Billetera(idBilletera);
    }

    public void solicitarNuevaBilletera(String nuevoId) {
        ArrayList<TarjetaCredito> tarjetasMigradas = billetera.cerrarBilletera();
        billetera = new Billetera(nuevoId);
        for (int i = 0; i < tarjetasMigradas.size(); i++) {
            billetera.agregarTarjeta(tarjetasMigradas.get(i));
        }
        System.out.println("Nueva billetera " + nuevoId + " creada con " + tarjetasMigradas.size() + " tarjeta(s) migrada(s)");
    }

    public Billetera getBilletera() {
        return billetera;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Usuario: " + nombre;
    }
}