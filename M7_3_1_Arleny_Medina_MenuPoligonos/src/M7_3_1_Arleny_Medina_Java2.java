import java.util.Scanner;

public class M7_3_1_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Realitzar un programa que tingui un menú on se li mostraran 4 opcions a l’usuari/ ària per pantalla:
			1.- Quadrat
			2.- Triangle
			3.- Rectangle
			4.- Cercle
			0.- Sortir del programa
			Segons l’opció escollida haurà d’introduir unes dades o altres perquè el programa mostri per pantalla l’àrea (el valor) del polígon escollit.
*/

			Scanner sc = new Scanner(System.in);
			int opcion = -1;
			double a = 0; double b = 0; double radio = 0;
			String resp = "";
			
			do {
				System.out.println("Elige la opcion para calcular el area\n"
						+ "1.- Quadrat\n"
						+ "2.- Triangle\n"
						+ "3.- Rectangle\n"
						+ "4.- Cercle\n"
						+ "0.- Sortir del programa");
				opcion = sc.nextInt();
				
					switch(opcion) {
						case 1:
							System.out.println("intrduzca la medida de un lado");
							a = sc.nextDouble();
							System.out.println("intrduzca la medida de un lado");
							b = sc.nextDouble();
							resp = "El area del cuadrado es: " + cuadrado(a,b);
						break;
						case 2:
							System.out.println("intrduzca la medida de base del triangulo");
							a = sc.nextDouble();
							System.out.println("intrduzca  la medida de la altura");
							b = sc.nextDouble();
							resp = "El area del cuadrado es: " + triangulo(a,b);
						break;
						case 3:
							System.out.println("intrduzca la medida de un lado");
							a = sc.nextDouble();
							System.out.println("intrduzca la medida de un lado");
							b = sc.nextDouble();
							resp = "El area del cuadrado es: " + rectangulo(a,b);	
						break;
						case 4:
							System.out.println("intrduzca la a distancia desde el centro del círculo, al borde del círculo.");
							radio = sc.nextDouble();
							resp = "El area del circulo es: " + circulo(radio);
						break;
						
					}
					
					System.out.println(resp);
					System.out.println();
				
			}while(opcion != 0);
			
			
		
	}
	
			public static double cuadrado(double a, double b) {
				double area = 0;
				
				area = a * b;
			
				return area;
			}
			
			public static double triangulo(double a, double b) {
				double area = 0;
				
				area = (a * b)/ 2;
				
				return area;
			}
			
			public static double rectangulo(double a, double b) {
				double area = 0;
				
				area = a * b;
			
				return area;
				
			}
			
			public static double circulo(double radio) {
				final double PI = 3.14;  
		        double area = 0;
		        
		        area = PI * radio * radio;
		        
		        return area;
				
			}

}
