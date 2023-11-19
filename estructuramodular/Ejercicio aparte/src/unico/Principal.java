package unico;
/**
 *Implementar un método que como dato de entrada sea un año y como resultado un valor booleano 
 *de si se trata de un año bisiesto o no. Se sabe que son bisiestos todos los años múltiplos de 4, 
 *excepto los que sean múltiplos de 100 sin ser múltiplos de 400. 
 *Así que, por ejemplo, 2016, 2020, 2024 son bisiestos, 1600, 2000 y 2400 también son años bisiestos, 
 *pero 1700, 1800, 1900, 2100, 2200 y 2300 no lo son.
 */
public class Principal {
	
	final String FIN = "FIN DEL PROGRAMA";
	final String VOLVER = "0 VOLVER ATRÁS";
	final String SALIR = "0 SALIR DEL PROGRAMA";
	
	final String MENU1 = "MENU PRINCIPAL";
	final String OPCM1_1 = "Gestión de alumnos";
	final String OPCM1_2 = "Gestión de profesores";
	
	
	final String MENUS1 = "MENU SECUNDARIO 1";
	final String OPCM1S_1 = "Gestión de alumnos";
	final String OPCM1S_2 = "Gestión de profesores";
	
	
	final String MENUS2 = "MENU SECUNDARIO 2";
	final String OPCM2S_1 = "Gestión de notas";
	final String OPCM2S_2 = "Gestión de faltas";
	
	public static void main(String[] args) {

		int opc = 0;

		do {
			mostrarMenuPrincipal();
			opc = Entrada.pedirEntero("Opcion:");
			switch (opc) {
			case 1: menuSecundario1(); break;
			case 2: menuSecundario2(); break;
			}
		}while (opc != 0);
		System.out.println(SALIR);
		
		
}
	
	 private static void menuSecundario2() {
		 
		 int opc = 0;

			do {
				mostrarMenuPrincipal();
				opc = Entrada.pedirEntero("Opcion:");
				switch (opc) {
				case 1: menuSecundario1(); break;
				case 2: menuSecundario2(); break;
				}
			}while (opc != 0);
			System.out.println(SALIR);
		
	}

	private static void menuSecundario1() {
		int opc = 0;

		do {
			mostrarMenuPrincipal();
			opc = Entrada.pedirEntero("Opcion:");
			switch (opc) {
			case 1: menuSecundario1(); break;
			case 2: menuSecundario2(); break;
			}
		}while (opc != 0);
		System.out.println(SALIR);
		
	}

	private static void opcionesMenuSecundario2() {
		System.out.println(MENUS2);
		System.out.println(OPCM2S_1);
		System.out.println(OPCM2S_2);
		System.out.println(VOLVER);
		
	}

	private static void opcionesMenuSecundario1() {
		System.out.println(MENUS1);
		System.out.println(OPCM1S_1);
		System.out.println(OPCM1S_2);
		System.out.println(VOLVER);
		
	}

	public static void mostrarMenuPrincipal() {
		 System.out.println(MENU1);
		 System.out.println(OPCM1_1);
		 System.out.println(OPCM1_2);
		 System.out.println(SALIR);
	       
	}
	
	
}
