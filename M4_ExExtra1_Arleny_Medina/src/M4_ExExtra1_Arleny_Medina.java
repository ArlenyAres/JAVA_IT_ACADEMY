import java.util.Scanner;

public class M4_ExExtra1_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Fes un programa que pregunti a l'usuari/ària dos nombres enters al qual anomenaràs dividend i divisor respectivament.

		El divisor haurà d'estar comprès entre 2 i 7.

		En cas contrari, el programa haurà de mostrar un missatge d'error.

		Si el divisor és correcte (2-7) mostra en pantalla si el dividend és múltiple del divisor, o no.*/


		
		
		Scanner sc = new Scanner (System.in);
		
		int dividendo, divisor = 0;
		String resp = " ";
		
		
		
		System.out.println("Introduce un numero");
		dividendo = sc.nextInt();
		
		System.out.println("Introduce otro numero");
		divisor = sc.nextInt();
		
		
		if((divisor >=2) && (divisor <=7)) {
			
			if(dividendo % divisor == 0) {
				resp = "son multiplos";
				
			}else {
				resp = "No son multiplos";
			}
		}else {
			resp = "El numero no esta en la franja";
		}
			
		System.out.println(resp);
	}

}
