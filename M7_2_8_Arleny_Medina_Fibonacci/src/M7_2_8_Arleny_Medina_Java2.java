import java.util.Scanner;

public class M7_2_8_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/* L’usuari/ària introdueix un nombre per teclat i el programa crida a un mètode que ha de mostrar la successió de Fibonacci.

				Exemple:
				
				Si l’usuari/ària introdueix el 10, el resultat ha de ser:
				
				0,1,1,2,3,5,8,13,21,34*/
		
				Scanner sc = new Scanner(System.in);
				
				int numUsu = 0;
				
				System.out.println("De cuantos nuemros quioere la secuencia");
				numUsu = sc.nextInt();
				
				int[] fibo = fibonacci(numUsu);
				
				//System.out.println(fibonacci(numUsu));
				
				for(int i = 0; i < fibo.length; i++ ) {
					
					if((numUsu - 1 )== i)  {
						System.out.print(fibo[i]);
					}else {
						System.out.print(fibo[i] + "," );
					}
					
				}
				 
					
		}
				
								
				/*	public static String fibonacci(int numUsu) {
						
						int num1 = 0; int num2 = 1; int num3 = 0;
						//String respuesta1 = " ";
						String respuesta2 = " ";
						
						respuesta2 += (num1 + ", " + num2);
				
						for(int i = 2; i < numUsu; i++) {
							num3 = num1 + num2;
							respuesta2 += ( "," + num3 );
							num1 = num2;
							num2 = num3;
						}
						
						
						
						return respuesta2;
					} */
	
	
	
	
						public static int[] fibonacci(int numUsu) {
						    int num1 = 0;
						    int num2 = 1;
						    int num3 = 0;
						
						    int[] resultado = new int[numUsu];
						
						    resultado[0] = num1;
						    resultado[1] = num2;
						
						    for (int i = 2; i < numUsu; i++) {
						        num3 = num1 + num2;
						        resultado[i] = num3;
						        num1 = num2;
						        num2 = num3;
						    }
						
						    return resultado;
						}
				

}

					/* int num1 = 0; int num2 = 1; int num3 = 0;;
			
			        
			               System.out.print(num1 + ", " + num2);
			
			       
			        for (int i = 2; i < numUsu; ++i) {
			               num3 = num1 + num2;
					        System.out.print(", " + num3);
							        num1 = num2;
							        num2 = num3;
			           }
			        }*/
				






				
			