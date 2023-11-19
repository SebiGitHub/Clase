package unico;
/**
 * Implementar un método recursivo que realice la división entera de dos números (sin utilizar el operador /).
	Nota: El resultado de la división se corresponde con el número de veces que puedo restar al dividendo, el divisor. 
	Para resolver 13/4, vemos que puedo realizar la resta 3 veces, hasta que el resultado ya no es mayor o igual que el divisor:
	13 / 4 →  (1ª vez: 13-4=9) → (2ª vez: 9-4=5) → (3ª vez: 5-4=1) → resultado = 3
	Ayuda para el pensamiento recursivo: siempre que el dividendo sea mayor que el divisor → 13/4 = 1+ ((13-4)/4)
 */
public class Principal {

	public static void main(String[] args) {
		int dividendo = 13;
        int divisor = 4;

        // Llamada al método de división entera
        int resultado = divideEntera(dividendo, divisor);
        System.out.println(dividendo + " / " + divisor + " = " + resultado);
    }

    // Método recursivo para realizar la división entera
    public static int divideEntera(int dividendo, int divisor) {
        // Caso base: el dividendo es menor que el divisor
        if (dividendo < divisor) {
            return 0;
        } else {
            // Caso recursivo: dividendo/divisor = 1 + (dividendo - divisor) / divisor
            return 1 + divideEntera(dividendo - divisor, divisor);
        }
    }

}
