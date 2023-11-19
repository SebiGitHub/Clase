package unico;

import java.util.Random;

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
		 Random random = new Random();
	        String caracteres = "12345";
	        int longitudMinima = 1;
	        int longitudMaxima = 40;

	        for (int i = 0; i < 10; i++) {
	            char caracter = caracteres.charAt(random.nextInt(caracteres.length()));
	            int longitud = random.nextInt(longitudMaxima - longitudMinima + 1) + longitudMinima;

	            for (int j = 0; j < longitud; j++) {
	                System.out.print(caracter);
	            }

	            System.out.println();
	        }
	    }


}
