package unico;
/**
 * Implementar un método que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.
 * Ampliación : Repetir el ejercicio anterior con una versión que calcule el máximo de 3
 * números. Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde 
 * cero.
 * 
 */
public class Principal {

	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
		int max;
		int min;
		
		num1 = Entrada.pedirEntero("Introduzca un número:");
		num2 = Entrada.pedirEntero("Introduzca un número:");
		num3 = Entrada.pedirEntero("Introduzca un número:");
		
		
		//LLamada al método...
		max = mayorDe2(num1, num2);
		System.out.println("El mayor es el = " + max);
	}
	
	
	public static int mayorDe2(int n1, int n2) {
		
		int mayor;
		
		mayor = (n1 < n2) ? n2:n1;
		
		return mayor;
	}		

	
	public static int mayorDe3 (int n1, int n2, int n3) {
		int mayor;
		
		mayor = mayorDe2(mayorDe2(n1, n2), n3);
		
		System.out.println("hola");
		return 0;
	}
	
}
