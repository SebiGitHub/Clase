package unico;

/*
 * Ejercicio 3: Reemplazar todas las vocales en una cadena con "X" ("Hola, mundo!").
 */


public class Principal {

	public static void main(String[] args) {
		 String texto = "HOla, mundo!";
	        String resultado = reemplazarVocales(texto);
	        System.out.println("Resultado: " + resultado);
	    }

	    public static String reemplazarVocales(String texto) {
	    	String textoenm = texto.toLowerCase();
	        return textoenm.replaceAll("[aeiouáéíóúäëïöü]", "X");
	    }

}
