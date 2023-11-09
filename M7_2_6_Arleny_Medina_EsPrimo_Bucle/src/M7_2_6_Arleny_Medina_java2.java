import java.util.Scanner;

public class M7_2_6_Arleny_Medina_java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
				/*L’usuari/ària ha d’introduir números fins que introdueixi un nombre primer. 
		
						En el moment que l’usuari/ària introdueixi un nombre primer, el programa ha de treure per pantalla el 
						següent missatge: "Exacte, el número “x” és primer!*/
		
				Scanner sc = new Scanner(System.in);				
				int num1 = 0;
		
		
				do {
					System.out.println("Indicamen un numero para saber si es primo o no");
					num1 = sc.nextInt();
		
		
		
				}while (esPrimo(num1) != true);
		
				System.out.println("Exacto, el nuemero " + num1 + " Es primo");
		
			}
		
		
			public static boolean esPrimo(int num1) {

				if( num1 < 1 ) {     // si es 1 o menor que 1 no es primo
					return false;
				}else if (num1 == 2) {    // si el numero es = 2 es primo
					return true;
				}else{
					for(int i = 2; i < num1; i++) {   // si el residuo es = 0 es primo
						if(num1 % i == 0) {
							return false;
						}
					}
					return true;
				}
			}

}
