package unico;

/**
 * Realizar un programa que dibuja flechas señalando hacia la izquierda. Se
 * solicitará al usuario la altura de la flecha que deberá ser impar y mayor o
 * igual que tres. En caso de no ser así se seguirá solicitando la altura. El
 * "palito" de la flecha será siempre de 5 caracteres "*".
 * 
 * El dibujo de la flecha lo debe implementar el método: public static void
 * flecha(int n)
 * 
 * Introduzca la altura de la flecha: 3
 *   *
 *  *
 * *******
 *  *
 *   *
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
				flecha(altura);
			} else {
				System.out.println("La altura debe ser mayor o igual a 3 y un número impar. Inténtelo de nuevo.");
			}
		}
	}

	public static void flecha(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < Math.abs((n - 1) / 2 - i); j++) {
				System.out.print(" ");
			}

			if (i == (n - 1) / 2) {
				System.out.println("********");
			} else {
				System.out.println("*");
			}
		}
	}

}
