import java.util.Scanner;
public class PresupuestoHospital {
public static void main(String[] args) {
        double presupuesto;
        double ginecologia, traumatologia, pediatria;
        double porcGine = 0.40;
        double porcTrauma = 0.30;
        double porcPedia = 0.30;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el presupuesto anual del hospital: ");
        presupuesto = sc.nextDouble();

        ginecologia = presupuesto * porcGine;
        traumatologia = presupuesto * porcTrauma;
        pediatria = presupuesto * porcPedia;

        System.out.println("Distribución del presupuesto:");
        System.out.println("Ginecología: $" + ginecologia);
        System.out.println("Traumatología: $" + traumatologia);
        System.out.println("Pediatría: $" + pediatria);

    }
}
