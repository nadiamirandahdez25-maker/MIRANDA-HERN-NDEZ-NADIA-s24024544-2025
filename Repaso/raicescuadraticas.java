import java.util.Scanner;
public class RaicesCuadraticas {
public static void main(String args[]) {
        double A, B, C;
        double discriminante, raiz1, raiz2;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el coeficiente A: ");
        A = sc.nextDouble();

        System.out.print("Ingrese el coeficiente B: ");
        B = sc.nextDouble();

        System.out.print("Ingrese el coeficiente C: ");
        C = sc.nextDouble();

        if (A == 0) {
            System.out.println("Error: La ecuación no es cuadrática porque A = 0.");
        } else {
            discriminante = B * B - 4 * A * C;

            if (discriminante < 0) {
                System.out.println("Error: La ecuación tiene raíces imaginarias.");
            } else {
                raiz1 = (-B + Math.sqrt(discriminante)) / (2 * A);
                raiz2 = (-B - Math.sqrt(discriminante)) / (2 * A);

                System.out.println("Raíz 1: " + raiz1);
                System.out.println("Raíz 2: " + raiz2);
            }
        }

        sc.close();
    }
}
