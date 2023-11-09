import java.util.ArrayList;

public class Clienta {
	
	//atributos
	private String nombre;
    private String dni;
    private int edad;
    private String nacionalidad;
    private ArrayList<Vuelo> vuelos; // Lista de vuelos asociados a la Clienta

    public Clienta(String nombre, String dni, int edad, String nacionalidad) {
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.vuelos = new ArrayList<Vuelo>();
    }
		/*Se incluye un campo en la clase Cliente que es una lista (en este caso, un ArrayList) de objetos Vuelo.
		Cada instancia de la clase Cliente tiene su propia lista de vuelos asociados. */
		

		
		//getters

		public String getNombre() {
			return this.nombre;
		}

		public  String getDni() {
			return this.dni;
		}
		
		public int getEdad() {
			return this.edad;
		}
		
		public String getNacionalidad() {
			return this.nacionalidad;
		}
		
		
		public ArrayList<Vuelo> getVuelos() {
	        return this.vuelos;
	    }





		//settters
		
		public void setDni(String dni) {
			this.dni = dni;
			
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}


		public void setEdad (int edad) {
			this.edad = edad;
		}
		
		public void setNacionalidad(String nacionalidad) {
			this.nacionalidad = nacionalidad;
		}
		
		
		public void setVuelos(ArrayList<Vuelo> vuelos) {
	        this.vuelos = vuelos;
	    }



		//metodos Generales
		
		
		public void addVuelo(Vuelo vuelo) {
	        vuelos.add(vuelo);
	    }
	
		
		public double calcularHuella() {
	        double totalCO2 = 0;
	        for (Vuelo vuelo : vuelos) {
	            totalCO2 += vuelo.getCo2Mes();
	        }
	        return totalCO2;
	    }
		
		
		public void compensaCO2(int euros) {
		    double toneladasCompensadas = euros / 100.0; // 0.1 toneladas por cada 100 euros
		    double nuevoCO2 = 0;
		    
		    for (Vuelo vuelo : vuelos) {
		        nuevoCO2 += vuelo.getCo2Mes();
		    }
		    
		    nuevoCO2 -= toneladasCompensadas;
		    
		    if (nuevoCO2 < 0.0) {
		        nuevoCO2 = 0.0;
		    }
		    
		    for (Vuelo vuelo : vuelos) {
		        vuelo.setCo2Mes(nuevoCO2);
		    }
		}
		
		


	   
		
		//metodos propios
		public String toString() {
			return "Cliente con nombre: " + this.nombre + "con Dni: " + this.dni + " y con nacionalidad " + this.nacionalidad + " tiene " + this.edad
					+  " con " +  this.vuelos + " vuelos" + " y su huella de carbono es: " ;
			
		}
		
		

}
