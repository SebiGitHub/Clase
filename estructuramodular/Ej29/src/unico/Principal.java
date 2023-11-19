package unico;
/**
 * Implementa el método piramideLetras que imprime una pirámide de letras con n filas como en la siguiente figura:

	Introduzca tamaño de la pirámide: 4
	abcdcba
 	 abcba
  	  aba
   	   a

	Introduzca tamaño de la pirámide: 0
	fin del programa.
 */
public class Principal {

	public static void main(String[] args) {
		int n;
	
		while (true) {
			n = Entrada.pedirEntero("Introduce un tamaño de la pirámide (0 para salir): ");
		
			if (n == 0) {
                System.out.println("Fin del programa.");
                break;
            }

            if (n > 0) {
                piramideLetras(n);
            } else {
                System.out.println("Error: Por favor, introduzca un tamaño mayor a 0.");
            }
        }
    }

    public static void piramideLetras(int n) {
        for (int i = 0; i < n; i++) {
            // Imprimir espacios en blanco
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // Imprimir letras ascendentes
            for (char letra = 'a'; letra < 'a' + n - i; letra++) {
                System.out.print(letra);
            }

            // Imprimir letras descendentes
            for (char letra = (char) ('a' + n - i - 2); letra >= 'a'; letra--) {
                System.out.print(letra);
            }

            System.out.println();
        }
    }


}
