package unico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Ejercicio 6: Extraer todos los números de una cadena ("Tenemos 5 manzanas y 3 peras en la caja.").
 */

public class Principal {

	public static void main(String[] args) {
		   String cadena = "Tenemos 5 manzanas y 3 peras en la caja.";
	        extraerNumeros(cadena);
	    }

	    public static void extraerNumeros(String cadena) {
	        // Utilizar la expresión regular para encontrar todos los números en la cadena
	        String patronNumeros = "\\d+";
	        Pattern pattern = Pattern.compile(patronNumeros);
	        Matcher matcher = pattern.matcher(cadena);

	        // Iterar sobre las coincidencias y mostrar los números
	        while (matcher.find()) {
	            System.out.println("Número encontrado: " + matcher.group());
	        }
	    }

}
