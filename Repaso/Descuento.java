import java.util.Scanner;
public class Descuento {
public static void main(String args[]) {
	double totalc;
	double totald;
	double descuento;
	Scanner leer= new Scanner(System.in);
		System.out.println("¿Cuál es el total de tu compra?");
		totalc=leer.nextDouble();
		descuento=(totalc*0.15);
		totald=(totalc-descuento);
		System.out.println("El monto a pagar con descuento aplicado del 15% es de: " + totald);
	}
}
		