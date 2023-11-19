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
		int altura;
	
		while (true) {
			altura = Entrada.pedirEntero("Introduce un tamaño de la pirámide (0 para salir): ");
		
			 if (altura == 0) {
	                System.out.println("Fin del programa.");
	                break;
	            }

	            if (altura >= 5 && altura % 2 != 0) {
	                ocho(altura);
	            } else {
	                System.out.println("La altura introducida no es correcta. Inténtelo de nuevo.");
	            }
	        }
	    }

	    public static void ocho(int altura) {
	        // Parte superior del 8
	        System.out.println("MMMMMM");

	        // Mitad del 8
	        int espacios = altura / 2 - 1;
	        for (int i = 0; i < altura / 2; i++) {
	            System.out.print("M");
	            imprimirEspacios(espacios);
	            System.out.println("M");
	        }

	        // Parte inferior del 8
	        System.out.println("MMMMMM");

	        // Mitad del 8 (inversa)
	        for (int i = 0; i < altura / 2; i++) {
	            System.out.print("M");
	            imprimirEspacios(espacios);
	            System.out.println("M");
	        }
	        
	        // Parte inferior del 8
	        System.out.println("MMMMMM");
	    }

	    private static void imprimirEspacios(int n) {
	        for (int i = 0; i < 4; i++) {
	            System.out.print(" ");
	        }
	    }


}
