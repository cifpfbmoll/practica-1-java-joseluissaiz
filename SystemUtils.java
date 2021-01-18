import java.util.Scanner;

public class SystemUtils {
	
	//Declaramos el scanner
	public static Scanner scanner = new Scanner(System.in);
	
	
	
	//Borrar la pantalla
	public final static void borrar_pantalla()
	{
	    try
	    {
	        final String so = System.getProperty("os.name");

	        if (so.contains("Windows"))
	        {
	            Runtime.getRuntime().exec("cls");
	        }
	        else
	        {
	            Runtime.getRuntime().exec("clear");
	        }
	    }
	    catch (final Exception e)
	    {
	    	for (int i = 0; i < 50; ++i) System.out.println();
	    }
	}
}
