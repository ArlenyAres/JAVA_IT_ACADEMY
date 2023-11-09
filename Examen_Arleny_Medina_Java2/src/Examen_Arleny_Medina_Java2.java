import java.util.Arrays;
import java.util.Scanner;

public class Examen_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				/*Escribe un programa en Java que simule un juego de adivinanza de palabras. El programa debe realizar lo siguiente:

				Tener una palabras secreta almacenada en un array.
				
				Mostrar una serie de guiones bajos (_) que representen las letras de la palabra secreta.
				Permitir al usuario adivinar letras una por una.
				Mostrar las letras adivinadas en su lugar correspondiente en los guiones bajos.
				Dar al usuario un número limitado de 3 intentos para adivinar la palabra completa.
				Mostrar el progreso del usuario en la adivinanza de la palabra después de cada intento.
				Anunciar si el usuario ha adivinado correctamente la palabra o si se han agotado los intentos.*/
								
									
						 Scanner sc = new Scanner(System.in);
					        
					       
					    char[] palabraSecreta = {'j', 'a', 'v', 'a'}; // inicio un array de char para guardar la palabra
					        
					     char[] progreso = new char[palabraSecreta.length]; // inicio un array para guardar las letras de la palabra
					        
					        
					     for (int i = 0; i < progreso.length; i++) {  // Este for
					            progreso[i] = '_';
					        }
					     
					        
					        int intentos = 3; // Inicio el numero de intentos para el contador
					        boolean adivinado = false;
					        
					        System.out.println("JUEGO Adivina la palabra!\n");  //inicio del programa para el usuario
					        
					        
					        
					      while (intentos > 0 && !adivinado) {  //Mientras intentos sea menor que 0 y doferente que adivinado esta activo el while
					        	
					    	    System.out.println("te quedan: " + intentos + " intentos\n");  //muestro los intentos que quedan de cada interaccio
					            System.out.print("Escribe una de las letra: \n");
					            char letra = sc.next().charAt(0);                     //pido la letra de la palabra
					            
					          
					            
					            boolean letraAdivinada = false;         
					            
					            for (int i = 0; i < palabraSecreta.length; i++) {          // para verificar si la letra adivinada esta dentro del arrya en cada iterccio
					                if (palabraSecreta[i] == letra && progreso[i] == '_') {   
					                    progreso[i] = letra;      // aqui Agrego la letra adivinada ala variable progreso
					                    letraAdivinada = true; 
					                }
					            }
					            
					            
					            //Mostrar el progreso del usuario en la adivinanza de la palabra después de cada intento.
					            
							    if (letraAdivinada == true) {                      // si letra adivinada es true muentras el mensaje
							                System.out.println("Has adivinado una letra.");
							     } else {                                                    // si letra adivinada es false
							                System.out.println("ERROR!! Intntalo de nuevo.");
							                intentos--;
							     }
							    
							    
							    
							     // aqui verifico si la leta esta contenida en el arreglo 
							    
							    boolean todasAdivinadas = true;  
					            
					            for (char letraProgreso : progreso) {
					                if (letraProgreso == '_') {
					                    todasAdivinadas = false;
					                }
					            }
					            
					            if (todasAdivinadas == true) {
					                adivinado = true;
					            }
					        }
					      
					      
				// Anunciar si el usuario ha adivinado correctamente la palabra o si se han agotado los intentos.*/
					        
					        if (adivinado) {
					            System.out.print("Has adivinado !!!: ");
					            
					            for (char letra : palabraSecreta) {
					                System.out.print(letra);
					            }
					            
					            System.out.println();
					            
					        } else {
					        	
					            System.out.print("Ya no te quedan intestos, la palabra secreta era: ");
					            for (char letra : palabraSecreta) {
					                System.out.print(letra);
					            }
					            
					            System.out.println();
					        }
					        
					     
	    }
	}
							
							




