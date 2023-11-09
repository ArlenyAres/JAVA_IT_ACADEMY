import java.util.ArrayList;
import java.util.Scanner;

public class M8_Ex3_Arleny_Medina {
	
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Clienta> clientes = new ArrayList<Clienta>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
			int opcion = 0;
			
			do {
				
				System.out.println("Bienvenido al la APP Vuelos indique las operacion que desea realizarn\"\n"      
				        + "1.Sortir de l'aplicació.\n"
				        + "2.Crear clienta.\n"
				        + "3.Eliminar clienta.\n"
				        + "4.Crear vol d'una clienta.\n"
				        + "5.Compensar CO₂ d'un vol d'una clienta (per cada 100 € es compensen 0,1 tones de CO₂ emès d'aquell vol).\n"
				        + "6.Calcular petjada de carboni d'una clienta (és la suma del CO₂ de tots els seus vols).\n"
				        + "7.Calcular petjada de carboni mitja de totes les clientes.");
				
				opcion = sc.nextInt();

	            switch (opcion) {
	                case 1:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                case 2:
	                    crearClienta();
	                    break;
	                case 3:
	                    eliminarClienta();
	                    break;
	                case 4:
	                    crearVuelo();
	                    break;
	                case 5:
	                    compensarCO2();
	                    break;
	                case 6:
	                    calcularHuellaDeClienta();
	                    break;
	                case 7:
	                    calcularHuellaMediaDeClientes();
	                    break;
	            }

	        } while (opcion != 1);
	    }

		public static void crearClienta() {
		
			System.out.println("Intrduce el nombre: ");
            String nombre = sc.next();
            sc.nextLine();
            System.out.println("Intrduce el DNI ");
            String dni = sc.nextLine();
            System.out.println("Intrduce el edad ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.println("Intrduce la nacionalidad ");
            String nacionalidad = sc.nextLine();
            
            Clienta cliente = new Clienta(nombre, dni, edad, nacionalidad);
            
            clientes.add(cliente);
            System.out.println("La Clienta " + nombre + " creada con exito.");
            System.out.println(clientes);
     
		}
		
		
		public static void eliminarClienta() {
			String nombre = "";
			int posClienta;
			
			
			System.out.println("Indica el nombre de la Clienta que deseas eliminar");
			nombre = sc.next();
			sc.nextLine();
			posClienta = obPosicion(nombre);
			
			if(	posClienta != -1){
				clientes.remove(posClienta);
				System.out.println("Le hemos dado de baja a la clienta: " + nombre + " correctamente \n");
			}else {
				System.out.println("El nombre indicado NO EXISTE!! \n");
			}

		}
		
		public static void crearVuelo() {
	        System.out.println("Introduce el nombre de la Clienta: ");
	        String nombreCliente = sc.next();
	        int posCliente = obPosicion(nombreCliente);

	        if (posCliente != -1) {
	            System.out.println("Introduce la distancia del vuelo en km: ");
	            double km = sc.nextDouble();
	            System.out.println("Introduce el nmero de vuelo: ");
	            int numVuelo = sc.nextInt();
	            System.out.println("Introduce el nombre de la compañia o nombre del vuelo: ");
	            String nomComp = sc.next();
	            System.out.println("Introduce el numero de pasajeros a bordo: ");
	            int pasajeros = sc.nextInt();
	            System.out.println("Introduce el nmero de motores: ");
	            int numMotores = sc.nextInt();

	            Vuelo vuelo = new Vuelo(km, numVuelo, nomComp, pasajeros, numMotores);
	            clientes.get(posCliente).addVuelo(vuelo);
	            System.out.println("Vuelo creado con exito para la clienta " + nombreCliente);
	        } else {
	            System.out.println("El nombre de la clienta indicado NO EXISTE.");
	        }
	    }
		
		
		public static void compensarCO2() {
		    System.out.println("Introduce el nombre de la Clienta: ");
		    String nombreCliente = sc.next();
		    int posCliente = obPosicion(nombreCliente);

		    if (posCliente != -1) {
		        System.out.println("Introduce la cantidad de euros para compensar CO₂: ");
		        int euros = sc.nextInt();

		        // Llamar al metodo compensaCO2 de la clase Clienta
		        clientes.get(posCliente).compensaCO2(euros);

		        System.out.println("Compensaci de CO₂ realizada con exito para la clienta " + nombreCliente);
		    } else {
		        System.out.println("El nombre de la clienta indicado NO EXISTE.");
		    }
		}
		

		public static void calcularHuellaDeClienta() {
	        System.out.println("Introduce el nombre de la Clienta: ");
	        String nombreCliente = sc.next();
	        int posCliente = obPosicion(nombreCliente);

	        if (posCliente != -1) {
	            double huella = clientes.get(posCliente).calcularHuella();
	            System.out.println("La huella de carboni de la clienta " + nombreCliente + " es: " + huella + " toneladas.");
	        } else {
	            System.out.println("El nombre de la clienta indicado NO EXISTE.");
	        }
	    }
		
		
		public static void calcularHuellaMediaDeClientes() {
	        double huellaMedia = calcularHuellaMedia(clientes);
	        System.out.println("La huella carb9no9 de todas las clientas es: " + huellaMedia + " toneladas.");
	    }
		
		public static double calcularHuellaMedia(ArrayList<Clienta> clientes) {
		    double totalCO2 = 0;
		    int totalClientes = clientes.size();
		    
		    for (Clienta cliente : clientes) {
		        totalCO2 += cliente.calcularHuella();
		    }
		    
		    if (totalClientes == 0) {
		        return 0;
		    }
		    
		    return totalCO2 / totalClientes;
		}
		
		
		public static int obPosicion(String nombre) {
	        for (int i = 0; i < clientes.size(); i++) {
	            if (clientes.get(i).getNombre().equals(nombre)) {
	                return i;
	            }
	        }
	        return -1;
	    }
	}
		

