import java.util.Scanner;

public class M7_2_3_Arleny_Medina_java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
								
								/*Fes un programa que mostri el següent per pantalla:
						
						*
						
						* *
						
						* * *
						
						* * * *
						
						* * * * *
						
						* * * * * *
						
						* * * * *
						
						* * * *
						
						* * *
						
						* *
						
						*
						
						La línia amb més “*” vindrà donada per un número que l’usuari/ària introduirà per consola.*/
		
		
		
				 		Scanner sc = new Scanner(System.in);
						    
						    int numUsu = 0;
						    char asterisco = '*';
						    
						    System.out.println("Introduce el tamaño de tu figura invertida");
						    numUsu = sc.nextInt();
							
							for (int i = 1; i <= numUsu; i++){
								for (int j = 0; j < i; j++){
									System.out.print(asterisco);
								}
								System.out.println();
							}
							
							for(int i = numUsu; i > 0 ; i--){
								for (int j = 1; j < i; j++ ){
									System.out.print(asterisco);
								}
								System.out.println();
								    sc.close();
							}

						    	
						    	
	}

}
