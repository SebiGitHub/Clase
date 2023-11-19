package unico;
/**
 * Implementar un método recursivo que permita conocer si un número es binario o no (sólo contiene 0 y 1).
	esBinario(100110) = true
	esBinario(104110) = false
 */
public class Principal {

	public static void main(String[] args) {
		int binario1 = 100110;
        int binario2 = 104110;

        // Llamada al método para verificar si es binario
        boolean resultado1 = esBinario(binario1);
        boolean resultado2 = esBinario(binario2);

        System.out.println(binario1 + " es binario: " + resultado1);
        System.out.println(binario2 + " es binario: " + resultado2);
    }

    // Método recursivo para verificar si un número es binario
    public static boolean esBinario(int numero) {
        // Caso base: si el número es 0 o 1, es binario
        if (numero == 0 || numero == 1) {
            return true;
        } else {
            // Caso recursivo: verificar el último dígito y llamar recursivamente con el resto
            int ultimoDigito = numero % 10;
            if (ultimoDigito != 0 && ultimoDigito != 1) {
                return false;  // Si el último dígito no es 0 ni 1, no es binario
            } else {
                return esBinario(numero / 10);  // Llamada recursiva con el resto de los dígitos
            }
        }
    }

}
