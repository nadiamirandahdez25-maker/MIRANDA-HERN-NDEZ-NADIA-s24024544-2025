import java.util.Scanner;
public class Ejercicio2 {
public static void main (String args[]){
	double radio;
	double perimetro;
	double area;
	double pi= 3.14;
	Scanner leer= new Scanner(System.in);
		System.out.println("Dame el radio de la circunferencia");
		radio=leer.nextDouble();
		perimetro=(2*pi*radio);
		area=(pi*radio*radio);
		System.out.println("Perímetro y área");
		System.out.println("Perímetro= " + perimetro);
		System.out.println("Área= " + area);
	}
}