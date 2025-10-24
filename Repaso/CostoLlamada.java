import java.util.Scanner;
public class CostoLlamada {
public static void main(String args[]) {
        int minutos;
        double costoTotal;
        double tarifaBase = 10.0;
        double costoAdicional = 1.0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la duración de la llamada en minutos: ");
        minutos = sc.nextInt();

        if (minutos <= 3) {
            costoTotal = tarifaBase;
        } else {
            costoTotal = tarifaBase + (minutos - 3) * costoAdicional;
        }

        System.out.println("Duración de la llamada: " + minutos + " minutos");
        System.out.println("Total a pagar: N$" + costoTotal);

    }
}
