import java.util.Scanner;

public class M3_ExExtra2_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int varInt = 0;
		
		System.out.println("Introduce un numero entero");
		num1 = sc.nextInt();
		
		varInt  = (num1 < 10) ?  num1 : 1 ; // operador ternario
		System.out.println(varInt);
		
		//Falta hacer la tabla de multiplicar
		
	}

}
