package unico;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * Ejercicio 7: Validar una dirección IP en el formato X.X.X.X ("192.168.1.1")
 */

public class Principal {

	//hols
	
	
	public static void main(String[] args) {
		String direccionIP = "192.168.1.1";
        if (validarDireccionIP(direccionIP)) {
            System.out.println("La dirección IP es válida.");
        } else {
            System.out.println("La dirección IP no es válida.");
        }
    }

    public static boolean validarDireccionIP(String direccionIP) {
        // Expresión regular para validar una dirección IP
        String patronIP = "^((25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[0-1]?[0-9][0-9]?)$";

        // Compilar la expresión regular
        Pattern pattern = Pattern.compile(patronIP);

        // Crear un objeto Matcher
        Matcher matcher = pattern.matcher(direccionIP);

        // Verificar si hay coincidencia
        return matcher.matches();
    }

}
