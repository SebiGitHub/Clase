package unico;
/**
 * Implementar un método recursivo que permita la suma de los n primeros números naturales.
	sumar(5) = 1 + 2 + 3 + 4 + 5 = 15
 */
public class Principal {

	public static void main(String[] args) {
		 int n = 5;

	        // Llamada al método de suma de números naturales
	        int resultado = sumarNaturales(n);
	        System.out.println("La suma de los primeros " + n + " números naturales es: " + resultado);
	    }

	    // Método recursivo para calcular la suma de los primeros n números naturales
	public static int sumarNaturales(int n) {
	        // Caso base: la suma de los primeros 0 números naturales es 0
	        if (n == 0) {
	            return 0;
	        } else {
	            // Caso recursivo: suma(n) = n + suma(n-1)
	            return n + sumarNaturales(n - 1);
	        }
	    }

}
