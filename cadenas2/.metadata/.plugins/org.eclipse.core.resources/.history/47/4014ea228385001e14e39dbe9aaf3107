package unico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Ejercicio 4: Validar un número de teléfono en el formato (XXX) XXX-XXXX. ("(123) 456-7890").
 */


public class Principal {

	public static void main(String[] args) {
		String numeroTelefono = "(123) 456-7890";
        if (validarNumeroTelefono(numeroTelefono)) {
            System.out.println("El número de teléfono es válido.");
        } else {
            System.out.println("El número de teléfono no es válido.");
        }
    }

    public static boolean validarNumeroTelefono(String numeroTelefono) {
        // Expresión regular para el formato (XXX) XXX-XXXX
        String patronTelefono = "^\\(\\d{3}\\) \\d{3}-\\d{4}$";

        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(patronTelefono);

        // Crear un objeto Matcher
        Matcher matcher = pattern.matcher(numeroTelefono);

        // Verificar si hay coincidencia
        return matcher.matches();
    }

}
