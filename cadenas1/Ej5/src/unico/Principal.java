package unico;

/*Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, 
 * el segundo, debe insertar otra intentando acertarla con las pistas que le dará el programa: 
 * número de caracteres, primera y última letra. 
 * El programa debe escribir "Acertaste" o "Fallaste".

Ampliación: Se debe escribir "Acertaste" o "Menor" o "Mayor", según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.
 * */

public class Principal {

	public static void main(String[] args) {
		String contraseña;
		String intentodecontraseña;
		boolean aciertoofallo;
		
		contraseña = Entrada.pedirCadena("Escribe una contraseña alfabetica: ");
		
		 // Limpiar la pantalla para ocultar la contraseña ingresada al segundo jugador
        for (int i = 0; i < 20; ++i) {
        	System.out.println();
        }
		
        System.out.println("¡Bienvenido a Acierta la Contraseña!");
        
     // Mostrar pistas al jugador que adivina
        System.out.println("Pista: La contraseña tiene " + contraseña.length() + " caracteres.");
        System.out.println("Pista: La primera letra de la contraseña es '" + contraseña.charAt(0) + "' y la última letra es '" + contraseña.charAt(contraseña.length() - 1) + "'.");

        // Pedir al segundo jugador que ingrese una contraseña
        intentodecontraseña = Entrada.pedirCadena("Adivina la contraseña: ");

        // Verificar si la contraseña ingresada es correcta
        int comparacion = intentodecontraseña.compareTo(contraseña);

        if (comparacion == 0) {
            System.out.println("¡Acertaste! ¡Felicidades!");
        } else {
        	if (comparacion < 0) {
                System.out.println("Fallaste. La contraseña es mayor alfabéticamente.");
            } else {
                System.out.println("Fallaste. La contraseña es menor alfabéticamente.");
            }
        }
        	

		
	}

}
