import java.util.Scanner;

public class M5_Ex4_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
					/*Fes un programa que demani per consola quants nens i nenes volem introduir per fer una reserva d'una actuació de titelles.
			
			   Un cop sabem el nombre de nens i nenes has de demanar les seves edats. Les edats només poden estar compreses entre 5 i 12 anys, 
			   per tant, si en demanar una edat, l'usuari/ària introdueix una que no està en aquest rang, li has de tornar a demanar (fins que introdueixi una correcta).
			
			Finalment, has de mostrar per pantalla la mitjana d'edats dels nens.*/
		
		
		
			Scanner sc = new Scanner (System.in);
			
			int nens = 0, edad = 0, suma = 0, nens2 = 0;
			float media = 0f;
			
			
			System.out.println("¿Para cuantos niños desea realizar la reserva?");
			nens = sc.nextInt();
			
			
			for (int i = 0; i < nens; i++) {
				System.out.println("Indicame las edades");
				edad = sc.nextInt();
				
				  if (edad >= 5 && edad <= 12) {
					  suma += edad;
					  nens2 = i;
				  }else {
					  i--;
					  System.out.println ("introduce una edad entre 5 y 12 años");
				  }
			}
			
			media =(suma/nens2);
			
			//System.out.println (suma);
			
			//System.out.println (nens2);
			
			System.out.println ("la media de las edades es: " + media );
			sc.close();
			
	}

}
