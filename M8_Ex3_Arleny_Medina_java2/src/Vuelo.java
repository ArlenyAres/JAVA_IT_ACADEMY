
public class Vuelo {
	
	//Atributos
	
	private double km;
    private int numVuelo;
    private String nomComp;
    private int pasajeros;
    private int numMotores;
    private double co2Mes; 

    public Vuelo(double km, int numVuelo, String nomComp, int pasajeros, int numMotores) {
        this.km = km;
        this.numVuelo = numVuelo;
        this.nomComp = nomComp;
        this.pasajeros = pasajeros;
        this.numMotores = numMotores;
        this.co2Mes = 1.0; // CO₂ inicial de todos los vuelos
    }


		//Getters

		public double getKm() {
			return this.km;
		}
		
		public int getNumVuelo() {
			return this.numVuelo;
		}
		
		public String getNomComp() {
			return this.nomComp;
		}
		
		public int getPasajeros() {
			return this.pasajeros;
		}
		
		public int getNumMotores() {
			return this.numMotores;
		}

		public double getCo2Mes() {
			return this.co2Mes;
		}
		
		
		
		//setters


		public void setKm(double km) {
			this.km = km;
		}

		public void setNumVuelo(int numVuelo) {
			this.numVuelo = numVuelo;
		}

		public void setNomComp(String nomComp) {
			this.nomComp = nomComp;
		}

		public void setPasajeros(int pasajeros) {
			this.pasajeros = pasajeros;
		}

		public void setNumMotores(int numMotores) {
			this.numMotores = numMotores;
		}
		
		public void setCo2Mes(double co2) {
			this.co2Mes = co2;
		}
		
		
		//metodos generales


		public void compensaCO2(int euros) {
	        double toneladasCompensadas = euros / 100.0; // 0.1 toneladas por cada 100 euros
	        double nuevoCO2 = co2Mes - toneladasCompensadas;

	        if (nuevoCO2 < 0.0) {
	            co2Mes = 0.0;
	        } else {
	            co2Mes = nuevoCO2;
	        }
	    }

		
		//metodos propios
		
		public String toString() {
			
			return "El vuelo de la compañia " + this.nomComp + " con numero de vuelo " + this.numVuelo + ", realiza " + this.km + " km "
					+ " ,y a bordo viajaran " + this.pasajeros + " pasajeros, disponde de " + this.numMotores + " motores." + " siendo su huella ";
		}
		

}
