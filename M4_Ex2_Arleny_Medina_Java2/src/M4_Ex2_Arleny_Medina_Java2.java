import java.util.Scanner;

public class M4_Ex2_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			/* Crea un programa que sol·liciti a l'usuari que introdueixi el seu nom i el nombre d'anys que porta treballant en una empresa per teclat i mostri per pantalla el seu nivell salarial, segons la següent taula:

					Menys de 2 anys - 25.000 €
					Entre 2 i 4 anys 35.000 €
					Més de 4 i fins a 7 anys 50.000 €
					Més de 7 i fins a 10 anys 65.000 €
					Més de 10 anys 80.000 €*/
		
			Scanner sc = new Scanner (System.in);
			
			
			String nombre = "";
			int anos = 0;
			String nSalarial = "";
			
			System.out.println("Indica tu nombre");
			nombre = sc.next();
			
			System.out.println("Indica los años que llevas en tu empresa");
			anos = sc.nextInt();
			
					if (anos <= 1) {
						nSalarial = nombre + " tu nivel salarial es de 25.000€";
					}else if (anos >= 2 && anos <= 4) {
						nSalarial = nombre + " tu nivel salarial es de 35.000€";
					}else if(anos >= 5 && anos <= 7){
						nSalarial = nombre + " tu nivel salarial es de 50.000€";
					}else if(anos >= 8 && anos <= 10){
						nSalarial = nombre + " tu nivel salarial es de 65.000€";
					}else if (anos >= 11 && anos <= 50){
						nSalarial = nombre + " tu nivel salarial es de 80.000€";
					}else {
						nSalarial = nombre + " deberias estar cobrando una pension";
					}
			
			
					System.out.println(nSalarial);
		
					sc.close();
	}

}
