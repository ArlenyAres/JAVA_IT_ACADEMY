import java.util.Scanner;

public class M5_Ex3_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

						/*Math.ceil((Math.random() * 10)); 
				Retorna un número entre el 1 i el 10 de forma aleatòria.
				
				L’exercici consisteix a què l’usuari/ària ha d'endevinar el número escollit aleatòriament pel programa.
				
				El programa, demana números a l’usuari/ària fins que aquest encerti el número aleatori generat pel programa.
				
				Un cop l’usuari/ària ha endevinat el número, es mostrarà per pantalla el següent missatge: “Enhorabona, el número era X”*/
		
		
		     Scanner sc = new Scanner(System.in);
		
		     int  numUsu = 0;
		     int numPc = (int) Math.ceil((Math.random() * 10));
		     
		     
		     System.out.println("Bienvenido a Adivina un numero del 1 al 10");
		    // System.out.println(numPc);
		     
		     while (numUsu != numPc) {
		    	 System.out.println("Ingrese un numero");
		    	 numUsu = sc.nextInt();
		     }
		    	 
				System.out.println("Felicidades has acertado");
				sc.close();
	}

				
}