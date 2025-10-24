import java.util.Scanner;
public class ParONon {
    public static void main(String args[]) {
        int N;
        String tipo;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número entero: ");
        N = sc.nextInt();

        if (N % 2 == 0) {
            tipo = "Par";
        } else {
            tipo = "Non";
        }

        System.out.println("Número ingresado: " + N);
        System.out.println("El número es: " + tipo);

        sc.close();
    }
}
