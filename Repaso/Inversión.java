import java.util.Scanner;
public class Inversión {
public static void main(String args[]) {
	double capital;
	double porcentaje;
	double total;
	Scanner leer= new Scanner(System.in);
		System.out.println("¿Cuál es tu monto a invertir?");
		capital=leer.nextDouble();
		porcentaje=(capital*0.02);
		total=(capital+porcentaje);
		System.out.println("El monto final después de un mes es de:" + total);
	}
}