import java.util.Scanner;

public class M6_EX1_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	  /* Modificar la calculadora arcaica (M4 Exercici 5). El programa demana a l’usuari/ària que introdueixi dos números i l’operació que desitja realitzar. 

		Cada operació (suma, resta, multiplicació, divisió i mòdul) estarà programada en un mètode diferent.*/
		
		
		
					int num1 = 0;
					int num2 = 0;
					char operador = ' ';
					double resp = 0;
					
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Indicame El primer numero con el cual desea realizar la operacion");
					num1 = sc.nextInt();
					
					System.out.println("Indicame el segundo numero con el cual desea realizar la operacion");
					num2 = sc.nextInt();
					
					System.out.println("Indicame la opcion para el tipo de operacion desea realizar\n"
							+ " + Suma\n"
							+ " - resta\n"
							+ " x Multiplicacion\n"
							+ " / Divicion");
					
				operador = sc.next().charAt(0); // si en vez de numeros pedimos el operador directamente podemos hacer esta formula
					
				
					
				    switch (operador){
						case '+':
							resp = sumar(num1, num2);
							break;
						case '-':
							resp = restar(num1, num2);
							break;
						case '*':
							resp = multi (num1, num2);
							break;
						case '/':
							resp = dividir (num1, num2);
							break;
						case '%':
							resp = resto (num1, num2);
							break;
				    }
		
						System.out.println(" El resultado es : " + resp);
						sc.close();
                 
			}


	
			public static int sumar (int num1, int num2) {
			
				int suma = num1 + num2;
				return  suma;
			}
			
			public static int restar (int num1, int num2) {
				
				int resta = num1 - num2;			
				return resta;
			}
			
			public static int multi (int num1, int num2) {
				
				int multip =  num1 * num2;
				return multip;
			}
				
			public static double dividir (int num1, int num2) {
					
				double divi = num1 / num2;
				return divi;
			}
			public static double resto (int num1, int num2) {
				
				double rest = num1 % num2;
				return rest;
			}
}

			
	


  			/*// operador = sc.nextInt().charAt(0); // si en vez de numeros pedimos el operador directamente podemos hacer esta formula
					
				operador = sc.nextInt();
					
				if (operador <= 5) {   //estructura de control
					
				    switch (operador){
						case 1:
							resp = "El resultados es: " + (num1 + num2);
							break;
						case 2:
							resp = "El resultados es: " + (num1 - num2);
							break;
						case 3:
							resp = "El resultados es: " + (num1 * num2);
							break;
						case 4:
							resp = "El resultados es: " + (num1 / num2);
							break;
				        }
				}else{
					resp = " Tiene que indicar una opcion del 1 al 5";
						}
			
						System.out.println(resp);
						sc.close();
					*/