import java.util.Scanner;

public class M5_ExExtra1_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
						/*Realitzar un joc per endevinar un nombre aleatori N, entre 1 i 500. 
				
				Si la distància entre el nombre a endevinar i el de l'usuari/ària és de 50 o més, el programa haurà de dir: 
				
				“Fred, fred: el teu número és més gran “ o “Fred, fred: el teu número és més petit “ 
	
				Si la distància entre el nombre a endevinar i el de l'usuari/ària està entre 15 i 50, el programa haurà de dir: 
				
				“Tebi, Tebi: el teu número és més gran “ o “Tebi, Tebi: el teu número és més petit “ 

				I si la distància entre el nombre a endevinar i el de l'usuari/ària és menor a 15, el programa haurà de dir: 
				
				“Calent, calent: el teu número és més gran “ o “Calent, calent: el teu número és més petit “ 
				
				El procés acaba quan l'usuari/ària encerta.*/
		
		
		
				int numPc = (int)(Math.random() * 500 ) + 1 ;
				int numUsu = 0;
				int diferencial = numPc - numUsu;
				int intentos = 3;
				
				String resp = "";
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println(numPc); //para comprovar que numero escoge el ordenador
				
				System.out.println("Indica tu numero 1 al 500");
				numUsu = sc.nextInt();
				
				
				
				
				while ( numPc != numUsu) {
					
				
					if( diferencial > 0 && diferencial < 15) {
						resp = "Caliente caliente tu numero es mas pequeño";
					}else if (diferencial < 0 && diferencial > -15) {
						resp = "Caliente caliente tu numero es mas grande";
					}else if (diferencial >= 15 && diferencial < 50 ){
						resp = "templado templado tu numero es mas pequeño";
					}else if (diferencial <= -15 && diferencial > -50 ) {
						resp = "templado templado tu numero es mas grande";
					}else if (diferencial >= 50 ) {
						resp = "frio frio tu numero es mas pequeño";
					}else if ( diferencial <= -50 ) {
						resp = "frio frio tu numero es mas grande";
					}
					 intentos--;
				}
	
				
				  if(intentos == 0) {
			            System.out.println("Has excedido los intentos.");
			        } else {
			            System.out.println("Enhorabuena, has acertado!");
					resp = " Has acertado!!!";
					
					System.out.println(resp);
					sc.close();
	}
	} 

}
            //ORIOL CODIGO//

			/*   int n = (int)(Math.random() * 500) + 1; 
        int variable = 0;
        int diferencial = 0;
        int intentos = 3;

        Scanner entrada = new Scanner(System.in);
        System.out.println(n);

        while((n != variable) && (intentos > 0)) {
            System.out.println("Hola, dime un número del 1 al 500 por favor:");
            variable = entrada.nextInt();

            if(n != variable) {
                diferencial = n - variable;

                if(diferencial > 0 && diferencial < 15)  {
                    System.out.println("Caliente, caliente, tu número es más pequeño");

                }else if(diferencial < 0 && diferencial > -15) {
                    System.out.println("Caliente, caliente, tu número es más grande");
                }else if(diferencial >= 15 && diferencial < 50) {
                    System.out.println("Templado, templado, tu número es más pequeño");
                }else if(diferencial <= -15 && diferencial > -50) {
                    System.out.println("Templado, templado, tu número es más grande");
                }else if(diferencial >= 50) {
                    System.out.println("Frío, frío, tu número es más pequeño");
                }else if(diferencial <= -50) {
                    System.out.println("Frío, frío, tu número es más grande");
                }

                intentos--;
            }
        }

        if(intentos == 0) {
            System.out.println("Has excedido los intentos.");
        } else {
            System.out.println("Enhorabuena, has acertado!");
        }

        entrada.close();
    }
*/
