import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Ingrese un numero del 1 al 99:");
        num = sc.nextInt();

        if (num < 10) {
            System.out.println("Tiene un digito");
        } else {
            System.out.println("Tiene dos digitos");
        }

    }
}