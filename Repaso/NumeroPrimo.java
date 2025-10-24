import java.util.Scanner;
public class NumeroPrimo {
public static void main(String args[]) {
        int N;
        boolean esPrimo = true;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        N = sc.nextInt();

        if (N <= 1) {
            esPrimo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }

        System.out.println("Número ingresado: " + N);
        if (esPrimo) {
            System.out.println("El número es Primo.");
        } else {
            System.out.println("El número NO es Primo.");
        }

    }
}
