package unico;

/**
 * Implementa un método conversor del Sistema Decimal al Sistema Asteriscos que
 * sustituye cada cifra por un número correspondiente de asteriscos (*) y separa
 * las cifras con un guion.
 * 
 * Introduce un número: 4351 El número 4351 traducido al sistema de asteriscos
 * es: ****-***-*****-*
 * 
 * Introduce un número: 10422 El número 10422 traducido al sistema de asteriscos
 * es: *--****-**-**
 * 
 * Introduce un número: 0 Fin del programa.
 */
public class Principal {

	public static void main(String[] args) {
		int numero;
		while (true) {
			numero = Entrada.pedirEntero("Introduce un número (0 para salir): ");

			if (numero == 0) {
				System.out.println("Fin del programa.");
				break;
			}

			String resultado = convertirAsteriscos(numero);
			System.out.println("El número " + numero + " traducido al sistema de asteriscos es: " + resultado);
		}
	}

	public static String convertirAsteriscos(int numero) {

		if (numero == 0) {
			return "*";
		}

		StringBuilder resultado = new StringBuilder();
		while (numero > 0) {
			int digito = numero % 10;
			resultado.insert(0, obtenerAsteriscos(digito) + "-");
			numero /= 10;
		}

		return resultado.substring(0, resultado.length() - 1); // Eliminar el último guion
	}

	public static String obtenerAsteriscos(int digito) {
		switch (digito) {
		case 0:
			return "-";
		case 1:
			return "*";
		case 2:
			return "**";
		case 3:
			return "***";
		case 4:
			return "****";
		case 5:
			return "*****";
		case 6:
			return "******";
		case 7:
			return "*******";
		case 8:
			return "********";
		case 9:
			return "*********";
		default:
			return "";
		}
	}

}
