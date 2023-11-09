import java.util.ArrayList;
import java.util.Scanner;

public class M8_Ex2_Arleny_Medina {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Vuelos> vuelosLista = new ArrayList <Vuelos>();



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int opcion = 0;
		
				do {
					
					System.out.println("Bienvenido al Aeropuerto indique las operacion que desea realizarn\"\n"      
					        + "1. Crear Vuelo\n"
							+ "2. Dar de baja vuelo \n"
							+ "3. Ver vuelo y su huella de carbono\n"
							+ "4. Modificar Vuelo\n"
							+ "5. Salir del programa");
					
					opcion = sc.nextInt();
		
					switch (opcion) {
					  case 1:
						  crearVuelo();
						  break;
					  case 2:
						 bajaVuelo();
						  break;
					  case 3:
						  statusVuelo();
						  break;
					  case 4:
					  modificarVuelo();
						  break;
					  case 5:
						  System.out.println("Saliendo del programa... ...");
						  break;
					}
					
				}while (opcion != 5);
	}	
	
	
	
	public static void crearVuelo() {
		double km; int numVuelo; String nomComp; int pasajeros; int numMotores;
		
		System.out.println("Indique el nombre de la compañia");
		nomComp = sc.next();
		System.out.println("Indique el numero de vuelos");
		numVuelo = sc.nextInt();
		System.out.println("Indique los km que realiza");
		km = sc.nextDouble();
		System.out.println("Indique el numero de pasajeros");
		pasajeros = sc.nextInt();
		System.out.println("Indique el numero de motores");
		numMotores = sc.nextInt();
		
		vuelosLista.add(new Vuelos(km, numVuelo, nomComp ,pasajeros, numMotores));
		
	}
	
	public static void bajaVuelo() {
		int numVuelo = 0;
		int posVuelo = 0;
		
		
		System.out.println("Indica el numero de vuelo que deseas eliminar");
		numVuelo = sc.nextInt();
		
		posVuelo = obPosicion(numVuelo);
		
		if(posVuelo != -1){
			vuelosLista.remove(posVuelo);
			System.out.println("Le hemos dado de baja al numero de vuelo: " + numVuelo + " correctamente \n");
		}else {
			System.out.println("El numero de vuelo indicado NO EXISTE!! \n");
		}

	}
		
	
	public static void statusVuelo() {
	    System.out.println("Indica el numero de vuelo que quiere visualizar ");
	    int numVuelo = sc.nextInt();
	    int posVuelo = obPosicion(numVuelo);

	    if (posVuelo != -1) {
	        
	        int numMotores = vuelosLista.get(posVuelo).getNumMotores();
	        double km = vuelosLista.get(posVuelo).getKm();

	        System.out.println(vuelosLista.get(posVuelo).toString());
	        System.out.println("Su huella de carbono es de "+ vuelosLista.get(posVuelo).huella(km, numMotores));
	        
	    } else {
	        System.out.println("El numero de vuelo indicado es erroneo");
	    }
	}
	
	public static void  modificarVuelo() {
		
		
			int opcionMod = 0;
			int posVuelo = 0;
			
			System.out.println ("Indica el numero del vuelo que quiere  Modificar");
			int numVuelo = sc.nextInt();
			posVuelo = obPosicion(numVuelo);
			
			if ( posVuelo != -1) {
				
			
			System.out.println("Introduce un numero entre 1-5\n"
					+ "1. Modificar Nombre del vuelo\n"
					+ "2. Modificar el numero de pasajeros\n"
					+ "3. Modificar el numero de kilometros\n"
					+ "4. Modificar el numero de motores\n"
					+ "5. Salir del programa");
			opcionMod  = sc.nextInt();
			
			switch(opcionMod) {
			  case 1:
				System.out.println("Indique el nuevo nombre del vuelo ");
				String nuevoNom = sc.next();
				vuelosLista.get(posVuelo).setNomComp(nuevoNom);;
				System.out.println("Se han modificado el nombre de la compañia " + nuevoNom);
				break;
			  case 2: 
				System.out.println("Indique el nuevo numero de pasajeros");
				int nuevoPasj = sc.nextInt();
				vuelosLista.get(posVuelo).setPasajeros(nuevoPasj);
				System.out.println("Se ha modificado el numero de pasajeros a " + nuevoPasj);
				break;
			  case 3:
				System.out.println("Indique los nuevos kilometros");
				double nuevoKm = sc.nextInt();
				vuelosLista.get(posVuelo).setKm(nuevoKm);
				System.out.println("Se ha modificado los kilometros" + nuevoKm);
				break;
			  case 4:
				System.out.println("Indique los nuevos kilometros");
				int nuevoMotores = sc.nextInt();
				vuelosLista.get(posVuelo).setNumMotores(nuevoMotores);
				System.out.println("Se ha modificado los motores" + nuevoMotores);
				break;
			  case 5:
				System.out.println("Saliendo del modificador de vuelos...");
				break;
			 }
			} else {
				System.out.println("no existe el vuelo indicado");
	     	}
		}

		
	
	public static int obPosicion(int numVuelo) {
		int i = 0;
		
		while (i < vuelosLista.size()) {
			Vuelos vuelo = vuelosLista.get(i);
		
			  if (vuelo.getNumVuelo() == numVuelo) {
			      return i;
			   }
			       i++;
			   }
		
			    return -1; 
			}

}
        
