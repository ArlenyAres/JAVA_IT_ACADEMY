import java.util.Scanner;

public class M7_1_Ex4_Arleny_Medina_Java2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub

		/*Crea un mètode que ha de rebre com a paràmetres els costats d'un triangle. 
		 * La funció ha de retornar un missatge indicant si el triangle és equilàter, isòsceles o escalè.*/
		
		
				/*Segons la llargada dels costats els triangles poden ser: 
				• Equilàter: Té els tres costats iguals. 
				• Isòsceles: Té dos costats iguals. 
				• Escalè: Els tres costats són desiguals.*/
						
		
		
					Scanner sc = new Scanner(System.in);
					
					int a = 0; int b = 0; int c = 0;
					
					System.out.println("Ingresa el lado a de tu triangulo ");
					a = sc.nextInt();
					
					System.out.println("Ingresa el lado b de tu triangulo ");
					b = sc.nextInt();
					
					System.out.println("Ingresa el lado c de tu triangulo ");
					c = sc.nextInt();
					
					System.out.println("El tipo de triangulo es: " + tipoTriangulo(a, b, c));
			
		}
			
			
			
			
				public static String tipoTriangulo (int a, int b, int c) {
					
					if (a == b && b == c){
				        return "Equilatero";  
					}else if(a == b || b == c || a == c) {
				        return "Isosceles";  
					}else {  
				        return "escale";  
					
				    }
				}
				

}
