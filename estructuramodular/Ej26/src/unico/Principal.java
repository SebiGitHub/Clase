package unico;

/**
 * Escribe un programa que, dado un número entero, diga cuáles son y cuánto
 * suman los dígitos que sean par por un lado, y los que sean impar por otro.
 * Usa long en lugar de int donde sea necesario para admitir números largos.
 * 
 * Implemente los métodos que sean precisos, entre otros:
 * 
 * public static int sumaDigitosPares(long numero)
 * 
 * public static int sumaDigitosImpares(long numero)
 * 
 * Por favor, introduzca un número entero positivo: 94026782 Suma de los dígitos
 * pares: 22 Suma de los dígitos impares: 16
 * 
 * Por favor, introduzca un número entero positivo: 31779 Suma de los dígitos
 * pares: 0 Suma de los dígitos impares: 27
 */
public class Principal {

	public static void main(String[] args) {
		long numero;
		while (true) {
			numero = Entrada.pedirEntero("Introduce un número (0 para salir): ");

			if (numero == 0) {
				System.out.println("Fin del programa.");
				break;
			}

			if (numero > 0) {
				int sumaPares = sumaDigitosPares(numero);
				int sumaImpares = sumaDigitosImpares(numero);

				System.out.println("Suma de los dígitos pares: " + sumaPares);
				System.out.println("Suma de los dígitos impares: " + sumaImpares);
			} else {
				System.out.println("Por favor, introduzca un número entero positivo.");
			}
		}
	}

	public static int sumaDigitosPares(long numero) {
		return sumaDigitosPorParidad(numero, true);
	}

	public static int sumaDigitosImpares(long numero) {
		return sumaDigitosPorParidad(numero, false);
	}

	private static int sumaDigitosPorParidad(long numero, boolean par) {
		int suma = 0;

		while (numero > 0) {
			int digito = (int) (numero % 10);

			if ((digito % 2 == 0) == par) {
				suma += digito;
			}

			numero /= 10;
		}

		return suma;
	}

}
