import java.util.Scanner;

public class M4_Ex3_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Els estudis lingüístics moderns diuen que les paraules més boniques de diccionari són aquelles que contenen 9 lletres 
		 * i comencen per la lletra 'H', o bé , contenen 5 lletres i comencen per la lletra 'P'.
         Fes un programa que demani una paraula i determini si és bonica o no (segons el patró explicat prèviament).*/

		
			Scanner sc = new Scanner(System.in);
			
			String palabra = "";
			String resp = "";							//Declarcion de varibles 
			
			
			
			System.out.println("Escribe una palabra de 5 o 9 letras para saber si es bonita");  //
			palabra = sc.next();
			
			palabra = palabra.toLowerCase(); // Se utiliza para que no distinga entre mayusculas o minusculas
			
			char letraHP = palabra.charAt(0);  // se declara despues, por que no funciona antes de conseguir la palabra
			
			
			
			
			//if (palabra.length() == 5 || palabra.length() == 9) {  // estructura de contrl 
				
			
				if ((palabra.length() == 5 && letraHP == 'p') || (palabra.length() == 9 && letraHP == 'h')) {  //estructura condicional 
		            
					resp = " La palabra introducida Es bonita";
					
		        } else {
		            resp = "La palabra introducida NO es bonita";
		        }
				
			//}else {
				// resp = " La palabra introducida no cumple con las caaracteristicas";}
			
			
			System.out.println(resp);
			
			sc.close();
	}

	
	}
	




