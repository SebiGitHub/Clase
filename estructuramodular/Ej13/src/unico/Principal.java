package unico;
/**
 *Implementar un método que como dato de entrada sea un año y como resultado un valor booleano 
 *de si se trata de un año bisiesto o no. Se sabe que son bisiestos todos los años múltiplos de 4, 
 *excepto los que sean múltiplos de 100 sin ser múltiplos de 400. 
 *Así que, por ejemplo, 2016, 2020, 2024 son bisiestos, 1600, 2000 y 2400 también son años bisiestos, 
 *pero 1700, 1800, 1900, 2100, 2200 y 2300 no lo son.
 */
public class Principal {
	
	public static void main(String[] args) {

		int anio;
		anio = Entrada.pedirEntero("Introduzca un año: ");
		
		 if (bisiesto(anio)) {
	            System.out.println("Es bisiesto.");
	        }else {
	        	System.out.println("No es bisiesto.");
	        }
		
}
	
	 public static boolean bisiesto(int anio) {
		 boolean esbisiesto = false;
		 
		 if ((anio % 4 == 0 & anio % 100 != 0) || (anio % 400 == 0)){
			 esbisiesto = true;
	        }
	       

	        return esbisiesto;
	    }
	
	
}
