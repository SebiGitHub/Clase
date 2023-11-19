package unico;
/**
 * Implementar un método recursivo que calcule el valor n de la serie de Fibonacci; donde f (n) = f (n-2) + f (n-1), y lo devuelva. Los primeros valores de la serie son siempre: 0, 1.
	Orden = 0, 1, 2, 3, 4, 5, 6, 7  , 8 , 9  …
	Serie = 0, 1, 1, 2, 3, 5, 8, 13 , 21, 34 …
	fibonacci(8) = 21
 */
public class Principal {

	public static void main(String[] args) {
		int n = 8;

        // Llamada al método Fibonacci
        int resultado = fibonacci(n);
        System.out.println("El valor en la serie de Fibonacci para n = " + n + " es: " + resultado);
    }

    // Método recursivo para calcular el valor en la serie de Fibonacci
    public static int fibonacci(int n) {
        // Caso base: los primeros dos valores son siempre 0 y 1
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Caso recursivo: f(n) = f(n-2) + f(n-1)
            return fibonacci(n - 2) + fibonacci(n - 1);
        }
    }

}
