
public class Vuelos {

	//Atributos
	
	private double km;
	private int numVuelo;
	private String nomComp;
	private int pasajeros;
	private int numMotores;
	
	
	//constructor
	
	public Vuelos( double km, int numVuelo, String nomComp, int pasajeros, int numMotores) {
		this.km = km;
		this.numVuelo = numVuelo;
		this.nomComp =  nomComp;
		this.pasajeros = pasajeros;
		this.numMotores = numMotores;
	}

	//Getters

	public double getKm() {
		return km;
	}
	
	public int getNumVuelo() {
		return numVuelo;
	}
	
	public String getNomComp() {
		return nomComp;
	}
	
	public int getPasajeros() {
		return pasajeros;
	}
	
	public int getNumMotores() {
		return numMotores;
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
	
	//metodos generales
	
	public double huella(double km, int numMotores ) {
		double cO2 = (numMotores * 0.1);
		double carbono = (km / 1000) * cO2;
		return carbono;
	}
	
	//metodos propios
	
	public String toString() {
		
		return "El vuelo de la compañia " + this.nomComp + " con numero de vuelo " + this.numVuelo + ", realiza " + this.km + " km "
				+ " ,y ta bordo viajaran " + this.pasajeros + " pasajeros, disponde de " + this.numMotores + " motores." + " siendo su huella ";
	}
	
	
}
