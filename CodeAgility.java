
public class CodeAgility {
	
	
	
	/* __________________________
	 *|                          |
	 *|   Funciones frecuentes   |
	 *|__________________________|*/
	
	//Funciones que se repiten -- AGILIZAN LA CODIFICACIÓN
	
	

	
	//Preguntamos 5 numeros al usuario
	public static int[] preguntarNumeros() {
		
		int[] listaNumeros = new int[6];

		for (int i = 0; i<5; i++) {
			System.out.print("Introduce un número entero: ");
			listaNumeros[i] = SystemUtils.scanner.nextInt();;
		}
		
		return listaNumeros;


	}
	
	
	//Preguntamos por una cadena de texto
	public static String[] preguntarCadena() {
		String cadenaS;
		
		System.out.println("Introduce una cadena de texto: ");
		cadenaS = SystemUtils.scanner.nextLine();
		
		return cadenaS.split("");
		
	}
	
	
	
	//Mostrar los mensajes por pantalla
	public static void mostrarEnunciado(String mensaje) {
		
		if (mensaje == "Resultado") {
			System.out.println();
			System.out.println("⚜ Este es el resultado:");
			System.out.println();
		} else {
			SystemUtils.borrar_pantalla();
			System.out.println("⚜ " + mensaje);
			System.out.println();
		}

	}
	
	
	
	
	//Pulse [ENTER] para continuar
	public static void pressEnterToContinue() {
		System.out.println();
        System.out.println("Pulsa [ENTER] para continuar");
        try
        {
            System.in.read();
        }  
        catch(Exception e)
        {} 
	}
	
}
