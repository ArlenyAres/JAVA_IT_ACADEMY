import java.util.Scanner;

public class M3_EX1_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Fer un programa que li demani a l’usuari/ària: El nom, el cognom i l’edat. 
				//Un cop l’usuari/ària hagi acabat d’introduir les dades, aquestes s’han de mostrar per pantalla.
				
				Scanner sc = new Scanner (System.in);
				
				System.out.println("¿Cual es tu nombre?");
				String nombre = sc.nextLine();
				System.out.println("¿Cual es tu apellido?");
				String apellido = sc.nextLine();
				System.out.println("¿cual es tu edad?");
				String edad = sc.nextLine();
				System.out.println("Tu nombre es: " + nombre + " \ntu apellido: " + apellido + "\ntu edad: " + edad );
				


	}

}
