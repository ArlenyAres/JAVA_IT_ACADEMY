import java.util.ArrayList;
import java.util.Scanner;

public class M5_Ex2_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*El programa demana dos números enters i llavors calcula la suma dels valors compresos entre els dos números, inclosos. 

              Exemple: 4 i 10  --> resultat = 4 + 5 + 6 + 7 + 8 + 9 + 10 = 49


*/ 
				Scanner sc = new Scanner(System.in);
				
				int num1 = 0, num2 = 0, suma = 0;
				
			//	ArrayList<Integer> numeros = new ArrayList <>();
				
				System.out.println("Introduce un numero entero");
				num1 = sc.nextInt();
				
				System.out.println("Introduce un numero entero");
				num2 = sc.nextInt();
				
				for(int i = num1; i <= num2; i++) {
					suma += i ;
					
					System.out.println(i);
				}
				
				System.out.println( " el total es: " + suma);

	}

}
