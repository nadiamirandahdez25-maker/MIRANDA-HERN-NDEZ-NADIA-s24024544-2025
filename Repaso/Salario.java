import java.util.Scanner;
public class Salario {
public static void main(String args[]) {
	double salarioa;
	double porcentaje;
	double salariof;
	Scanner leer= new Scanner(System.in);
		System.out.println("¿Cuál era tu salario anterior?");
		salarioa=leer.nextDouble();
		porcentaje=(salarioa*0.25);
		salariof=(salarioa+porcentaje);
		System.out.println("Tu nuevo salario con el 25% aplicado es de: " + salariof);
	}
}