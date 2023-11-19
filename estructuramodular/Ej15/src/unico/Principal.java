package unico;

/**
 * Implementa un método que nos diga cuántos dígitos tiene un número entero que
 * puede ser positivo o negativo. Se permiten números de hasta 5 dígitos. No se
 * permite el uso de funciones de cadenas.
 * 
 * Ejemplos: Introduce el número: 123 El número 123 tienen 3 dígitos
 * 
 * Introduce el número: -2222 El número -2222 tiene 4 dígitos
 */
public class Principal {

	public static void main(String[] args) {

		int n;
		int a;
		
		do {
			n = Entrada.pedirEntero("Introduzca un numero (maximo 5 dígitos): ");
		}while (n > 100000 && n < -99999);
		
		a = cdigitos(n);
		System.out.println("El número " + n + " tiene " + a + " dígitos");

	}

	public static int cdigitos(int n) {
		
		int quees;
		
		if (n >= 0) {
			quees = positivo(n);
		}else {
			quees =negativo(n);
		}
		
		return quees;
	}

	private static int negativo(int n) {
		int cont = 0;
		
		n = n * -1;
		
		while (n > 0) {
			int digito = n % 10; // Obtenemos el último dígito
	        n /= 10;
	        
	        if (digito > 0) {
	        	cont++;
	        }
		}
		return cont;
		
	}

	public static int positivo(int n) {
		int cont = 0;
		
		while (n > 0) {
			int digito = n % 10; // Obtenemos el último dígito
	        n /= 10;
	        
	        if (digito > 0) {
	        	cont++;
	        }
		}
		return cont;
		
	}

}
