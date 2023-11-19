package unico;

/**
 * Implementa un método que permita calcular la energía cinética de un cuerpo,
 * sabiendo que, la energía cinética de un cuerpo es aquella que posee debido a
 * su movimiento. La energía cinética de una masa puntual depende de su masa
 * (m), y de su velocidad (v). Así: * Ec=mv22
 */
public class Principal {

	public static void main(String[] args) {

		double masa;
		double v;
		double a;

		masa = Entrada.pedirEntero("Introduzca la masa de un cuerpo: ");
		v = Entrada.pedirEntero("Introduzca su velocidad: ");

		a = ec(masa, v);
		System.out.println("La energía cinética es= " + a);

	}

	public static double ec(double masa, double v) {
		double enerc;
		
		enerc = (masa * v * v)/2;

		return enerc;
	}

	

}
