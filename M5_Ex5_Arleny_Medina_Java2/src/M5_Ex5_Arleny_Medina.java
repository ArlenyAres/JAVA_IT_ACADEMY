import java.util.ArrayList;
import java.util.Scanner;

public class M5_Ex5_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*Modifica l'exercici 3 del Mòdul 4.

			Has de demanar paraules fins que tinguis tres boniques. 
			Has d'anar guardant les paraules boniques en un array i quan tinguis les tres, imprimir-les.*/
		
					Scanner sc = new Scanner(System.in);
					ArrayList<String> bonitas = new ArrayList<String>();
					
					String palabra = "";
			        String resp = "";
			        
			        

			        while (bonitas.size() < 3) {
			        	
			        	
			            System.out.println("Escribe una palabra de 5 o 9 letras para saber si es bonita:");
			            palabra = sc.next();

			            palabra = palabra.toLowerCase(); // Se utiliza para que no distinga entre mayúsculas o minúsculas
			            char letraHP = palabra.charAt(0);

				            if ((palabra.length() == 5 && letraHP == 'p') || (palabra.length() == 9 && letraHP == 'h')) {
				                bonitas.add(palabra);
				                resp = "La palabra introducida es bonita\n";
				                
				            } else {
				                resp = "La palabra introducida NO es bonita\n";
				            }
	
				            System.out.println(resp);
			        }

			        System.out.println("Palabras bonitas: " + bonitas);

			        sc.close();
			}


}



			/*do {
					
					System.out.println("Escribe una palabra de 5 o 9 letras para saber si es bonita");  //
					palabra = sc.next();
					
					palabra = palabra.toLowerCase(); // Se utiliza para que no distinga entre mayusculas o minusculas
					
					char letraHP = palabra.charAt(0);  // se declara despues, por que no funciona antes de conseguir la palabra
				
					
						if ((palabra.length() == 5 && letraHP == 'p') || (palabra.length() == 9 && letraHP == 'h')) {  //estructura condicional 
				            bonitas.add(palabra);
							resp = " La palabra introducida Es bonita";
							
				        } else {
				            resp = "La palabra introducida NO es bonita";
				        }
						
						
					}while (bonitas.size() <= 3);
					
					
					System.out.println(resp);
					System.out.println(bonitas);
					
					sc.close();
			}*/
