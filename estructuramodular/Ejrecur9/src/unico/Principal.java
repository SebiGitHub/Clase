package unico;
/**
 * Implementar un método recursivo que permita convertir a binario un número decimal (base 10).
	dec_bin(23) = 10111
 */
public class Principal {

	public static void main(String[] args) {
		 int decimal = 23;

	        // Llamada al método de conversión de decimal a binario
	        String binario = decABin(decimal);
	        System.out.println("La representación binaria de " + decimal + " es: " + binario);
	    }

	    // Método recursivo para convertir decimal a binario
	    public static String decABin(int decimal) {
	        // Caso base: si el número es 0, su representación binaria es "0"
	        if (decimal == 0) {
	            return "0";
	        } else {
	            // Caso recursivo: convertir el cociente a binario y concatenar el residuo
	            return decABin(decimal / 2) + (decimal % 2);
	        }
	    }

}
