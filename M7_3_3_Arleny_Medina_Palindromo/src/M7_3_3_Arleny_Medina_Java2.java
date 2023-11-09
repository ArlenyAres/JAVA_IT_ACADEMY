import java.util.Scanner;

public class M7_3_3_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*L’usuari/ària ha d’introduir una frase i el programa ha de dir si la frase és un palíndrom.
		 * PALABRA QUE SE LEE IGUAL AL DERECHO O AL REVES*/
		
		
					Scanner sc = new Scanner(System.in);
					String palabra = "";
					String resp = " ";
					 
					System.out.println("Escribe una PALABRA");
					palabra = sc.nextLine();
						
					     
				        if (esPalindromo(palabra)) {
				            resp ="La palabra es un palindromo";
				        } else {
				            resp = "La palabra no es un palindromo";
				        }
				        
				        System.out.println(resp);
				        sc.close();
	  }

	   
			public static boolean esPalindromo(String palabra) {
			    	
			        String palabraSinEs = palabra.replaceAll("\\s+", "").toLowerCase();
			        int longitud = palabraSinEs.length();
		
			        for (int i = 0; i < longitud / 2; i++) {
			            if (palabraSinEs.charAt(i) != palabraSinEs.charAt(longitud - 1 - i)) {
			                return false;
			            }
			        }
		
			        return true;
		
			}


}

