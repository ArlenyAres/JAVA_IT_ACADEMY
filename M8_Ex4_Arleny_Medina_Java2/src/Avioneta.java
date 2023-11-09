
public class Avioneta extends Avion {
	
		//Atributo
	    private int numHelices;
	    
	    
	    //constructor
	    

	    public Avioneta(int numeroVuelo, String marca, String modelo, double cargaKg, double longitudMetros, int numHelices) {
	        super(numeroVuelo, marca, modelo, cargaKg, longitudMetros);
	        this.numHelices = numHelices;
	    }
	    
	    
	    

	    public int getNumHelices() {
			return this.numHelices;
		}



		public void setNumHelices(int numHelices) {
			this.numHelices = numHelices;
		}



		 //metodos propios


		public double calculaDistancia() {
	        return numHelices * 1000.0;
	    }
		
		
		public String toString() {
			return "Esta avioneta tiene " + this.numHelices + " helices, identificado con el numero Vuelo:" + this.numeroVuelo + ", marca=" + this.marca
					+ ", modelo:" + this.modelo + ", con una carga en Kg=" + this.cargaKg + ", su longitud en Metros:" + this.longitudMetros
					+ ", la distancia que puede recorer es de  :" + calculaDistancia() + super.toString() + "]";
		}
	}


