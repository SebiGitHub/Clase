package unico;

/**
 * Según cierta cultura oriental, los números de la suerte son el 3, el 7, el 8
 * y el 9. Los números de la mala suerte son el resto: el 0, el 1, el 2, el 4,
 * el 5 y el 6. Un número es afortunado si contiene más números de la suerte que
 * de la mala suerte. Realiza un programa que diga si un número introducido por
 * el usuario es afortunado o no.
 * 
 * Ejemplo:
 * Introduzca un número: 772 El 772 es un número afortunado.
 * 
 * Introduzca un número: 7720 El 7720 no es un número afortunado.
 * 
 * Introduzca un número: 43081 El 43081 no es un número afortunado.
 * 
 * Introduzca un número: 888 El 888 es un número afortunado.
 * 
 * Introduzca un número: 1234 El 1234 no es un número afortunado.
 * 
 * Introduzca un número: 6789 El 6789 es un número afortunado
 */
public class Principal {

//	public static void main(String[] args) {
//
//		int n;
//		n = Entrada.pedirEntero("Introduzca un numero: ");
//		premio(n);
//
//	}
//
//	public static void premio(int n) {
//		
//		if (n > 0) {
//			premio(n/10);
//			System.out.println(n%10);
//		}
//	}
//		
//	public static int totalDigitos (int n) {
//		if (n < 10) {
//			return 1;
//		}else {
//			return 1 + totalDigitos(n/10);
//		}
//	}
		
	
    public static void main(String[] args) {
        

        // Solicitamos al usuario que ingrese un número

        int numero = Entrada.pedirEntero("Introduzca un numero: ");
        
        
        // Llamamos a la función para determinar si es afortunado
        boolean esAfortunado = esAfortunado(numero);

        // Llamamos a la función para determinar si es afortunado
        if (esAfortunado) {
            System.out.println("El " + numero + " es un número afortunado.");
        } else {
            System.out.println("El " + numero + " no es un número afortunado.");
        }

    }

    // Función para determinar si un número es afortunado
    public static boolean esAfortunado(int numero) {
        int suerte = 0;
        int malaSuerte = 0;
        boolean contador = false;

        // Iteramos sobre cada dígito del número
        while (numero > 0) {
            int digito = numero % 10; // Obtenemos el último dígito
            numero /= 10; 			  // Eliminamos el último dígito
        

        // Contamos la cantidad de números de la suerte y de la mala suerte
            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                suerte++;
            } else {
                malaSuerte++;
           		}
        }

        // Determinamos si el número es afortunado
            if (suerte > malaSuerte) {
            	contador = true;
            }
        return contador;
    }
}

