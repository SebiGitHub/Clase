package unico;

/*Implementar un método que reciba una cadena e indique si el carácter de la 
 * posición central es o no un espacio.
 * */

public class Principal {

	public static void main(String[] args) {
		String palabra;
		boolean tieneEspacioEnElCentro;

		
		palabra = "aaaaMxAbbbb";
		
		tieneEspacioEnElCentro = centroEsEspacio(palabra);
		
		System.out.println("¿Tiene espacios en el centro?: " + (tieneEspacioEnElCentro ? "Sí" : "No"));

	}

	private static boolean centroEsEspacio(String str) {

		int posicionCentral;
		char c; 
		boolean esEspacio;
		
		posicionCentral = str.length()/2;
		c = str.charAt(posicionCentral);
		
		esEspacio = (c == ' ');
		
		return esEspacio;
	}

}
