import java.util.Scanner;

public class M7_2_4_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*Realitzar un programa on l’usuari/ària introdueix un número i el programa crida a un mètode que retorna el factorial del número introduït.

               El factorial d'un nombre n (enter, no negatiu) és el producte de tots els nombres enters positius inferiors o iguals a n.
                FORMULA: 7! = 1 * 2 * 3 * 4 * 5 * 6 * 7 = 5.040
               
                */
		
		
			Scanner sc = new Scanner(System.in);
			int num1 = 0;
			
			System.out.println("Introduce el numero entero para saner su factorial");
			num1 = sc.nextInt();
			
			
			System.out.println(factorial(num1));
			
			
			
			
	}


			public static String factorial(int num1) {
				double factorial = 1;
				
				for(int i= 1; i <= num1; i++ ) {
					factorial *= i;	
				}
					
				return "El factorial de: " + num1 + " es: "  + factorial;
			}
	
}
			