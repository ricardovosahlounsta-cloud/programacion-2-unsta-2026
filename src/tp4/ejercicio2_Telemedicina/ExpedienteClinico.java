package tp4.ejercicio2_Telemedicina;

import java.util.ArrayList;

public class ExpedienteClinico {

    private String numero;
    private ArrayList<EntradaMedica> entradas;

    public ExpedienteClinico(String numero) {
        this.numero = numero;
        this.entradas = new ArrayList<>();
    }

    public void agregarEntrada(EntradaMedica entrada) {
        entradas.add(entrada);
        System.out.println("Entrada agregada al expediente " + numero + ": " + entrada.getTipo());
    }

    public void mostrarHistorial() {
        System.out.println("Expediente: " + numero);
        for (int i = 0; i < entradas.size(); i++) {
            System.out.println("  " + entradas.get(i));
        }
    }

    public void mostrarSoloDiagnosticos() {
        System.out.println("Diagnosticos del expediente: " + numero);
        for (int i = 0; i < entradas.size(); i++) {
            if (entradas.get(i).getTipo().equals("DIAGNOSTICO")) {
                System.out.println("  " + entradas.get(i));
            }
        }
    }

    public String getNumero() {
        return numero;
    }

    public int getCantidadEntradas() {
        return entradas.size();
    }
}