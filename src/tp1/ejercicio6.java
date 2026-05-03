import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        int i = 1;

        int l1, l2, l3;

        int equilatero = 0;
        int isosceles = 0;
        int escaleno = 0;

        System.out.println("Cuantos triangulos quiere ingresar:");
        n = sc.nextInt();

        while (i <= n) {

            System.out.println("Triangulo " + i);

            System.out.println("Ingrese lado 1:");
            l1 = sc.nextInt();

            System.out.println("Ingrese lado 2:");
            l2 = sc.nextInt();

            System.out.println("Ingrese lado 3:");
            l3 = sc.nextInt();

            if (l1 == l2 && l2 == l3) {
                System.out.println("Equilatero");
                equilatero = equilatero + 1;
            } else {
                if (l1 == l2 || l1 == l3 || l2 == l3) {
                    System.out.println("Isosceles");
                    isosceles = isosceles + 1;
                } else {
                    System.out.println("Escaleno");
                    escaleno = escaleno + 1;
                }
            }

            i = i + 1;
        }

        System.out.println("Cantidad de equilateros: " + equilatero);
        System.out.println("Cantidad de isosceles: " + isosceles);
        System.out.println("Cantidad de escalenos: " + escaleno);

        // ver cual tiene menor cantidad
        if (equilatero < isosceles && equilatero < escaleno) {
            System.out.println("Hay menos equilateros");
        } else {
            if (isosceles < equilatero && isosceles < escaleno) {
                System.out.println("Hay menos isosceles");
            } else {
                if (escaleno < equilatero && escaleno < isosceles) {
                    System.out.println("Hay menos escalenos");
                } else {
                    System.out.println("Hay empate en cantidades");
                }
            }
        }

    }
}
