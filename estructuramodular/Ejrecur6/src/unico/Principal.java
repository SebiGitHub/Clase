package unico;
/**
 * Implementar un método recursivo que calcule y devuelva el doble factorial de un número n recibido por parámetro.
	El doble factorial de un número n es: n!! = n·(n-2)!!
	dobleFactorial (9)  =  9!! =  9 x 7 x 5 x 3 x 1 = 945
	dobleFactorial (10) = 10!! = 10 x 8 x 6 x 4 x 2 = 3840
 */
public class Principal {

	public static void main(String[] args) {
		int n = 9;

        // Llamada al método de doble factorial
        int resultado = dobleFactorial(n);
        System.out.println("El doble factorial de " + n + " es: " + resultado);
    }

    // Método recursivo para calcular el doble factorial
    public static int dobleFactorial(int n) {
        // Caso base: el doble factorial de 0 o 1 es 1
        if (n == 0 || n == 1) {
            return 1;
        } else {
            // Caso recursivo: n!! = n * (n-2)!!
            return n * dobleFactorial(n - 2);
        }
    }

}
