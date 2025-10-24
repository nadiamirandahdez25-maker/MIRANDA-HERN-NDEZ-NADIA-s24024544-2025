import java.util.Scanner;
public class Edad {
public static void main(String args[]) {
	int añon;
	int añoa;
	int edad;
	Scanner leer= new Scanner(System.in);
		System.out.println("Cuál es tu año de nacimiento?");
		añon=leer.nextInt();
		System.out.println("Dame el año actual");
		añoa=leer.nextInt();
		edad=(añoa-añon);
		System.out.println("Tu edad es: " + edad);
	}
}

		