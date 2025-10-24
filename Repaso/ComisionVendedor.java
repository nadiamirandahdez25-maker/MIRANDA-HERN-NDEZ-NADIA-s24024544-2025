import java.util.Scanner;
public class ComisionVendedor {
public static void main(String args[]) {
        double venta1, venta2, venta3, venta4;
        double comision1, comision2, comision3, comision4;
        double totalComisiones;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el valor de la venta 1: ");
        venta1 = sc.nextDouble();
        System.out.print("Ingrese el valor de la venta 2: ");
        venta2 = sc.nextDouble();
        System.out.print("Ingrese el valor de la venta 3: ");
        venta3 = sc.nextDouble();
        System.out.print("Ingrese el valor de la venta 4: ");
        venta4 = sc.nextDouble();

        comision1 = calcularComision(venta1);
        comision2 = calcularComision(venta2);
        comision3 = calcularComision(venta3);
        comision4 = calcularComision(venta4);

        totalComisiones = comision1 + comision2 + comision3 + comision4;

        System.out.println("Comisión venta 1: $" + comision1);
        System.out.println("Comisión venta 2: $" + comision2);
        System.out.println("Comisión venta 3: $" + comision3);
        System.out.println("Comisión venta 4: $" + comision4);
        System.out.println("Total ganado en comisiones: $" + totalComisiones);

    }

    public static double calcularComision(double venta) {
        if (venta <= 10000000) {
            return venta * 0.02;
        } else if (venta < 15000000) {
            return venta * 0.04;
        } else {
            return venta * 0.10;
        }
    }
}
