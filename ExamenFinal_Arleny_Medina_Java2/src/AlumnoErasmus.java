
/* ALUMNE ERASMUS
Un alumne internacional té tots els elements d’un alumne i a més té un passaport.*/
	public class AlumnoErasmus extends Alumno {
		private String pasaporte;
		public AlumnoErasmus(int id, String nombre, String pasaporte) {
			super(id, nombre);

		}
		public String getPasaporte() {
			return this.pasaporte;
		}
		public void setPasaporte(String pasaporte) {
			this.pasaporte = pasaporte;
		}


		/*El mètode calcularNotaFinal() d’aquesta classe ha de calcular la nota de l’alumne de la següent manera:
		 * totes les notes que són pars,
		 * es multipliquen per 2 i les senars es divideixen entre 2. Amb totes aquestes notes tractades, s’ha de fer la mitja.
		 */
		public double calcularNotaFinal() {
			int totalNotas = 0;
			int numNotas = 0;

			for (int nota : getNotas()) {
				if (nota % 2 == 0) {
					totalNotas += nota * 2;
				} else {
					totalNotas += nota / 2;
				}
				numNotas++;
			}
			return numNotas > 0 ? totalNotas / (double) numNotas : 0;
		}

		/* Addicionalment, hauràs de desenvolupar un mètode presentar-se que permeti a l'alumne d'escriure's
		 * emprant atributs de la seva classe pare com id i nom, però també atributs de la mateixa classe com passaport.
		 * El retorn hauria de ser així: Em dic (nom) i soc l'alumne d’intercanvi amb numero (id) amb passaport
		 * (passaport) i una mitjana de (calcularNotaFinal()).
		 */
		public String toString() {
			return "Soy un Alumno Eramus con pasaporte: " + this.pasaporte + " con numero de id: " + this.id + ", mi nombre es: " + this.nombre +
					", y mimedia de notas es: " + calcularNotaFinal();
		}

}
