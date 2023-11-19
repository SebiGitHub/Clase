package unico;

import java.util.Random;

/**
 * Implementar un método que decida si dos números enteros positivos son amigos. 
 * Dos números son amigos si la suma de los divisores propios (distinto de él mismo) 
 * del primer número es igual al segundo número, y viceversa. 
 * Ejemplos: (220 - 284), (1184 - 1210)
 */
public class Principal {

	public static void main(String[] args) {
		String palo = generarPaloAleatorio();
        String carta = generarCartaAleatoria();

        System.out.println("Palo: " + palo);
        System.out.println("Carta: " + carta);
    }

    public static String generarPaloAleatorio() {
        String[] palos = {"picas", "corazones", "diamantes", "tréboles"};
        Random random = new Random();
        int indicePalo = random.nextInt(palos.length);
        return palos[indicePalo];
    }

    public static String generarCartaAleatoria() {
        String[] cartas = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        Random random = new Random();
        int indiceCarta = random.nextInt(cartas.length);
        return cartas[indiceCarta];
    }
	
}
