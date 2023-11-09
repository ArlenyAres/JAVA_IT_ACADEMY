import java.util.ArrayList;
import java.util.Scanner;

public class M7_3_5_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Donat un arraylist de paraules introduïdes per l’usuari/ària.
			Digues el nombre de paraules que contenen la lletra ‘a’ i mostra-les per pantalla.*/
		
		
				Scanner sc = new Scanner(System.in);		
				ArrayList <String> palabras = new ArrayList <String>();
				ArrayList <String> encontadA = new ArrayList <String>();
				int numPalabra = 0; int palabrasA = 0;
				String palabra = "";
				char letraABuscar = 'A';
				
				
				
				System.out.println("Introcude el numero de palabras que deseas guardar");
				numPalabra = sc.nextInt();
				
				
				for(int i = 0; i < numPalabra; i++) {
					System.out.println("Introcude las palabra");
					palabra = sc.next().toUpperCase();
					palabras.add(palabra);
					
					if (palabra.contains(String.valueOf(letraABuscar))) {
						encontadA.add(palabra) ;
						palabrasA = encontadA.size();
		            }
					
				}
				
				System.out.println("el numero de palablas encongtradas que contienen la letra A es: " + palabrasA + " Y las palabras son: " + encontadA);
		
	}
}