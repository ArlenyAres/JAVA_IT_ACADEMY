import java.util.Scanner;

public class M7_1_Ex3_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*L’usuari/ària ha d'introduir un número i el programa ha de mostrar per pantalla si el número és parell o imparell
		 * ¿Cómo es un número impar? Un número impar es un número entero que no es divisible por 2, 
		 * es decir, cuando se divide por 2, queda un residuo de 1. En su forma decimal, un número impar siempre termina en 1, 3, 5, 7 o 9.*/
		
		
		   Scanner sc = new Scanner (System.in);
		   
		   int num1 = 0;
		   
		   
		   System.out.println("introcuce un nuemero y te dire si es entero o no =)");
		   num1 = sc.nextInt();
		   
		   
		   if ( num1 %2 == 0) {
			   System.out.println("el numero: " + num1 + " Es par");
			   
		   }else {
			   System.out.println("el numero: " + num1 + " Es Impar");
		   }
		   
		
	}

}
