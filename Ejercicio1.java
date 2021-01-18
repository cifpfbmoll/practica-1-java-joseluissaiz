import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	static String opcion = "";
	
	
	public static void main(String[] args) {
		
		mostrarMenu();

	}

	
	public static void mostrarMenu() {
		while (opcion.toLowerCase() != "z") {
			SystemUtils.borrar_pantalla();
			System.out.println("         ⚜⚜⚜ Bienvenido a la actividad 1 ⚜⚜⚜");
			System.out.println("");
			System.out.println("> ¿Qué desea hacer?");
			System.out.println(" ______________________________________________________");
			System.out.println("|                                                      |");
			System.out.println("| A) Preguntamos 5 numeros y los mostramos             |");
			System.out.println("| B) Preguntamos 5 numeros y los mostramos invertidos  |");
			System.out.println("| C) Preguntamos 5 numeros y hacemos medias            |");
			System.out.println("| D) Preguntamos por texto y decimos numero de letras  |");
			System.out.println("| E) Preguntamos por texto y lo mostramos invertido    |");
			System.out.println("| F) Preguntamos por texto y quitamos los espacios     |");
			System.out.println("| G) Preguntamos por dos textos y los concatenamos     |");
			System.out.println("| H) Preguntamos por texto y substituimos las vocales  |");
			System.out.println("| I) Preguntamos por texto y mostramos codigo ASCII    |");
			System.out.println("| Z) Salir                                             |");
			System.out.println("|______________________________________________________|");
			System.out.println("");
			System.out.println("Escoje una opción: ");
			opcion = SystemUtils.scanner.nextLine().toLowerCase();
			
			switch (opcion) {
			case "a":
				opcionA();
				break;
				
			case "b":
				opcionB();
				break;
			
			case "c":
				opcionC();
				break;
			
			case "d":
				opcionD();
				break;
				
			case "e":
				opcionE();
				break;
				
			case "f":
				opcionF();
				break;
				
			case "g":
				opcionG();
				break;
				
				
			case "h":
				opcionH();
				break;
				
				
			case "i":
				opcionI();
				break;
				
			case "z":
				System.exit(0);
				break;
				
				
			default:
				System.out.println("");
			}
		}
	}
	
	
	/* _______________________________
	 *|                               |
	 *|   Funciones de las opciones   |
	 *|_______________________________|*/
	
	
	public static void opcionA() {
		CodeAgility.mostrarEnunciado("Preguntamos 5 numeros y los mostramos");

		int[] listaNumeros = CodeAgility.preguntarNumeros();

		
		CodeAgility.mostrarEnunciado("Resultado");
		
		for (int i = 0; i < (listaNumeros.length - 1); i++) {System.out.println(listaNumeros[i]);}
		
		CodeAgility.pressEnterToContinue();
	}
	
	
	
	
	public static void opcionB() {
		
		CodeAgility.mostrarEnunciado("Preguntamos 5 numeros y los mostramos invertidos");
		
		int[] listaNumeros = CodeAgility.preguntarNumeros();
		     
        CodeAgility.mostrarEnunciado("Resultado");
        
        for(int i= listaNumeros.length-2; i >= 0; i--) {
        	  System.out.println(listaNumeros[i]);
        }
        
		CodeAgility.pressEnterToContinue();

	}
	
	
	
	public static void opcionC() {
		CodeAgility.mostrarEnunciado("Preguntamos 5 numeros y hacemos medias");
		
		int[] listaNumeros = CodeAgility.preguntarNumeros();
		
        CodeAgility.mostrarEnunciado("Resultado");

        
        List<Integer> numerosNegativos = new ArrayList<>();
        List<Integer> numerosPositivos = new ArrayList<>();
        int cuentaCeros = 0;
        
        for (int n = 0; n < listaNumeros.length; n++) {
        	if (listaNumeros[n] < 0) {
        		numerosNegativos.add(listaNumeros[n]);
        	} else if(listaNumeros[n] > 0) {
        		numerosPositivos.add(listaNumeros[n]);
        	} else {
        		cuentaCeros ++;
        	}
        }
        
        double mediaNegativos = numerosNegativos.stream().mapToDouble(val -> val).average().orElse(0.0);
        
        double mediaPositivos = numerosPositivos.stream().mapToDouble(val -> val).average().orElse(0.0);
        
        System.out.println("Tu media de numeros negativos es de : " + mediaNegativos);
        System.out.println("Tu media de numeros positivos es de : " + mediaPositivos);
        System.out.println("Has introducido " + (cuentaCeros -1) + " ceros");
        CodeAgility.pressEnterToContinue();

	}
	
	
	
	
	public static void opcionD() {
		CodeAgility.mostrarEnunciado("Preguntamos por texto y decimos numero de letras");
		
		String[] cadena = CodeAgility.preguntarCadena();
		int numeroCadena = 0;
		int numeroEspacios = 0;
		
		for (int i = 0; i < cadena.length; i++) {
			if (!Character.isSpaceChar(cadena[i].toCharArray()[0])) {
				numeroCadena ++;
			} else {
				numeroEspacios ++;
			}
		}
		CodeAgility.mostrarEnunciado("Resultado");
		System.out.println("Tu cadena de texto contiene " + numeroCadena + " carácteres y " + 
				numeroEspacios + " espacios");
		CodeAgility.pressEnterToContinue();
	}
	
	
	
	
	public static void opcionE() {
		CodeAgility.mostrarEnunciado("Preguntamos por texto y lo mostramos invertido");
		String[] cadena = CodeAgility.preguntarCadena();
		String cadenaInvertida = "";
        
		for(int i= cadena.length-1; i >= 0; i--) {
      	  cadenaInvertida = cadenaInvertida + cadena[i];
        }
		
		CodeAgility.mostrarEnunciado("Resultado");
		System.out.println(cadenaInvertida);
		CodeAgility.pressEnterToContinue();

	}
	
	
	public static void opcionF() {
		CodeAgility.mostrarEnunciado("Preguntamos por texto y quitamos los espacios");
		
		String cadenaSinEspacios =  "";
		String[] cadena = CodeAgility.preguntarCadena();
		int numeroEspacios = 0;
		
		for (int i = 0; i < cadena.length; i++) {
			if (!Character.isSpaceChar(cadena[i].toCharArray()[0])) {
			cadenaSinEspacios += cadena[i];
			} else {
				numeroEspacios ++;
			}
		}
		CodeAgility.mostrarEnunciado("Resultado");
		System.out.println("Tu cadena de texto contienia " + numeroEspacios + " espacios");
		System.out.println();
		System.out.println(cadenaSinEspacios);
		CodeAgility.pressEnterToContinue();

	}
	
	
	
	
	
	
	public static void opcionG() {
		CodeAgility.mostrarEnunciado("Preguntamos por dos textos y los concatenamos");
		
		String[] cadena1 = CodeAgility.preguntarCadena();
		String[] cadena2 = CodeAgility.preguntarCadena();

		
	      StringBuffer cadena1Buffer = new StringBuffer();
	      for(int i = 0; i < cadena1.length; i++) {
	         cadena1Buffer.append(cadena1[i]);
	      }
	      
	      StringBuffer cadena2Buffer = new StringBuffer();
	      for(int i = 0; i < cadena2.length; i++) {
	         cadena2Buffer.append(cadena2[i]);
	      }
		
		CodeAgility.mostrarEnunciado("Resultado");
		String resultado = (cadena1Buffer.toString() + cadena2Buffer.toString());
		System.out.println(resultado);
		CodeAgility.pressEnterToContinue();
	}
	
	
	
	
	
	
	public static void opcionH() {
		CodeAgility.mostrarEnunciado("Preguntamos por texto y substituimos las vocales");
		
		String cadenaVocalesCambiadas =  "";
		String[] cadena = CodeAgility.preguntarCadena();
		
		System.out.println("Introduce una vocal: ");
		String vocal = SystemUtils.scanner.nextLine();
		
		int numeroVocales = 0;
		
		for (int i = 0; i < cadena.length; i++) {
			if (cadena[i].equals("a") ||
					cadena[i].equals("e") ||
					cadena[i].equals("i") ||
					cadena[i].equals("o") ||
					cadena[i].equals("u")) {
				cadenaVocalesCambiadas += vocal;
				numeroVocales ++;
			} else {
				cadenaVocalesCambiadas += cadena[i];
			}
		}
		CodeAgility.mostrarEnunciado("Resultado");
		System.out.println("Tu cadena de texto contienia " + numeroVocales + " vocales");
		System.out.println();
		System.out.println(cadenaVocalesCambiadas);
		CodeAgility.pressEnterToContinue();
	}
	
	
	
	public static void opcionI() {
		CodeAgility.mostrarEnunciado("Preguntamos por texto y mostramos codigo ASCII");

		String[] cadena = CodeAgility.preguntarCadena();
		
		CodeAgility.mostrarEnunciado("Resultado");
		
		for (int i = 0; i < cadena.length; i++) {
			System.out.println("[" + cadena[i] + "] = " + (int)cadena[i].toCharArray()[0]);
		}

		CodeAgility.pressEnterToContinue();
	}
	
	
	
}
