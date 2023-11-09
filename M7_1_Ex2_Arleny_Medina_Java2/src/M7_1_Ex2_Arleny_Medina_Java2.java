
import java.util.Scanner;

public class M7_1_Ex2_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Un/a professor/a vol calcular les mitges de les notes de tota la classe. Crea una aplicació on l'usuari/ària introduirà un número per pantalla (
		 * el número correspon al nombre de notes que vol introduir) i el programa li demanarà que introdueixi les notes de tots els/les alumnes.

Un cop les notes han sigut introduïdes, el programa retorna el següent:

Si la nota mitjana és menor que 5: "La nota mitjana de la classe està suspesa. Els/les alumnes haurien de preguntar els seus dubtes i treballar més".

Si la nota és inferior a 7: "La nota mitjana de la classe és bona, però els/les alumnes haurien de millorar el treball personal".

Per la resta de casos, el missatge ha de ser: "Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat".*/
		
		
			Scanner sc = new Scanner(System.in);
			
			
			
			int numNotas = 0;
			int nota = 0;
			int notas = 0;
			float media = 0f;
			String resp = "";
			int i = 0;
			
			
			System.out.println("Introduce cuántas notas quieres calcular");
	        numNotas = sc.nextInt();

	        
	        while (i < numNotas) {
	            System.out.println("Introduce la nota");
	            nota = sc.nextInt();
	            if (nota >= 0 && nota <= 10) {
	                notas += nota;
	                i++;
	            } else {
	                System.out.println("La nota debe estar entre 0 y 10. Introduce una nota valida.");
	            }
	        }

	        media = (float) notas / numNotas;

	        if (media < 5) {
	            resp = "La nota mitjana de la classe està suspesa. Els/les alumnes haurien de preguntar els seus dubtes i treballar més";
	        } else if (media < 7) {
	            resp = "La nota mitjana de la classe és bona, però els/les alumnes haurien de millorar el treball personal";
	        } else if (media >= 7) {
	            resp = "Enhorabona! La nota mitjana de la classe es correspon amb l'esforç realitzat";
	        }
			
			System.out.println(media);
		
			System.out.println(resp);

	}

}
