import java.util.Scanner;
public class Promedio {
public static void main(String args[]) {
	double cal1;
	double cal2;
	double cal3;
	double promedio;
	Scanner leer= new Scanner(System.in);
		System.out.println("Dame la primera calificación");
		cal1=leer.nextDouble();
		System.out.println("Dame la segunda calificación");
		cal2=leer.nextDouble();
		System.out.println("Dame la tercera calificación");
		cal3=leer.nextDouble();
		promedio=((cal1+cal2+cal3)/3);
		System.out.println("Tu promedio final es de: " + promedio);
	}
}
		
	