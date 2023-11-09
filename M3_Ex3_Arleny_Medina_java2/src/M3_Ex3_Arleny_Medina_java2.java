import java.util.Scanner;

public class M3_Ex3_Arleny_Medina_java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//El programa demana a l'usuari/ària que introdueixi 3 notes i el programa mostra la mitja de les 3 notes per pantalla.
		
		Scanner sc = new Scanner(System.in);
		
		int nota1, nota2, nota3 = 0;
		double media = 0;
		
		System.out.println("Introduce la primera nota");
		nota1 = sc.nextInt();
		
		System.out.println("Introduce la segunda nota");
		nota2 = sc.nextInt();
		
		System.out.println("Introduce la tercera nota");
		nota3 = sc.nextInt();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		System.out.println("La media de las notas es: " + media);
		
	}

}
