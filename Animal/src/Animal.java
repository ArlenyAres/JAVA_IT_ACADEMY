
public class Animal {
	
	 //Atributos
    private int patas ;
    private boolean pelo;
    private String tipo;
    private double peso;
    private String color;
    private boolean cazando;
    
    
    //Metodo constructor         +++cuando hay m,as de un constructor, se llama sobrecarga de constructores
    
    public Animal(int patas, boolean pelo, String tipo, double peso) {
    	this.patas = patas;
    	this.pelo = pelo;
    	this.tipo = tipo;
    	this.peso = peso;
    	this.color = "no definido";
    	this.cazando = false;
    	
    	
    }
    
    public Animal(int patas, boolean pelo, String tipo, double peso, String color) {
    	this.patas = patas;
    	this.pelo = pelo;
    	this.tipo = tipo;
    	this.peso = peso;
    	this.color = color;
    	this.cazando = false;
    	
    	
    }
    
    //Getters
    
    public int getPatas() {
    	return this.patas;
    }
    
    public Boolean getPelo() {
    	return this.pelo;
    }
    public String getTipo() {
    	return this.tipo;
    }
    
    public double getPeso() {
    	return this.peso;
    }
    
    public String getColor() {
    	return this.color;
    }
    
    //Settters
    
    public void setPatas( int patas) {
    	this.patas = patas;
    }
    
    public void  setPelo(boolean pelo) {
    	this.pelo = pelo;
    }
    public void  setTipo(String tipo) {
    	this.tipo = tipo;
    }
    
    public void  setPeso(double peso) {
    	this.peso = peso;
    }
    
    public void  setColor(String color) {
    	this.color = color;
    }
    
    
    //Metodos generales
    
    public String caminar() {
        return "Estoy caminando";
    }
    public String comer() {
        return "Estoy comiendo";
    }
    public String cazar() {
        String respuesta = (cazando) ? "Estoy dejando de cazar" : "Estoy empezando cazando";
        this.cazando = (cazando) ? false : true ;
        return respuesta;
    }
    
   /* public String pelo() {
    	String respuesta =  (this.pelo) ? "Si tengo pelo" : "No tengo pelo";   //este metodo no es correcto àra modificar el toString
    	return respuesta;
    } */

    
    
    //Metodos propios
    
    public String toString() { // este metodo se utiliza para ver si un obejto tiene datos poblados
    	//filtrado pelo
    	String respuesta =  (this.pelo) ? "Si " : "No ";
        return "Soy un animal que tengo " + this.patas + " patas, soy de la familia de los " + this.tipo +
                " con un color " + this.color + " y un peso " + this.peso + ". " +  respuesta + " tengo pelo";
    }
	
}
