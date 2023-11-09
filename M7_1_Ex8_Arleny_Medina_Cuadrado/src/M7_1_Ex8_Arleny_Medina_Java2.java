import java.util.Scanner;

public class M7_1_Ex8_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Crea un menú que permeti canviar d’unitats:

						Passar de metres a peus. .
						De peus a metres 
						De metres a iardes. 
						De iardes a metres   */ 
		
			Scanner sc = new Scanner(System.in);
			double unidad = 0;
			int opcion = 0;
			double pies = 0;
			double metros = 0;
			double yardas = 0;
			String result = "";
			
	
			do {
					
					System.out.println("Indica las unidades que quieres convertir ");
					unidad = sc.nextInt();
					System.out.println();
					
					System.out.println("Escoge la conversion que deseas realizar\n"
							+ "1. metros a pies.\n"
							+ "2. De pies a metros.\n"
							+ "3. De metros a yardas\n"
							+ "4. De yardas a metros\n"
							+ "0. Salir\n");
					
					opcion = sc.nextInt();
					
					
						switch (opcion) {
							case 1:
								pies = (unidad / 0.3048);
								result = ("De metros a pies: " + pies);
								break;
							case 2:
								metros = (unidad * 0.3048);
								result = ("De pies a metros : " + metros);
								break;
							case 3:
								yardas = (unidad * 1.09361);
								result = ("De metros a  yardas: " + yardas);
								break;
							case 4:
								metros = (unidad / 1.09361);
								result = ("De yardas a metros : " + metros);
								break;
			          	}
					
					System.out.println(result);
					System.out.println();
			
			}while(opcion != 0);
			
			
	}

}
