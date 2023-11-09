import java.util.Scanner;

public class M4_Ex6_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						
						/*Crea un programa per a un restaurant o tenen tres plats (carn, pasta “amb gluten” i risotto "amb lactosa").
				
				El programa ha de demanar el plat que vol l'usuari/ària, però també ha de demanar si té cap preferència o intolerància 
				(vegà, intolerància al gluten o intolerància a la lactosa).
				
				Si la persona demana un plat "que pot menjar" mostrarem per consola el missatge "perfecte, comanda correcta",
				 si no, es mostrarà el missatge "vostè no pot menjar aquest plat". */

		
				int plato = 0, prefer = 0;
				String resp = "";
				
				
				Scanner sc = new Scanner(System.in);
				
				
					System.out.println("Indicame el plato que deseas comer\n"
							+ "1. Carne\n"
							+ "2. Pasta\n"
							+ "3. Risotto\n");
					
				    plato = sc.nextInt();
	
					
			 if (plato > 0 && plato <= 3) {
					
					System.out.println("Indicame si tiene alguna de las siguientes preferencias alimentarias\n"
							+ "1. Vegano\n"
							+ "2. Intolerante al gluten\n"
							+ "3. Intolerante a la lactosa\n"
							+ "4. Ninguno\n");
					
				    prefer = sc.nextInt();
				    
					
					switch (prefer){
					
						case 1:
							
							resp =(plato == prefer) ? "No puede comer este plato por que usted es vegano, escoja otra opcion" :"Perfecto, comadada correcta" ;
							 
							/*if (plato == prefer) {
								resp = "No puede comer este plato por que usted es vegano, escoja otra opcion";
							}else {
							resp = "Perfecto, comadada correcta";}*/
							break;
						case 2:
							if (plato == prefer) {
								resp = "No puede comer este plato por que usted es intolerante al gluten, escoja otra opcion";
							}else {
								resp = "Perfecto, comadada correcta";}
							break;
						case 3:
							if (plato == prefer) {
								resp = "No puede comer este plato por que usted es intolerante a la lactosa, escoja otra opcion";
							}else {
								resp = "Perfecto, comadada correcta";}
							break;
						case 4:
							resp = "Perfecto, comadada correcta";
							break;	
						default:
							resp = "Elija una opcion entre 1 y 4";
					}
					
			}else {
					resp = "Elija una opcion Correcta entre los platos ofrecidos";
				  }
					
					System.out.println(resp);
					sc.close();
	}

}
