
public class Circulo {
	
	// Atributos
		private Punto Centro;
		private double radio;

		// Constructor
		public Circulo(Punto Centro, double radio) {
			this.Centro = Centro;
			this.radio = radio;
		}

		// Getter
		public Punto getCentro() {
			return this.Centro;
		}

		public double getRadio() {
			return this.radio;
		}

		// Setter
		public void setCentro(Punto Centro) {
			this.Centro = Centro;
		}

		public void setRadio(double radio) {
			this.radio = radio;
		}
		
		// Métodos generales

		// distanceCenters(otroCirculo): Devuelve la distancia entre el centro del círculo actual y el recibido como parámetro.
		public double distanciaCentro(Circulo otroCirculo) {
			return Math.sqrt(
				(Math.pow((otroCirculo.getCentro().getPosicionX() - this.Centro.getPosicionX()), 2)) -
				(Math.pow((otroCirculo.getCentro().getPosicionY() - this.Centro.getPosicionY()), 2)));
		}

		// equals(otroCirculo): Devuelve true si dos círculos son iguales (si tienen el mismo centro y el mismo radio).
		public boolean sonIguales(Circulo otroCirculo) {
			boolean respuesta = false;

			if (this.Centro == otroCirculo.getCentro() && this.radio == otroCirculo.getRadio()) {
				respuesta = true;
			} else {
				respuesta = false;
			}

			return respuesta;
		}
		
		// sonConcentricos(otroCirculo): Devuelve true si dos círculos son concéntricos (tienen el mismo centro).

		public boolean sonConcentricos(Circulo otroCirculo) {
			boolean respuesta = false;

			if (this.Centro == otroCirculo.getCentro()) {
				respuesta = true;
			} else {
				respuesta = false;
			}

			return respuesta;
		}

		// tienenRadioIgual(otroCirculo): Devuelve true si dos círculos tienen el mismo radio.

		public boolean tienenRadioIgual(Circulo otroCirculo) {
			boolean respuesta = false;

			if (this.radio == otroCirculo.getRadio()) {
				respuesta = true;
			} else {
				respuesta = false;
			}

			return respuesta;
		}
		
		// sonTangentes(otroCirculo): Devuelve true si dos círculos son tangentes.

		public boolean sonTangentes(Circulo otroCirculo) {
			boolean respuesta = false;

			if (this.distanciaCentro(otroCirculo) == this.radio + otroCirculo.getRadio()) {
				respuesta = true;
			} else {
				respuesta = false;
			}

			return respuesta;
		}

		// sonSecantes(otroCirculo): Devuelve true si dos círculos son secantes.

		public boolean sonSecantes(Circulo otroCirculo) {
			boolean respuesta = false;

			if (this.distanciaCentro(otroCirculo) == this.radio + otroCirculo.getRadio()) {
				respuesta = true;
			} else {
				respuesta = false;
			}

			return respuesta;
		}
		
		// noSeTocan(otroCirculo): Devuelve true si dos círculos no se tocan.

		// Métodos propios
		public String toString() {
			return "Este circulo con radio " + this.radio + ", en la posicion ( " + this.getCentro().getPosicionX() +
					" , " + this.getCentro().getPosicionY() + " ) ";

		}
	

}
