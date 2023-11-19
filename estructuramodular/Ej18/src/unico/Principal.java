package unico;

/**
 * Implementa un método que nos devuelva el número total de días que tenga un
 * cierto mes que pasaremos, bien por su nombre o bien por su número
 * 
 * Recordatorio:
 * 
 * Enero, con 31 días Febrero, con 28 días Marzo, con 31 días Abril, con 30 días
 * Mayo, con 31 días Junio, con 30 días Julio, con 31 días Agosto, con 31 días
 * Septiembre, con 30 días Octubre, con 31 días Noviembre, con 30 días
 * Diciembre, con 31 días
 */
public class Principal {

	public static void main(String[] args) {

		String opc;
		int a;

		opc = Entrada.pedirCadena("Introduzca un mes: ");

		a = mes(opc);
		System.out.println("Recordatorio:");

		// Mostramos el resultado
		if (a != -1) {
			System.out.println("El mes " + opc + " tiene " + a + " días.");
		} else {
			System.out.println("Entrada no válida. Por favor, introduce un nombre o número de mes válido.");
		}
	}

	// Método para obtener el número de días en un mes
	public static int mes(String mes) {
		mes = mes.toLowerCase(); // Convertimos a minúsculas para hacer la comparación insensible a mayúsculas

		switch (mes) {
		case "enero":
		case "marzo":
		case "mayo":
		case "julio":
		case "agosto":
		case "octubre":
		case "diciembre":
		case "1":
		case "3":
		case "5":
		case "7":
		case "8":
		case "10":
		case "12":
			return 31;
		case "abril":
		case "junio":
		case "septiembre":
		case "noviembre":
		case "4":
		case "6":
		case "9":
		case "11":
			return 30;
		case "febrero":
		case "2":
			return 28; // Consideramos siempre 28 días en febrero por simplicidad (sin tener en cuenta
						// años bisiestos)
		default:
			return -1; // Valor para indicar una entrada no válida
		}
	}
}