
public class Avion {
		
	//Atributos	
		
	    protected int numeroVuelo;
	    protected String marca;
	    protected String modelo;
	    protected double cargaKg;
	    protected double longitudMetros;
	    
	    
	  //Constructor
	
	    public Avion(int numeroVuelo, String marca, String modelo, double cargaKg, double longitudMetros) {
	        this.numeroVuelo = numeroVuelo;
	        this.marca = marca;
	        this.modelo = modelo;
	        this.cargaKg = cargaKg;
	        this.longitudMetros = longitudMetros;
	    }
	    
	    
	    //geeters
	
	    public int getNumeroVuelo() {
			return this.numeroVuelo;
		}


		public String getMarca() {
			return this.marca;
		}

		public String getModelo() {
			return this.modelo;
		}
		
		public double getCargaKg() {
			return this.cargaKg;
		}
		

		//Setters


		public void setNumeroVuelo(int numeroVuelo) {
			this.numeroVuelo = numeroVuelo;
		}


		public void setMarca(String marca) {
			this.marca = marca;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}


		public void setCargaKg(double cargaKg) {
			this.cargaKg = cargaKg;
		}

		public void setLongitudMetros(double longitudMetros) {
			this.longitudMetros = longitudMetros;
		}


		public double getLongitudMetros() {
			return longitudMetros;
		}



		//Metodos Propios

		public double calcularMinutosLimpieza() {
	        return 10 * longitudMetros;
	    }
	
	    public double calcularCombustible() {
	        return longitudMetros * cargaKg;
	    }
	    
	    
	    
	   
		public String toString() {
			return " Este Avion tiene un coste de limpieza por minitos " + calcularMinutosLimpieza() + ", Y el costo de ombustible:"
					+ calcularCombustible();
		}
	    
	    

}

