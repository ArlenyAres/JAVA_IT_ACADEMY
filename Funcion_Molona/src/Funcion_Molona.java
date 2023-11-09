
public class Funcion_Molona {

	 public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        //scope

	        int nota = 8;
	        String nombre = "Jose";
	        String respuesta = saludar("Maria",nota);
	        System.out.println("El pc ha dicho: " + respuesta);
	        System.out.println(saludar(nombre,5));
	        System.out.println(saludar("Eustaquia",2));
	    }

	    public static String saludar(String nombre, int nota) {
	        //int nota = 5;
	        //System.out.println("Hola classe mi nombre és " + nombre + " y he obtenido un " + nota);
	        return "Hola classe mi nombre és " + nombre + " y he obtenido un " + nota;
	    }
}

