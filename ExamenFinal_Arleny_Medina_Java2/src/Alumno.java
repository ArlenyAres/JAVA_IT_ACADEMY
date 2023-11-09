import java.util.ArrayList;

/*ALUMNE
Un alumne té un id, un nom i una llista de notes (ArrayList<Integer>).
Alhora té dos subclasses AlumneNacional i AlumneInternacional. Val a dir 
que en tot el programa no farà falta instanciar cap objecte del tipus Alumne, 
només s’hauran de crear instancies de les classes AlumneNacional i AlumneInternacional.
Els mètodes de la classe Akumne estan descrits al diagrama UML, a més, tindràs que 
crear els constructors i getters/setters que necessitis. */
public class Alumno {
	protected int id;
	protected String nombre;
	public ArrayList<Integer> notas = new ArrayList<Integer>();
	public Alumno(int id, String nombre, ArrayList<Integer> notas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.notas = notas;
		this.notas = new ArrayList<>();
	}
	public Alumno(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.notas = new ArrayList<>();
	}
	public int getId() {
		return this.id;
	}
	public String getNombre() {
		return this.nombre;
	}
	public ArrayList<Integer> getNotas() {
		return this.notas;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setNotas(ArrayList<Integer> notas) {
		this.notas = notas;
	}
	public void AgregarNotas(int notas) {
        this.notas.add(notas);
    }


}
