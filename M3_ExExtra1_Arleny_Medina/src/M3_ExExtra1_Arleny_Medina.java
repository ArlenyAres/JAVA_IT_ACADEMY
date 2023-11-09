import java.util.Scanner;

public class M3_ExExtra1_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		int num1, doble, triple = 0;
		
		System.out.println("Dime un numero entero");
		num1 = sc.nextInt();
		
		doble = num1 * 2;
		triple = num1 * 3;
		
		System.out.println("El doble es: " + doble);
		System.out.println("El triple es: " + triple);

	}

}
