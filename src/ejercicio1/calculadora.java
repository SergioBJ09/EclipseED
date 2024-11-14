package ejercicio1;
import java.util.*;


public class calculadora {
	public static double sumar(double a, double b) {
		return a + b;
	}
	
	public static double restar(double a, double b) {
		return a - b;
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bienvenido a la aplicacion de Calculadora Simple");
		// Comentario realizado en la rama features
		// Comentario añadido de forma remota desde Github
		System.out.print("Introduce el primer número: ");
		double numero1 = scanner.nextDouble();      
		System.out.print("Introduce el segundo número: ");
		double numero2 = scanner.nextDouble();      
		double resultadoSuma = sumar(numero1, numero2);
		double resultadoResta = restar(numero1, numero2);
		System.out.println("Resultado de la suma: " + resultadoSuma);
		System.out.println("Resultado de la resta: " + resultadoResta);
		scanner.close();
	}
}
