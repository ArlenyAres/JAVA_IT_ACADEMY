import java.util.Scanner;

public class M4_Ex1_Arleny_Medina_java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Crea un programa que sol·liciti a l'usuari/ària que introdueixi dos nombres enters per teclat i mostri per pantalla el major dels dos.

		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int resp = 0;
		//String resp = "";
		
		System.out.println("Introduce un numero");
		num1 = sc.nextInt();
		
		System.out.println("Introduce otro numero");
		num2 = sc.nextInt();
		
		
		resp = (num1 > num2) ? num1 : num2 ;
		System.out.println("El mayor es: " + resp);
		
		
		/* if(num1 > num2) {
			resp = ("El mayor es: " + num1) ;
		}else {
			resp = ("El mayor es: " + num2) ;
		}*/
		
		//System.out.println("El mayor es: " + resp); 
		
		
		sc.close();
	}

}
