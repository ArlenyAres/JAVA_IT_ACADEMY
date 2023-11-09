import java.util.Scanner;

public class M7_1_Ex7_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				/*Fer un programa on l’usuari/ària introdueix per pantalla un caràcter i un número. 
				 * El programa imprimeix per pantalla un quadrat amb la mida i el caràcter introduïts per l’usuari/ària.*/
		
		
				Scanner sc = new Scanner(System.in);
				int medida = 0;
				String caract = "";
				
				System.out.println("Intrduzca la medida de su cuadrado");
				medida = sc.nextInt();
				
				System.out.println("Intrduzca el simbolo para realizar cuadrado");
				caract = sc.next();
				
				for(int i = 0; medida >= i; i++) {
					for(int j = 0; medida >= j; j++) {
						System.out.print(caract);
					}
					System.out.println(caract);
				}
		
	}

}
