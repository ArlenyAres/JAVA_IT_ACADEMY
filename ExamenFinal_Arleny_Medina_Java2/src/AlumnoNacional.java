


/*ALUMNE NACIONAL
Un alumne nacional té tots els elements d’un alumne i a més té un dni.
El mètode calcularNotaFinal() d’aquesta classe 
Els mètodes de la classe AlumneNacional estan descrits al diagrama UML, a més, 
tindràs que crear els constructors i getters/setters que necessitis.
  */
		public class AlumnoNacional extends Alumno {
			 private String dni;

			 public AlumnoNacional(int id, String nombre, String dni) {
					super(id, nombre);
					this.dni = dni;
			 }
			public String getDni() {
				return this.dni;
			}

			public void setDni(String dni) {
				this.dni = dni;
			}
			public void AgregarNotas(int nota) {
				this.notas.add(nota);
			}
	
	
	/*ha de calcular la nota de l’alumne
 de la següent manera: totes les notes que són >=5 s’han de dividir entre 2, 
 la resta de notes es queden iguals. Amb totes aquestes notes tractades, s’ha de fer la mitja.*/

	public double calcularNotaFinal() {
        int totalNotas = 0;
        int numNotas = 0;

        for (int nota : getNotas()) {
            if (nota >= 5) {
                totalNotas += nota / 2;
            } else {
                totalNotas += nota;
            }
            numNotas++;
        }

        return numNotas > 0 ? totalNotas / (double) numNotas : 0;
    }

/*Addicionalment, hauràs de desenvolupar un mètode presentar-se que permeti a l'alumne 
d'escriure's emprant atributs de la seva classe pare com id i nom, però també atributs
 de la mateixa classe com dni. El retorn hauria de ser així:
 Em dic (nom), soc l'alumne numero (id) i nombre de dni (dni) amb una mitjana de (calcularNotaFinal()).*/

    public String toString() {
		return "Soy un Alumno Nacional con dni. " + this.dni + " con numero de id: " + this.id + ", mi nombre es: " + this.nombre +
				", y mimedia de notas es: " + calcularNotaFinal();
	}
	

}
