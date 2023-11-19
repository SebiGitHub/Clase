package unico;
/**
 * Implementar un método que, mediante un booleano, nos indique si un número es primo.
 */
public class Principal {

	public static void main(String[] args) {
		int n;
		String mensaje;
			
		n = Entrada.pedirEntero("Introduzca un numero entero");
		mensaje = (esPrimo(n)) ? "Sí es primo" : "No es primo";
		
		System.out.println(mensaje);
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



}
