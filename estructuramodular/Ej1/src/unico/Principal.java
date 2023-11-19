package unico;

public class Principal {
	
	final static String MENSAJE = "eco";
	
	public static void main(String[] args) {
		int num;
		
		do {
			num = Entrada.pedirEntero("Introduzca un número:");
		}while (num<= 0);
		
		//LLamada al método...
		eco(num);
	}
	
	public static void eco(int n) {
		for (int i = 1; i <= n; i++) {
			System.out.println(MENSAJE);
		}
		
	}
}
