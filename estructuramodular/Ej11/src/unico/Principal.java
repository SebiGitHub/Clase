package unico;
/**
 *Implementar un método que calcule la superficie o el volumen de una esfera. 
 *El prototipo del método es este: static double superficieOvolumen(char peticion, double radio)
 *El método recibe el carácter 'S' o el carácter 'V' en el primer parámetro, según quiera calcularse la superficie o el volumen. En el segundo parámetro, recibirá el valor del radio de la esfera. Las ecuaciones de los dos conceptos son estas:
 *Volumen = 4/3 PI r^3
 *Superficie = 4 PI r^2
 */
public class Principal {

	
	// Como se le pide un char al usuario? con el entrada.java
	
	
	public static void main(String[] args) {
		double radio;
		char peticion;
		double a;

		peticion = 'v';
		radio = Entrada.pedirEntero("Introduzca el radio de la esfera: ");
		a = superficieOvolumen(peticion, radio);
		
		System.out.println("El resultado es: " + a);
		
	}

	static double superficieOvolumen(char peticion, double radio) {
		
		double volumen;
		double superficie;
		double resu = 0;
		double PI = 3.14;
		
		
		if (peticion == 's') {
			superficie = 4 * PI * radio * radio;
			resu = superficie;
		}
		
		
		if (peticion == 'v') {
			volumen = (4 * PI * (radio*radio*radio)/3);
			resu = volumen;
		}
		
		return resu;
	}

	
	



}
