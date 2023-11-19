package unico;

/*Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan 
 * siempre comienzan sus frases con "Javalín, javalón", para después 
 * hacer una pausa más o menos larga (la pausa se representa mediante espacios en blanco) 
 * y a continuación expresan el mensaje. Existe un dialecto que no comienza sus frases 
 * con la muletilla anterior, pero siempre las terminan con un silencio, 
 * más o menos prolongado y la coletilla "javalén, len, len". 
 * Se pide diseñar un traductor que, en primer lugar, nos diga si la frase está escrita 
 * en el idioma de Javalandia (en cualquiera de sus dialectos), y en caso afirmativo, 
 * nos muestre el mensaje sin muletillas.
 * */

public class Principal {

	public static void main(String[] args) {
		
		String frase = "Hola buena nosheeee   javalén, len, len";
		
		System.out.println(frase);
		
        if (esIdiomaJavalandia(frase)) {
        	System.out.println("La frase está en el idioma de Javalandia.");
            String mensajeTraducido = traducir(frase);
            System.out.println("Mensaje traducido: " + mensajeTraducido);
        } else {
            System.out.println("La frase no está en el idioma de Javalandia.");
        }
    }

    private static boolean esIdiomaJavalandia(String frase) {
    	boolean es = false;
    	if (frase.startsWith("Javalín, javalón") || frase.endsWith("javalén, len, len")) {
    		es = true;
    	}
    	
    	return es;
    }

    private static String traducir(String frase) {
    	String traduccion = "No se puede traducir";
    	String tmp;
    	
    	if(frase.startsWith("Javalín, javalón")) {
    		
    		//Manera1
    		tmp = frase.substring(16);
    		tmp = tmp.trim();
    		traduccion = tmp;
    		
    		//Manera 2
    		traduccion = frase.substring(16).trim();
    		
    	}
    	
    	if(frase.endsWith("javalén, len, len")) {
    		tmp = frase.substring(0, frase.length()-17);
    		tmp = tmp.trim();
    		traduccion = tmp;
    	}
    	
        return traduccion;
    }

}
