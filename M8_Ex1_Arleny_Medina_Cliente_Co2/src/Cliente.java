
public class Cliente {
	
	//atributos
	
	private String dni;
	private int edad;
	private String nacionalidad;
	private int vuelos;
	
	//Constructores
	public Cliente (String dni, String nacionalidad) {
		this.dni = dni;
		this.edad = 18;
		this.nacionalidad = nacionalidad;
		this.vuelos = 10;
		
	}
	
	public Cliente (String dni,int edad, String nacionalidad, int vuelos) {
		this.dni = dni;
		this.edad = edad;
		this.nacionalidad = nacionalidad;
		this.vuelos = vuelos;
	}

	//getters
	public  String getDni() {
		return this.dni;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public String getNacionalidad() {
		return this.nacionalidad;
	}
	
	
	public int getVuelos() {
		return this.vuelos;
	}
	
	//settters
	public void setDni(String dni) {
		this.dni = dni;
		
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	public void setVuelos (int vuelos) {
		this.vuelos = vuelos;
	}
	
	//metodos Generales
	public double huella(int vuelos) {
		double carbono = vuelos * 0.5;
		return carbono;
	}
	
	
	//metodos propios
	public String toString() {
		return "Cliente con Dni: " + this.dni + " y con nacionalidad " + this.nacionalidad + " tiene " + this.edad
				+  " con " +  this.vuelos + " vuelos" + " y su huella de carbono es: " + huella(vuelos);
		
	}
	
	
}
