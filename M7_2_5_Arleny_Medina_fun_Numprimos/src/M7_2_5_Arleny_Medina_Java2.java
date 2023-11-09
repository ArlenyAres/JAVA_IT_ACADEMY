import java.util.Scanner;

public class M7_2_5_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*L’usuari/ària introdueix un nombre per teclat i el programa crida a un mètode que indiqui si el número és primer o no.*/
		
		
			Scanner sc = new Scanner(System.in);
			int num1 = 0;
			
			System.out.println("Indicamen un numero para saber si es primo o no");
			num1 = sc.nextInt();
			
			System.out.println( num1 + " " + esPrimo(num1));
			
			
	}
	
		public static String esPrimo(int num1) {
			
			if( num1 < 1 ) {     // si es 1 o menor que 1 no es primo
				return "no es primo";
			}else if (num1 == 2) {    // si el numero es = 2 es primo
				return "Es primo";
			}else{
				for(int i = 2; i < num1; i++) {   // si el residuo es = 0 es primo
					if(num1 % i == 0) {
						return "No es Primo";
					}
				}
				return "Es primo";
			}
		}
		
	/*	public static boolean esPrimo(int num1) {
			  // El 0, 1 y 4 no son primos
			  if (num1 == 0 || num1 == 1 || num1 == 4) {
			    return false;
			  }
			  for (int x = 2; x < num1 / 2; x++) {
			    // Si es divisible por cualquiera de estos números, no
			    // es primo
			    if (num1 % x == 0)
			      return false;
			  }
			  // Si no se pudo dividir por ninguno de los de arriba, sí es primo
			  return true;
			}    */
	

}
