package unico;

/*Implementar un método que reciba frase pedida al usuario por teclado 
 * e indique cuántos espacios en blanco tiene.
 * */

public class Principal {

	public static void main(String[] args) {
		String frase;
		int totalEspacios;

		
		frase = "Habia una vez un ser maquiavelico";
		
		totalEspacios = contarEspacios(frase);
		
		System.out.println("Tiene: " + totalEspacios + " espacios.");

	}

	private static int contarEspacios(String str) {

		int contador = 0;
		
		for(int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				contador++;
			}
		}
		
		return contador;
	}

}
