import java.util.Scanner;
public class Pulsaciones {
public static void main (String args[]) {
	double pulsaciones;
	int edad;
	Scanner leer= new Scanner(System.in);
		System.out.println("Dime tu edad");
		edad=leer.nextInt();
		pulsaciones=((220-edad)/10);
		System.out.println("Tu número de pulsaciones por cada 10 segundos de ejercicio es: " + pulsaciones);
	}
}
		