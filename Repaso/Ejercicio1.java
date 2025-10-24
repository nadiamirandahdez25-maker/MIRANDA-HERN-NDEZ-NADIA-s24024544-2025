import java.util.Scanner;
public class Ejercicio1 {
public static void main(String args[]){
	double metros;
	double pulgadas;
	double pies;
	Scanner leer= new Scanner(System.in);
		System.out.println("Dame la cantidad de metros: ");
		metros=leer.nextDouble();
		pies=(metros*3.28);
		pulgadas=(metros*39.37);
		System.out.println("CONVERSIÓN");
		System.out.println("Metros a Pulgadas= " + pulgadas);
		System.out.println("Metros a Pies= " + pies);
	}
}
