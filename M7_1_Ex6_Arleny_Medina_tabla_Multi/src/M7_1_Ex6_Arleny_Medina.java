import java.util.Scanner;

public class M7_1_Ex6_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
				/*L’usuari/ària introduirà un número (de l'1 al 10) per pantalla, i utilitzant un bucle, 
				 * el programa li mostrarà la taula de multiplicar d’aquell número.*/
		
		
				Scanner sc = new Scanner(System.in);
				
				int num = 0;
				
				
				System.out.print("Introduce el numero a multiplicar");
				num = sc.nextInt();
				
				
				 
				if(num >= 1 && num <= 10) {
				   
					for(int i = 0; i <=10; i++) {
					System.out.println(num + " x " + i + " = "+ (num*i));
				    }

				}
		
		      
		
	}
}
