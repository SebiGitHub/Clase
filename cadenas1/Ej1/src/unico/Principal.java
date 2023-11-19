package unico;

/*Implementar un método que reciba 2 palabras y devuelva la más corta.*/

public class Principal {

	public static void main(String[] args) {
		String palabra1;
		String palabra2;
		String masCorta;

		
		palabra1 = "Margarita";
		palabra2 = "Rosa";
		
		masCorta = palabraMasCorta(palabra1, palabra2);
		
		System.out.println("La palabra mas corta: " + masCorta);

	}

	private static String palabraMasCorta(String p1, String p2) {

		int long1; //Longitud de la p1
		int long2; //Longitud de la p2
		
		String mc; //Contendra la palabra mas corta
		
		long1 = p1.length();
		long2 = p2.length();
		
		mc = (long1 < long2) ? p1:p2;
		
		return mc;
	}

}
