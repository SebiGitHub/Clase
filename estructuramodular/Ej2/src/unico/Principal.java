package unico;
/**
 * Implementar un método al que se le pasen dos números enteros y muestre todos los números comprendidos entre ellos.
 * 
 */
public class Principal {

	public static void main(String[] args) {
		int num1;
		int num2;
		
		
		do {
			num1 = Entrada.pedirEntero("Introduzca un número:");
		}while (num1<= 0);
		
		do {
			num2 = Entrada.pedirEntero("Introduzca un número:");
		}while (num2<= 0);
		
		//LLamada al método...
		numerosEnRango(num1, num2);
	}
	
	
	public static void numerosEnRango(int n1, int n2) {
		
		//forma1
		int ini;
		int fin;
		if (n1 < n2) {
			ini = n1;
			fin = n2;
		}else {
			ini = n2;
			fin = n1;
		}
		
		
		for (int i = ini; i <= fin; i++) {
			System.out.println(i);
		}
		
		//forma2
		int x;
		
		if (n1 > n2) {
			x = n1;
			n1 = n2;
			n2 = x;
		}
		for (int i = ini; i <= fin; i++) {
			System.out.println(i);
	}
	}		

	
}
