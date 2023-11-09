
public class AvionComercial extends Avion {
	
		//atributo
	    private int numPersonas;

	    public AvionComercial(int numeroVuelo, String marca, String modelo, double cargaKg, double longitudMetros, int numPersonas) {
	        super(numeroVuelo, marca, modelo, cargaKg, longitudMetros);
	        this.numPersonas = numPersonas;
	    }
	    
	    
	    //Get

	    public int getNumPersonas() {
			return this.numPersonas;
		}


	    //Set

		public void setNumPersonas(int numPersonas) {
			this.numPersonas = numPersonas;
		}


		//Metodo propio

		public double calculaCostoComida() {
	        return numPersonas * 10.0;
	    }


		
		public String toString() {
			return "Este AvionComercial tiene a bordo " + this.numPersonas + " pasajeros, identificado con el numero Vuelo:" + this.numeroVuelo + ", marca=" + this.marca
					+ ", modelo:" + this.modelo + ", con una carga en Kg=" + this.cargaKg + ", su longitud en Metros:" + this.longitudMetros
					+ ", el costo de Comida es :" + calculaCostoComida() + super.toString() + "]";
		}
		
		
		
	}

	



