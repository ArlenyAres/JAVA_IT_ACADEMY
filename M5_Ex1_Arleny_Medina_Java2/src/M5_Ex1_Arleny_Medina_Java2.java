import java.util.ArrayList;
import java.util.Scanner;

public class M5_Ex1_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		/*Crea un programa que sol·liciti a l'usuari/ària quants noms desitja introduir.

           Una vegada tenim aquest número, demanarem a l'usuari/ària tants noms de persona com ha dit prèviament i els emmagatzemarem en un ArrayList.

          Després, mostrarem per pantalla només els noms que comencen per la lletra “A”.*/
			
		
					Scanner sc = new Scanner(System.in);
	
					ArrayList<String> listaNombresA = new ArrayList<>();
			
					String nombre = "";
					int numNombre = 0;
			
					System.out.println("Intruduce cuntos nombres quieres guardar:");
					numNombre = sc.nextInt();
					
					
			
				for (int i = 0; i < numNombre; i++) {
						
						System.out.print("Introduce el nombre: ");
							nombre = sc.next();
							nombre = nombre.toLowerCase();
							char letraA = nombre.charAt(0);
						
							if (letraA == 'a') {
								
									listaNombresA.add(nombre);
							}
				 }
				
					System.out.println(listaNombresA);
					
					sc.close();
					
	        }
	}


