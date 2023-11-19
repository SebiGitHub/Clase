package unico;

/**
 * Realiza un programa que pinte un reloj de arena relleno hecho de asteriscos.
 * El programa debe pedir la altura. Se debe comprobar que la altura sea un
 * número impar mayor o igual a 3, en caso contrario se debe mostrar un mensaje
 * de error.
 * 
 * El dibujo del reloj de arena lo debe implementar el método: public static
 * void relojArena(int n)
 * 
 * Introduzca la altura del reloj de arena (>3) (0-Salir): 3
 *	***
 *	 *
 *	***
 * 
 */
public class Principal {

	public static void main(String[] args) {
		int altura;

		while (true) {
			altura = Entrada.pedirEntero("Introduce un número (0 para salir): ");

			if (altura == 0) {
				System.out.println("Fin del programa.");
				break;
			}

			if (altura >= 3 && altura % 2 != 0) {
				relojArena(altura);
			} else {
				System.out.println("Error: La altura debe ser un número impar mayor o igual a 3.");
			}
		}
	}

	public static void relojArena(int n) {
		int espacios = 0;

		// Parte superior del reloj
		for (int i = 0; i < n / 2 + 1; i++) {
			imprimirEspacios(espacios);
			imprimirAsteriscos(n - 2 * espacios);
			espacios++;
		}

		// Parte inferior del reloj
		espacios = n / 2 - 1;
		for (int i = 0; i < n / 2; i++) {
			imprimirEspacios(espacios);
			imprimirAsteriscos(n - 2 * espacios);
			espacios--;
		}
	}

	private static void imprimirAsteriscos(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();
	}

	private static void imprimirEspacios(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(" ");
		}
	}

}
