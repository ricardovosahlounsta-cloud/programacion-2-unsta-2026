package ejercicios;

public class n2reloj {

    int hora;
    int minutos;
    int segundos;

    public void establecerHora(int h, int m, int s) {
        hora = h;
        minutos = m;
        segundos = s;
    }

    public void mostrarHora() {
        System.out.println(hora + ":" + minutos + ":" + segundos);
    }

    public void avanzarSegundo() {
        segundos = segundos + 1;

        if (segundos == 60) {
            segundos = 0;
            minutos = minutos + 1;

            if (minutos == 60) {
                minutos = 0;
                hora = hora + 1;

                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }
}