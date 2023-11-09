import java.util.ArrayList;
import java.util.Scanner;

public class M7_1_Ex1_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		/*Crea un programa que sol·liciti a l'usuari/ària que introdueixi tres nombres enters per teclat i mostri 
		 * per pantalla el major dels tres, el menor dels tres o si hi ha dos números iguals.*/

		
				Scanner sc = new Scanner(System.in);
				ArrayList<Integer> numeros = new ArrayList<Integer>();
				
				int num1 = 0; int num2 = 0; int num3 = 0; 
				
				int numMax = 0; 
				int numMin = 0;
		
				
				System.out.println("Introduce un numero entero");
				num1 = sc.nextInt();
				numeros.add(num1);
				
				System.out.println("Introduce un numero entero");
				num2 = sc.nextInt();
				numeros.add(num2);
				
				System.out.println("Introduce un numero entero");
				num3 = sc.nextInt();
				numeros.add(num3);
				
		
				numMin = menor(numeros);
				numMax = mayor (numeros);
				
				System.out.println("El numero mero menor es: " + numMin);
				System.out.println("El numero mero mayor es: " + numMax);
				System.out.println(sonIguales (num1, num2, num3));
				
		       /* for (int i = 0; i < numeros.size(); i++) {
		            if (numeros.get(i) > numMax) {
		            	numMax= numeros.get(i);
		            }
		        }*/
		        
		   
		        /*for (int i = 0; i < numeros.size(); i++) {
		            if (numeros.get(i) < numMin) {
		            	numMin = numeros.get(i);
		            }
		        }*/
		        
		        
		       /* if (num1 == num2 || num1 == num3 || num2 == num3) {
		            hayIguales = true;
		            System.out.println("hay numeros iguales " + hayIguales);
		        }else {
		        	 System.out.println("no hay numeros iguales\n");
		        }*/
		        
		        
		       //System.out.println("El mayor es : " + numMax);
		       // System.out.println("El menor es: " + numMin);
	}
	
	
	
				public static int menor( ArrayList<Integer> numeros ){
					int numMin= numeros.get(0);
					

			        for (int i = 0; i < numeros.size(); i++) {
			            if (numeros.get(i) < numMin) {
			            	numMin = numeros.get(i);
			            }
			        }
					return numMin;
					
				}
				
				
				public static int mayor (ArrayList<Integer> numeros) {
					int numMax= numeros.get(0);
					
					for (int i = 0; i < numeros.size(); i++) {
			            if (numeros.get(i) > numMax) {
			            	numMax= numeros.get(i);
			            }
				    
                  }
					return numMax;
				
               }
				
				
				public static String sonIguales (int num1, int num2, int num3) {
					boolean hayIguales = false;

			        if (num1 == num2 || num1 == num3 || num2 == num3) {
			            hayIguales = true;
			            return "hay numeros iguales " + hayIguales;
			        }else {
			        	 return "no hay numeros iguales";
			        }
					
				}
}	
