package unico;
/**
 * Implementar un método que calcule a elevado a n, donde a es real, y n es un entero positivo mayor que cero. Realizar una versión iterativa y otra recursiva.
 * 	potencia(2.0, 4) = 2.0 x 2.0 x 2.0 x 2.0 = 16.0
 */
public class Principal {

	public static void main(String[] args) {
		 double base = 2.0;
	        int exponente = 4;

	        // Llamada al método iterativo
	        double resultadoIterativo = potenciaIterativa(base, exponente);
	        System.out.println(base + " elevado a la " + exponente + " (iterativo) es: " + resultadoIterativo);

	        // Llamada al método recursivo
	        double resultadoRecursivo = potenciaRecursiva(base, exponente);
	        System.out.println(base + " elevado a la " + exponente + " (recursivo) es: " + resultadoRecursivo);
	    }

	    // Método para calcular la potencia de forma iterativa
	    public static double potenciaIterativa(double base, int exponente) {
	        double resultado = 1.0;

	        for (int i = 0; i < exponente; i++) {
	            resultado *= base;
	        }

	        return resultado;
	    }

	    // Método para calcular la potencia de forma recursiva
	    public static double potenciaRecursiva(double base, int exponente) {
	        // Caso base: cualquier número elevado a 0 es 1
	        if (exponente == 0) {
	            return 1;
	        } else {
	            // Caso recursivo: a^n = a * a^(n-1)
	            return base * potenciaRecursiva(base, exponente - 1);
	        }
	    }

}
