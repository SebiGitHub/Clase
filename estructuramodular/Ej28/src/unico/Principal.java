package unico;
/**
 * Implementa el método piramideNumeros que imprime una pirámide de números con n filas como en la siguiente figura:

	Introduzca tamaño de la pirámide: 4
   	   1
  	  121
 	 12321
	1234321

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
            piramideNumeros(n);
        } else {
            System.out.println("Error: Por favor, introduzca un tamaño mayor a 0.");
        	}
		}
    }

public static void piramideNumeros(int n) {
    for (int i = 1; i <= n; i++) {
        // Imprimir espacios en blanco
        for (int j = 0; j < n - i; j++) {
            System.out.print(" ");
        }

        // Imprimir números ascendentes
        for (int j = 1; j <= i; j++) {
            System.out.print(j);
        }

        // Imprimir números descendentes
        for (int j = i - 1; j > 0; j--) {
            System.out.print(j);
        }

        System.out.println();
    }
}



}
