import java.util.Scanner;
public class DescuentoPromocion {
public static void main(String args[]) {
        double totalCompra;
        int numeroPromocion;
        double descuento;
        double porcentaje;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el total de la compra: ");
        totalCompra = sc.nextDouble();

        System.out.print("Ingrese el número de promoción (0 a 99): ");
        numeroPromocion = sc.nextInt();

        if (numeroPromocion < 74) {
            porcentaje = 0.15;
        } else {
            porcentaje = 0.20;
        }

        descuento = totalCompra * porcentaje;

        // Resultado
        System.out.println("Número de promoción: " + numeroPromocion);
        System.out.println("Descuento aplicado: $" + descuento);

    }
}
