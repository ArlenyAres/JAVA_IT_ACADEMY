import java.util.Scanner;

public class M4_Ex5_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Fer un programa que demani dos números i un operador(+,-,*,/). 

		Al final, el programa ha d'imprimir per pantalla el resultat de fer l’operació que contingui la variable operador.*/

		
					int num1 = 0;
					int num2 = 0;
					int operador = 0;
					String resp = " ";
					
					Scanner sc = new Scanner(System.in);
					
					System.out.println("Indicame El primer numero con el cual desea realizar la operacion");
					num1 = sc.nextInt();
					
					System.out.println("Indicame el segundo numero con el cual desea realizar la operacion");
					num2 = sc.nextInt();
					
					System.out.println("Indicame la opcion para el tipo de operacion desea realizar\n"
							+ "1. + Suma\n"
							+ "2. - resta\n"
							+ "3. x Multiplicacion\n"
							+ "4. / Divicion");
					
				// operador = sc.nextInt().charAt(0); // si en vez de numeros pedimos el operador directamente podemos hacer esta formula
					
				operador = sc.nextInt();
					
				if (operador <= 5) {   //estructura de control
					
				    switch (operador){
						case 1:
							resp = "El resultados es: " + (num1 + num2);
							break;
						case 2:
							resp = "El resultados es: " + (num1 - num2);
							break;
						case 3:
							resp = "El resultados es: " + (num1 * num2);
							break;
						case 4:
							resp = "El resultados es: " + (num1 / num2);
							break;
				        }
				}else{
					resp = " Tiene que indicar una opcion del 1 al 5";
						}
			
						System.out.println(resp);
						sc.close();
					
	}

}
