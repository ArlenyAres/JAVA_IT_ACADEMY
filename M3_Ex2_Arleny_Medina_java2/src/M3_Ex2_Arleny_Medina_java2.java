import java.util.Scanner;

public class M3_Ex2_Arleny_Medina_java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int suma, resta, multi;
		float divi = 0;
		
		
		System.out.println("Introduzca un numero entero: ");
		num1 = entrada.nextInt();
		
		System.out.println("Introduzca un segundo numero entero: ");
		num2 = entrada.nextInt();
		
		suma = num1 + num2;
		resta = num1 - num2;
		multi = num1 * num2;
		divi = (float) num1 / num2;
		
		System.out.println("El resultado de la suma es: " + suma);
		System.out.println("El resultado de la resta es: " + resta);
		System.out.println("El resultado de la multiplicacion es: "+ multi);
		System.out.println("El resultado de la division es: " + divi);
		
		entrada.close();
	}


}
