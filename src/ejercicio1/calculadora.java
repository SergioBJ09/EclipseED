package ejercicio1;
import java.util.*;

// Declaramos la Clase
public class calculadora {
	
	// Declaramos la funcion sumar
	public static double sumar(double a, double b) {
		return a + b;
	}
	
	// Declaramos la funcion restar
	public static double restar(double a, double b) {
		return a - b;
	}
	
	
	// Declaramos la funcion main
	public static void main(String[] args) {

		// Declarar la clase Scanner
		Scanner scanner = new Scanner(System.in);
		
		// Inicio del programa
		System.out.println("Bienvenido a la aplicacion de Calculadora Simple");
		// Comentario realizado despues de la edicion de forma remota
		// Comentario añadido de forma remota desde Github
		
		// Input del primer numero
		System.out.print("Introduce el primer número: ");
		double numero1 = scanner.nextDouble();
		
		// Input del segundo numero
		System.out.print("Introduce el segundo número: ");
		double numero2 = scanner.nextDouble();      
		
		// Declarar variable de Suma y Resta y llamada a las funciones anteriormente creadas
		double resultadoSuma = sumar(numero1, numero2);
		double resultadoResta = restar(numero1, numero2);
		
		// Print de resultados
		System.out.println("Resultado de la suma: " + resultadoSuma);
		System.out.println("Resultado de la resta: " + resultadoResta);
		
		// Cierre de la clase Scanner
		scanner.close();
	}
}
