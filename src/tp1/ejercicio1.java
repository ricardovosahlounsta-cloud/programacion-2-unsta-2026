import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota = 0;
        int seguir = 1;

        while (seguir == 1) {

            System.out.println("Ingrese la nota:");
            nota = sc.nextInt();

            if (nota < 4) {
                System.out.println("Desaprobo");
            } else {
                if (nota == 10) {
                    System.out.println("Sobresaliente");
                } else {
                    System.out.println("Aprobo");
                }
            }


            for (int i = 0; i < 1; i++) {
                System.out.println("Quiere ingresar otra nota? 1=si 0=no");
            }

            seguir = sc.nextInt();
        }

        System.out.println("Programa terminado");
    }
}