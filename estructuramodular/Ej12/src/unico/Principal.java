package unico;
/**
 *Implementar un método que reciba tres valores que se correspondan con un número de horas,
 * minutos y segundos. El método debe transformar dicha medida en una expresión correcta,
 *  y mostrarlo por consola. El método devolverá, además, un valor booleano que indique 
 *  si la fecha ha sobrepasado las 24 horas del día.
 *  Por ejemplo:
 *  dada la medida 3h 118m 195s, la función deberá mostrar 5h 1m 15s. Y devolverá false.
 *  dada la medida 23h 118m 195s, la función deberá mostrar 1h 1m 15s. Y devolverá true.
 *  dada la medida 24h 0m 0s, la función deberá mostrar 0h 0m 0s. Y devolverá true.
 */
public class Principal {

	
	// Como se le pide un char al usuario? con el entrada.java
	

	public static void main(String[] args) {
		   
			int horas;
			int minutos;
			int segundos;
			
			
			horas = Entrada.pedirEntero("Introduzca el nº de horas: ");
			minutos = Entrada.pedirEntero("Introduzca el nº de minutos: ");
			segundos = Entrada.pedirEntero("Introduzca el nº de segundos: ");

	        boolean haSobrepasado = ajustarTiempo(horas, minutos, segundos);

	        if (haSobrepasado) {
	            System.out.println("La medida ha sobrepasado las 24 horas del día.");
	        }
	    }

	 public static boolean ajustarTiempo(int horas, int minutos, int segundos) {
	        int totalSegundos = horas * 3600 + minutos * 60 + segundos;

	        // Verificar si se ha sobrepasado las 24 horas
	        boolean haSobrepasado = totalSegundos >= 24 * 3600;

	        // Ajustar las horas, minutos y segundos
	        totalSegundos = totalSegundos % (24 * 3600);
	        horas = totalSegundos / 3600;
	        minutos = (totalSegundos % 3600) / 60;
	        segundos = totalSegundos % 60;

	        // Mostrar el tiempo ajustado
	        System.out.println("La medida ajustada es: " + horas + "h " + minutos + "m " + segundos + "s");

	        return haSobrepasado;
	    }
}
