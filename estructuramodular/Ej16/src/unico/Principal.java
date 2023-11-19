package unico;

public class Principal {

	public static void main(String[] args) {
		/*
		 * mplementa un método que permita la conversión de números binarios
		 * introducidos por consola a decimal.
		 * 
		 * Ejemplo de conversión de binario (base 2) a decimal (base 10): 01102 = 0*23 +
		 * 1*22 + 1*21 + 0*20 = 610
		 */
		final String ERROR = "Eso no es un numero en binario";

		int num;

		boolean aux;
		// Validacion loquisima
		do {
			num = Entrada.pedirEntero("Introduce un numero binario: ");
			aux = Validacion(num);

			if (aux) {
				System.out.println("\n" + ERROR);
			}
		} while (aux);

		// Proceso de conversion
		
			ConversionBinario(num);
		}

	private static boolean Validacion(int n) {

		boolean aux; // Necesito que aux me de el valor true si los valores no son ni 0 ni 1.
		aux = false;
		int i;

		while (n >= 1 && !aux) {
			i = n % 10;
			n /= 10;
			n -= (n % 10) / 10;

			if (i != 1 && i != 0) {
				aux = true;
			}

		}
		return aux;
	}

	private static void ConversionBinario(int n) {
		int i;
		i=0;
		
		int cont;
		cont=0;
		
		int sum;
		sum=0;
		
		while (n >= 1) {
			i = n % 10;
			
			n /= 10;
			n -= (n % 10) / 10;
			
			i*=Math.pow(2, cont);
			
			cont++;
			sum+=i;
		}
		System.out.print(sum);
	}
}
