package unico;
/**
 * Implementar un método que calcule o el área o el volumen de un cilindro, 
 * según se especifique. Para distinguir un cálculo de otro se le pasará un 
 * número 1 (para área) o 2 (para volumen). Además, hemos de pasarle al método
 * el radio de la base y la altura.
 *  Área total: 2 PI r (h+r)
 *  Volumen: PI r^2 h
 * 
 */
public class Principal {

	public static void main(String[] args) {
		int opc;
		double alt;
		double rad;
		double resu;

		
		
		do {
			opc = Entrada.pedirEntero("Introduzca 1 para calcular el area o 2 para el volumen:");
		}while (opc != 1 || opc != 2);
		
			rad = Entrada.pedirEntero("Introduzca el radio:");
			alt = Entrada.pedirEntero("Introduzca la altura:");
	
		
		//LLamada al método...
		resu = calcularCilindro(opc, rad, alt);
		System.out.println("Vale = " + resu);
	}
	
	
	public static double calcularCilindro(int opc, double rad, double alt) {
		
		//forma1
		double result;
		
		switch (opc) {
		case 1:
			result = areaCilindro(rad, alt);
			break;
		case 2:
			result = volumenCilindro(rad, alt);
			break;
		default: result = 0.0;
		}
		
		
		
		return result;
	}


	private static double volumenCilindro(double rad, double alt) {
		double pi = 3.14f;
		double volumen;
		
		volumen = areaBase(rad) * alt;
		
		return volumen;
	}


	private static double areaCilindro(double rad, double alt) {
		//forma 1
		//Declarar PI y area

		
		//area = 2 * pi * rad * (alt + rad);
		
		//return area;
		
		//forma 2
		final double pi = 3.14f;
		double area;
		
		area = 2.0 * areaBase(rad) + areaLateral(rad, alt);
		
		return area;
	}


	private static double areaLateral(double rad, double alt) {
		final double pi = 3.14f;
		double area;
		
		area = longitudBase(rad) * rad;
		
		return area;
	}
	
	
	private static double areaBase(double rad) {
		final double pi = 3.14f;
		double area;
		
		area = pi * rad * rad;
		
		return area;
	}


	private static double longitudBase(double rad) {
		final double pi = 3.14f;
		double longitud;
		
		longitud = 2 * pi * rad;
		
		return longitud;
	}


		

	
}
