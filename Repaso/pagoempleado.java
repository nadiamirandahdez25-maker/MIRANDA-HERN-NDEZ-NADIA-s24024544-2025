import java.util.Scanner;
public class pagoempleado {
public static void main(String args[]) {
        int categoria;
        double tarifa = 0;
        int horas;
        double descuentoSalud = 0.072;
        double subsidio = 0.15;
	Scanner sc = new Scanner(System.in);
        	System.out.print("Ingrese la categoría del empleado (1 a 4): ");
        	categoria = sc.nextInt();

        	System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        	horas = sc.nextInt();

        	switch (categoria) {
            	case 1: tarifa = 20000; break;
            	case 2: tarifa = 15000; break;
            	case 3: tarifa = 10000; break;
            	case 4: tarifa = 7500; break;
            	default:
                	System.out.println("Categoría inválida.");
                	sc.close();
                	return;
        	}

        	double salarioBruto = tarifa * horas;
        	double montoDescuento = salarioBruto * descuentoSalud;
        	double salarioNeto = salarioBruto - montoDescuento;

        	if (salarioBruto < 1000000) {
            	double montoSubsidio = salarioBruto * subsidio;
            	salarioNeto += montoSubsidio;
            	System.out.println("Incluye subsidio de $" + montoSubsidio);
        	}

        	System.out.println("Salario bruto: $" + salarioBruto);
        	System.out.println("Descuento por salud (7.2%): $" + montoDescuento);
        	System.out.println("Salario neto a pagar: $" + salarioNeto);

        
    	}
}
