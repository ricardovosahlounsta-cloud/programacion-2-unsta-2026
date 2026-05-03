import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dia, mes, año;

        System.out.println("Ingrese el dia:");
        dia = sc.nextInt();

        System.out.println("Ingrese el mes:");
        mes = sc.nextInt();

        System.out.println("Ingrese el año:");
        año = sc.nextInt();

        if (mes >= 1 && mes <= 3) {
            System.out.println("Primer trimestre");
        } else {
            if (mes >= 4 && mes <= 6) {
                System.out.println("Segundo trimestre");
            } else {
                if (mes >= 7 && mes <= 9) {
                    System.out.println("Tercer trimestre");
                } else {
                    if (mes >= 10 && mes <= 12) {
                        System.out.println("Cuarto trimestre");
                    } else {
                        System.out.println("Mes incorrecto");
                    }
                }
            }
        }

    }
}