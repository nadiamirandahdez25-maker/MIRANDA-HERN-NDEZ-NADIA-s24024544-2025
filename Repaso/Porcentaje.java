import java.util.Scanner;
public class Porcentaje {
public static void main(String args[]) {
	int total;
	double mujeres;
	double hombres;
	double porcentajeh;
	double porcentajem;
	Scanner leer= new Scanner(System.in);
		System.out.println("Dame el número total de estudiantes");
		total=leer.nextInt();
		System.out.println("Dame la cantidad de mujeres");
		mujeres=leer.nextDouble();
		System.out.println("Dame la cantidad de hombres");
		hombres=leer.nextDouble();
		porcentajeh=((hombres/total)*100);
		porcentajem=((mujeres/total)*100);
		System.out.println("El porcentaje de mujeres es de: " + porcentajem + "%");
		System.out.println("El porcentaje de hombres es de: " + porcentajeh + "%");
	}
}
		