package unico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Ejercicio 2: Encontrar todas las direcciones de correo electrónico en una cadena 
 * ("Mi dirección de correo es user@example.com y otra dirección es admin@example.org").
 */


public class Principal {

	public static void main(String[] args) {
		
		String cadenaEjemplo = "Mi dirección de correo es user@example.com y otra dirección es admin@example.org";
        
		contienecorreo(cadenaEjemplo);
            
    }
	
	public static void contienecorreo(String cadena) {
		String patronCorreo = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
        Pattern pattern = Pattern.compile(patronCorreo);
        Matcher matcher = pattern.matcher(cadena);

        System.out.println("Direcciones de correo encontradas:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }

}
