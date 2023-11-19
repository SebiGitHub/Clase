package unico;
/**
 * Implementar un método que, mediante un booleano, nos indique si un número es primo.
 */
public class Principal {

	public static void main(String[] args) {
		int n;
		int cont = 0;
			
		n = Entrada.pedirEntero("Introduzca un numero entero: ");
		cont = divisoresPrimos(n);
		System.out.println("Tiene " + cont + " divisores primos.");
	}

	
	public static int divisoresPrimos(int n) {
		int cont;
		cont = 0;
		
		for(int i = 2; i < n; n++) {
			if(esDivisor(n, i)) {
				if(esPrimo(i)) {
					System.out.println(i);
					cont++;
				}
			}
		}
		return cont;
	}
	
	public static boolean esPrimo(int n) {
		boolean esP;
		int i = 2;
		
		esP = true;
		while(i < n && esP) {
			esP = (n % i != 0);
			i++;
		}
		
		return esP;
	}

	public static boolean esDivisor(int n1, int n2) {
		return (n1 % n2 == 0);
	}



}
