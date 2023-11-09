import java.util.Scanner;

public class M7_3_7_Arleny_Medina_java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*Escriu un programa per una botiga de surf on se li exposarà un menú als usuaris i usuàries amb les següents opcions:

Calcular material taula (crida a un mètode que rep un boolean que representi si la persona té experiència o no) si té, retornarà el missatge "taula de fibra", si no retornarà el missatge "taula d'espuma". (demanem per consola si l'usuari/ària si té experiència o no)

Imprimir forecast (crida a un mètode que rep l'alçada de l'onada en metres). Si l'alçada és més de 2 metres, imprimirà "onades grans", si no imprimirà "onades petites". (Introduïm l'alçada de les onades per consola, simulant que les rebem d'una aplicació externa)

Calcula el cost per reserva (crida a un mètode que rep els minuts de reserva i el tipus de taula reservada i retorna el cost de la reserva).
(demanem per consola els minuts i el tipus)
Taula tipus iniciació: 20 € cada 60 min.
Taula tipus intermig: 35 € cada 60 min.

Sortir del programa.

Fins que la persona no escrigui un 4, el programa ha de continuar mostrant el menú i donar la possibilitat de fer accions.*/
		
		Scanner sc = new Scanner(System.in);
		
		String experiencia = "";
		int olas = 0; int opcion = 0; int minutos = 0; 
		boolean tabla = false;
		
		
			do {
		
				System.out.println("Bienvenido a la tienda de Surf\n"
						
						+ "1. materal a alquilar\n"
						+ "2.Imprimir forecast\n"
						+ "3.Calcular el coste de la reserva\n"
						+ "4.Salir del Menu");
				opcion = sc.nextInt();
				
				
				switch (opcion){
					case 1:
						System.out.println("¿Tienes experiencia practicando surf?");
						experiencia = sc.next();
						if(experiencia.equalsIgnoreCase("si") == true) {
							System.out.println(materialTabla(true));
							tabla = true;
						}else {
							System.out.println(materialTabla(false));
							tabla = false;
						}
					break;
					case 2:
						System.out.println("indique el tamaño en metros de la ola");
						olas = sc.nextInt();
						System.out.println(onada(olas));
					break;
					case 3:
						System.out.println("Indique los min que desea su alquilar la tabla");
						minutos = sc.nextInt();
						System.out.println(coste(tabla, minutos));
					break;
				}
	
			}while(opcion != 4);
			
			System.out.println("Gracias por su visita");
		
	}
	
			public static String materialTabla(boolean experiencia) {
				if(experiencia == true) {
					return ">>>>taula de fibra<<<<";
				}else {
					return ">>>>taula d'espuma<<<<";
				}
				
			}
			
			public static String onada(int olas) {
				if (olas > 2) {
					return "Olas Grandes";
				}else {
					return "Olas pequeñas";
				}
				
			}

			public static String coste (boolean tabla, int minutos) {
				String respuesta = "";
				
				if ( tabla == false) {
					respuesta = " Tabla de iniciacion: " + (minutos / 60) * 20 + "€ ";
				}else {
					respuesta =  " Tabla de intermedia: " + (minutos / 60) * 35 + "€";
				}
				
				return respuesta; 			
			}


}
