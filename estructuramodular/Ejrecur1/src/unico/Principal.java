package unico;
/**
 * Calcular el factorial de n recursivamente. Recordar que por definición, el factorial de 1 es 1.
	factorial(5) = 5! = 5 x 4 x 3 x 2 x 1 = 120
 */
public class Principal {

	public static void main(String[] args) {
		int n = 5;
        long resultado = factorial(n);
        System.out.println("El factorial de " + n + " es: " + resultado);
    }

    // Función recursiva para calcular el factorial
    public static long factorial(int n) {
        // Caso base: factorial de 0 o 1 es 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Caso recursivo: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

}
