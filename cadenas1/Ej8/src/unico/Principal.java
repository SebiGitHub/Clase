package unico;

/*Implementar un método que reciba un carácter y una cadena, y devuelva cuántas veces aparece ese carácter en mayúsculas en esa cadena.
	Ejemplo: Para la letra ‘a’, y la cadena “supercALIFRAGILISTICOESPIalidoso” → 
	El carácter ‘a’ aparece dos veces en mayúsculas, así que la función devolverá 2.
	Nota: Desde la función principal (main), debe llamarse a la función, 
	así como mostrar el mensaje “La letra ‘a’ aparece 2 veces en la cadena 
	supercALIFRAGILISTICOESPIalidoso”
 * */

public class Principal {

	public static void main(String[] args) {
		char letra = 's';
        String cadena = "supercALIFRAGILISTICOESPIalidoso";

        // Llamada al método
        int contador = contarMayusculas(letra, cadena);

        // Mostrar el resultado
        System.out.println("La letra '" + letra + "' aparece " + contador + " veces en mayúsculas en la cadena " + cadena);
    }

    // Método que cuenta cuántas veces aparece el carácter en mayúsculas en la cadena
    public static int contarMayusculas(char caracter, String cadena) {
        int contador = 0;

        // Iterar sobre la cadena
        for (int i = 0; i < cadena.length(); i++) {
            // Verificar si el carácter actual es una letra mayúscula y es igual al carácter dado
            if (Character.isUpperCase(cadena.charAt(i)) && Character.toUpperCase(cadena.charAt(i)) == caracter) {
                contador++;
            }
        }

        return contador;
    }

}
