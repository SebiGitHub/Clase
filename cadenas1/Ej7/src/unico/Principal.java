package unico;

/*Realizar un programa que haga lo siguiente:

Crear un StringBuilder con la cadena "Alabí Alixar" y mostrarla por consola.
Mostrar por consola su capacidad y longitud.
Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Chicharrones de Chiclana" y mostrarla por consola.
Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Hay 5000 Chicharrones" y mostrarla por consola. El número entero 5000 debe estar almacenado en un int inicialmente.
Partiendo de la cadena anterior y usando los métodos de StringBuilder modificar la cadena para que pase a ser "Hay 5000 Chicharrones en Chiclana" y mostrarla por consola.
Almacenar en un String los últimos 4 caracteres del StringBuilder resultante y mostrar ese String por consola.
Mostrar por consola la capacidad y longitud del StringBuilder final.
Realizar el mismo ejercicio con la clase StringBuffer.
 * */

public class Principal {

	public static void main(String[] args) {

		 // Crear un StringBuilder con la cadena "Alabí Alixar" y mostrarla por consola.
        StringBuilder stringBuilder = new StringBuilder("Alabí Alixar");
        System.out.println("Cadena inicial: " + stringBuilder.toString());

        // Mostrar por consola su capacidad y longitud.
        System.out.println("Capacidad inicial: " + stringBuilder.capacity());
        System.out.println("Longitud inicial: " + stringBuilder.length());

        // Modificar la cadena para que sea "Chicharrones de Chiclana" y mostrarla por consola.
        stringBuilder.replace(0, stringBuilder.length(), "Chicharrones");
        System.out.println(stringBuilder.toString());

        // Modificar la cadena para que sea "Hay 5000 Chicharrones" y mostrarla por consola.
        int cantidad = 5000;
        stringBuilder.insert(0, "Hay " + cantidad + " ");
        System.out.println(stringBuilder.toString());

        // Modificar la cadena para que sea "Hay 5000 Chicharrones en Chiclana" y mostrarla por consola.
        stringBuilder.append(" en Chiclana");
        System.out.println(stringBuilder.toString());

        // Almacenar en un String los últimos 4 caracteres del StringBuilder resultante y mostrar ese String.
        String ultimosCuatroCaracteres = stringBuilder.substring(stringBuilder.length() - 4);
        System.out.println("Últimos 4 caracteres: " + ultimosCuatroCaracteres);

        // Mostrar por consola la capacidad y longitud del StringBuilder final.
        System.out.println("Capacidad final: " + stringBuilder.length());
        System.out.println("Longitud final: " + stringBuilder.length());

    }
		

}
