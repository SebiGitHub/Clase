package unico;
/**
 * Implementar un método que decida si dos números enteros positivos son amigos. 
 * Dos números son amigos si la suma de los divisores propios (distinto de él mismo) 
 * del primer número es igual al segundo número, y viceversa. 
 * Ejemplos: (220 - 284), (1184 - 1210)
 */
public class Principal {

	public static void main(String[] args) {
		int n1;
		int n2;
		int a;
		String mensaje;
			
		n1 = Entrada.pedirEntero("Introduzca un numero entero: ");
		n2 = Entrada.pedirEntero("Introduzca un numero entero: ");
		a = amigos(n1, n2);
		
		if (a == 1) {
			mensaje = "Son amigos";
		}else {
			mensaje = "No son amigos";
		}
		System.out.println(mensaje);
	}

	private static int amigos(int n1, int n2) {
		
		int suma1 = 0;
		int suma2 = 0;
		int amigos;

		
		for (int i = 1; i < n1 - 1; i++) {
			if (n1 % i == 0) {
				suma1 += i;
			}
		}
		
		for (int j = 1; j < n2 - 1; j++) {
			if (n2 % j == 0) {
				suma2 += j;
			}
		}
		
	
		if(suma1 == suma2)
		{
			amigos = 1;
		}else {
			amigos = 0;
		}
		
		return amigos;
	}

	
	



}
