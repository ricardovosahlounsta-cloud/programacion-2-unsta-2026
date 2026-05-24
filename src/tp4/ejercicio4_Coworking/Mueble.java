package tp4.ejercicio4_Coworking;

public class Mueble {

    private String id;
    private String tipo;
    private String estado;

    public Mueble(String id, String tipo) {
        this.id = id;
        this.tipo = tipo;
        this.estado = "EN_DEPOSITO";
    }

    public void asignarAOficina() {
        this.estado = "EN_USO";
    }

    public void enviarADeposito() {
        this.estado = "EN_DEPOSITO";
        System.out.println("El mueble " + id + " fue enviado al deposito");
    }

    public String getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public String getEstado() {
        return estado;
    }

    public String toString() {
        return tipo + " [" + id + "] - Estado: " + estado;
    }
}