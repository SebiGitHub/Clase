package unico;
/*
 * Ejercicio 1: Verificar si una cadena contiene un número entero ("12345").
 */


public class Principal {

	public static void main(String[] args) {
		String cadenaEjemplo = "12345";
        if (contieneNumeroEntero(cadenaEjemplo)) {
            System.out.println("La cadena contiene un número entero.");
        } else {
            System.out.println("La cadena no contiene un número entero.");
        }
    }
	
	public static boolean contieneNumeroEntero(String cadena) {
        for (char caracter : cadena.toCharArray()) {
            if (!Character.isDigit(caracter)) {
                return false;
            }
        }
        return true;
        
    }

}
