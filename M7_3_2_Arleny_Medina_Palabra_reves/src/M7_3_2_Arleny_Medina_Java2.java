
import java.util.Scanner;

public class M7_3_2_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*En aquest programa l’usuari/ària ha d’introduir un string i el programa ha de mostrar l’string al revés.*/
		
			Scanner sc = new Scanner(System.in);
			String palabra = "";
			String reves = "";
			
			System.out.println("Introduce una palabra");
			palabra = sc.next();
			
			System.out.println();
			
			for (int i = palabra.length() - 1; i >= 0; i--) {
				reves += palabra.charAt(i);
			}
			
			System.out.println("Palabra original: " + palabra);
			System.out.println();
			System.out.println("Palabra invertida: " + reves);

		}
			
			
	}


