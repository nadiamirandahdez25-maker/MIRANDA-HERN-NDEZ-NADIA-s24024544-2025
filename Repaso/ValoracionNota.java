import java.util.Scanner;
public class ValoracionNota {
public static void main(String args[]) {
        double nota;
        String valoracion;
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota numérica (0.0 a 5.0): ");
        nota = sc.nextDouble();

        if (nota >= 0.0 && nota <= 1.0) {
            valoracion = "P (Pésimo)";
        } else if (nota >= 1.1 && nota <= 2.0) {
            valoracion = "M (Mal)";
        } else if (nota >= 2.1 && nota <= 2.9) {
            valoracion = "R (Regular)";
        } else if (nota >= 3.0 && nota <= 4.0) {
            valoracion = "B (Bien)";
        } else if (nota >= 4.1 && nota <= 5.0) {
            valoracion = "E (Excelente)";
        } else {
            valoracion = "Nota fuera de rango. Debe estar entre 0.0 y 5.0.";
        }

        // Resultado
        System.out.println("Valoración: " + valoracion);

    }
}
