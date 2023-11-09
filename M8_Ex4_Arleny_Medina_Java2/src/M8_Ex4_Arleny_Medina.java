import java.util.ArrayList;
import java.util.Scanner;

public class M8_Ex4_Arleny_Medina {
	
	static Scanner sc = new Scanner(System.in);
	
	static ArrayList<Avion> aviones = new ArrayList<Avion>();
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		       

		        int opcion;
		        do {
		            System.out.println("Opciones:\n"
		           + "1. Dar de alta avion\n"
		           + "2. Eliminar Avion"
		           + "3. Mostrar avion\n"
		           + "4. Salir");
		           
		            opcion = sc.nextInt();

		            switch (opcion) {
		                case 1:
		                    altaAvion();   
		                    break;
		                case 2:
		                    eliminarAvion();		                   
		                    break;
		                case 3:
		                    mostrarAvion();
		                    break;
		            }
		        } while (opcion != 4);
		    }

		
	
	public static void altaAvion() {
		
		int numeroVuelo = 0;
		String marca = "";
		String modelo = "";
		double cargaKg = 0.0;
		double longitudMetros = 0;
		int numPersonas = 0;
		int numHelices = 0;
	        
		System.out.print("Tipo de avion\n"
	        		+ "1: Avión Comercial\n"
	        		+ "2: Avioneta\n"
	        		+ "3: Jet Privado): \n");
	        int tipoAvion = sc.nextInt();
	
	        System.out.print("indique el numero de vuelo: ");
	        numeroVuelo = sc.nextInt();
	        System.out.print("introduzca Marca: ");
	        marca = sc.next();
	        System.out.print("introduzca Modelo: ");
	        modelo = sc.next();
	        System.out.print("introduzca peso de carga en kg: ");
	        cargaKg = sc.nextDouble();
	        System.out.print("introduzca Longitud en metros: ");
	        longitudMetros = sc.nextDouble();
	
	        Avion avion = new Avion(numeroVuelo, marca, modelo, cargaKg, longitudMetros);
	        
	        
	
	        switch (tipoAvion) {
	            case 1:
	                System.out.print("introduzca el numero de pasajeros: ");
	                numPersonas = sc.nextInt();
	                avion = new AvionComercial(numeroVuelo, marca, modelo, cargaKg, longitudMetros, numPersonas);
	                break;
	            case 2:
	                System.out.print("introduzca el numero de helices: ");
	                numHelices = sc.nextInt();
	                avion = new Avioneta(numeroVuelo, marca, modelo, cargaKg, longitudMetros, numHelices);
	                break;
	
	            case 3:
	                System.out.print("introduzca el numero de personas dentro: ");
	                numPersonas = sc.nextInt();
	                avion = new JetPrivado(numeroVuelo, marca, modelo, cargaKg, longitudMetros, numPersonas);
	                break;
	        }
	
	        aviones.add(avion);
	 }
	                
                
       
                
	 public static void eliminarAvion() {
		 
		
				int numeroVuelo = 0;
				int posAvion;
				
				
				System.out.println("Indica el Numero de vuelo que deseas eliminar");
				numeroVuelo = sc.nextInt();
				sc.nextLine();
				posAvion = obPosicion(aviones, numeroVuelo);
				
				if(	posAvion != -1){
					aviones.remove(posAvion);
					System.out.println("Le hemos dado de baja el numero de vuelo : " + numeroVuelo + " correctamente \n");
				}else {
					System.out.println("El nnumero de vuelo indicado NO EXISTE!! \n");
				}

			}
		    
	 

	 public static void mostrarAvion() {
		 int numeroVuelo = 0;
		 boolean encontrado = false;
		    
		    System.out.print("Introduce el numero de vuelo del avion  que desea consultar: ");
		    numeroVuelo = sc.nextInt();

		    
		    for (Avion avion : aviones) {
		        if (avion.numeroVuelo == numeroVuelo) {
		            encontrado = true;
		            System.out.println(avion.toString());
		            
		        }
		    }

		    if (!encontrado) {
		        System.out.println("No se encontro ningún avion con el numero de vuelo indicado.");
		    }
		}
		    
		    
		    
	 public static int obPosicion(ArrayList<Avion> aviones, int numeroVuelo) {
		    for (int i = 0; i < aviones.size(); i++) {
		        Avion avion = aviones.get(i);
		        if (avion.numeroVuelo == numeroVuelo) {
		            return i;
		        }
		    }
		    return -1;
		}
		


	}


