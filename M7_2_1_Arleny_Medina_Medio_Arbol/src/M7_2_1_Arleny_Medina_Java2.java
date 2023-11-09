import java.util.Scanner;

public class M7_2_1_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Fes un programa que mostri el següent per pantalla:
				
				*
				
				* *
				
				* * *
				
				* * * *
				
				* * * * *
				
				* * * * * *
				
				El nombre de línies formades per “*” vindrà donat per un número que l’usuari/ària introduirà per consola.*/
		
		
		
				    Scanner sc = new Scanner(System.in);
				    
				    int numUsu = 0;
				    char asterisco = '*';
				    
				    System.out.println("Introduce el tamaño de tu figura");
				    numUsu = sc.nextInt();
				    
				    for( int i = 1; i < numUsu; i++) {
				    	 System.out.println(); 
				        for( int j = 1; i > j; j++) {
				            System.out.print(asterisco + " ");
				        }
				        System.out.println(asterisco + " ");
				    }
				    
				 
	}

}







		/* for( int i = 0; i < numUsu; i++) {
				        System.out.println(asterisco);
				        for( int j = numUsu; j > i; j--) {
				            System.out.print(asterisco);
				        }
				    }*/