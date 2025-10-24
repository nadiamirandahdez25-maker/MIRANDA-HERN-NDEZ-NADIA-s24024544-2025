import java.util.Scanner;
public class Grados {
public static void main(String args[]) {
	double centigrados;
	double Fahrenheit;
	double absoluta;
	Scanner leer= new Scanner(System.in);
		System.out.println("Dame la cantidad en centígrados: ");
		centigrados=leer.nextDouble();
		Fahrenheit=(centigrados*1.8)+32;
		absoluta=(centigrados+273.15);
		System.out.println("Temperatura en grados Fahrenheit: " + Fahrenheit);
		System.out.println("Temperatura absoluta: " + absoluta);
	}
}