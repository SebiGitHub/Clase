package unico;
/**
 * Implementar un método que calcule la raíz cuadrada de un número por aproximaciones. 
 * La función debe recibir un número y devolver el resultado. Luego tras la llamada, 
 * debemos mostrar el resultado, y si descubrimos que no es exacto, 
 * debemos calcular el resto y mostrarlo.
 * Por ejemplo, para calcular la raíz cuadrada de 23, probamos con: 12 = 1; 22 = 4; 32 = 9; 42 = 16; 52 = 25
 * con el 5 nos pasamos, con lo que el resultado del método sería 4. 
 * Mostramos el resultado del método, y luego calculamos el resto: 23-42 = 7.
 */
public class Principal {

	public static void main(String[] args) {
		int n;
		int a;
		int resto;
			
		n = Entrada.pedirEntero("Introduzca un numero entero: ");
		a = raíz(n);
		resto = n - a*a;
		
		if (resto > 0) {
			System.out.println(n + " - " + "(" + a  + " x " + a + ")" + " = " + resto);
		}
	}

	private static int raíz(int n) {
		
		int i;
		i = 0;
		
	    while (i * i <= n) {
	            i++;
	        }
	    
		return i - 1;
	}

	
	



}
