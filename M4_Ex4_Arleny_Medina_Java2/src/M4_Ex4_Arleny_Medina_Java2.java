import java.util.Scanner;

public class M4_Ex4_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Crea un programa que sol·liciti a l'usuari/ària que introdueixi un número de l'1 al 10
		 *  i mostri per pantalla el seu equivalent en lletres (per exemple, 1 es mostraria com "u", 2 com "dos", etc.).
		 */
		
		
		int numUs = 0;
		String resp = " ";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Indicame un numero del 1 al 10");
		numUs = sc.nextInt();
		
		switch (numUs){
			case 1:
				resp = "Uno";
				break;
			case 2:
				resp = "Dos";
				break;
			case 3:
				resp = "Tres";
				break;
			case 4:
				resp = "Cuatro";
				break;
			case 5:
				resp = "Cinco";
				break;
			case 6:
				resp = "Seis";
				break;
			case 7:
				resp = "Siete";
				break;
			case 8:
				resp = "Ocho";
				break;
			case 9:
				resp = "Nueve";
				break;
			case 10:
				resp = "Diez";
				break;
		}
		
			System.out.println(resp);
			sc.close();
		
	}

}
