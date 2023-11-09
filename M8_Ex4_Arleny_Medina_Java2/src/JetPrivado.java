
	class JetPrivado extends Avion {
		
	    private int numPersonas;
	    
	    

	    public JetPrivado(int numeroVuelo, String marca, String modelo, double cargaKg, double longitudMetros, int numPersonas) {
	        super(numeroVuelo, marca, modelo, cargaKg, longitudMetros);
	        this.numPersonas = numPersonas;
	    }
	    
	    

	    public int getNumPersonas() {
			return numPersonas;
		}


		public void setNumPersonas(int numPersonas) {
			this.numPersonas = numPersonas;
		}




		//metodo propio


		public double calculaCostoReserva() {
	        if (numPersonas <= 10) {
	            return numPersonas * 1000.0;
	        } else {
	            return 10000.0;
	        }
	    }
		
		
		public String toString() {
			return "Este Jet PRIVADO tiene a bordo " + this.numPersonas + " pasajeros, identificado con el numero Vuelo:" + this.numeroVuelo + ", marca=" + this.marca
					+ ", modelo:" + this.modelo + ", con una carga en Kg=" + this.cargaKg + ", su longitud en Metros:" + this.longitudMetros
					+ ", el costo de su reserva es :" + calculaCostoReserva()+ super.toString() ;
		}
	}


