import java.util.ArrayList;
import java.util.Scanner;

public class M6_Ex2_Arleny_Medina {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		// Modifica l'exercici 1 del mòdul 5 i ara fes-ho amb mètodes.
	
		
					int numNombre = 0;
			
					System.out.println("Intruduce cuntos nombres quieres guardar:");
					numNombre = sc.nextInt();
					
					System.out.print(nomsA(numNombre));

	}
	
	
				public static ArrayList<String> nomsA (int numNombre) {
					
					ArrayList<String> listaNombresA = new ArrayList<>();
					
					String nombre = "";
					
					for (int i = 0; i < numNombre; i++) {
						
						System.out.print("Introduce el nombre: ");
							nombre = sc.next();
							nombre = nombre.toLowerCase();
							char letraA = nombre.charAt(0);
						
							if (letraA == 'a') {
								listaNombresA.add(nombre);
							}
				     }
					
					
					return listaNombresA;
					
				}				
}

				
			


