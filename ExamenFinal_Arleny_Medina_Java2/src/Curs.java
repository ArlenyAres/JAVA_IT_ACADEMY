import java.util.ArrayList;

public class Curs {
	    private String nombre;
	    private ArrayList<Alumno> alumnos;

	    public Curs(String nombre) {
	        this.nombre = nombre;
	        this.alumnos = new ArrayList<>();
	    }
	    
		public String getNombre() {
			return this.nombre;
		}
		public ArrayList<Alumno> getAlumnos() {
			return this.alumnos;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public void setAlumnos(ArrayList<Alumno> alumnos) {
			this.alumnos = alumnos;
		}
		
		//Agregar alumno

		public void agregaAlumno(Alumno alumno) {
	        alumnos.add(alumno);
	    }
		
		// Eliminar alumno

		public void eliminarAlumno(int id) {
		    
		}
		    
		    
		// mostrar nombre alumnos

	    public void mostrarAlumnos() {
	        for (Alumno alumno : alumnos) {
	            System.out.println(alumno.getNombre());
	        }
	    }
	    
	    
	    
	}


