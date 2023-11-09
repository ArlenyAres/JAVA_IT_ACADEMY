import java.util.Scanner;

public class M7_3_4_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*L’usuari/ària ha d’introduir un DNI i el programa ha de dir si la lletra és correcte o no amb el nombre de DNI. 
		 * Si la lletra no és correcta, ha de dir quina lletra és la correcta.
		 * Per calcular la lletra DNI has de prendre el número de DNI a verificar i dividir-lo entre 23. 
		 * El residu es reemplaça per una lletra que ja està assignada a aquest nombre mitjançant la taula adjunta:*/
		

			String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X",
	                "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
	
	        Scanner sc = new Scanner(System.in);
	
	        System.out.print("Escribe el DNI sin la letra: ");
	        int dni = sc.nextInt();
	        sc.nextLine(); 
	
	        System.out.print("Escribe la letra del DNI: ");
	        String letraDni = sc.nextLine().toUpperCase();
	
	       
	
	        String letraOk = letrasDNI[dni % 23];
	
	        System.out.println("El DNI es: " + dni);
	
	        if (!letraDni.equals(letraOk)) {
	            System.out.println("La letra " + letraDni + " no es correcta. La letra correcta es: " + letraOk);
	        } else {
	            System.out.println("La letra " + letraDni + " es correcta");
	        }

		
		
	}

}
