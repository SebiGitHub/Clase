package unico;

/*
 * Ejercicio 5: Separar palabras en una cadena ("Hola, ¿cómo estás?").
 */

public class Principal {

	public static void main(String[] args) {
		String cadena = "Hola, ¿cómo estás?";
        String[] palabras = separarPalabras(cadena);

        System.out.println("Palabras separadas:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    public static String[] separarPalabras(String cadena) {
        // Utilizar el método split con expresión regular para separar por espacios y 
    	//otros caracteres no alfanuméricos.
        String[] palabras = cadena.split("\\W+");

        return palabras;
    }

}
