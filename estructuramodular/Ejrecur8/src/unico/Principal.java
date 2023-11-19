package unico;
/**
 * Implementar un método recursivo que permita sumar los dígitos de un número.
	sumarDigitos(234) = 2 + 3 + 4 = 9
 */
public class Principal {

	public static void main(String[] args) {
		int numero = 234;

        // Llamada al método de suma de dígitos
        int resultado = sumarDigitos(numero);
        System.out.println("La suma de los dígitos de " + numero + " es: " + resultado);
    }

    // Método recursivo para sumar los dígitos de un número
    public static int sumarDigitos(int numero) {
        // Caso base: si el número es menor que 10, su suma de dígitos es el propio número
        if (numero < 10) {
            return numero;
        } else {
            // Caso recursivo: sumar el último dígito y llamar recursivamente con el resto
            return numero % 10 + sumarDigitos(numero / 10);
        }
    }

}
