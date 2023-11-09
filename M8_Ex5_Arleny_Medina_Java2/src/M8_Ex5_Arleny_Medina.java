import java.util.Scanner;

public class M8_Ex5_Arleny_Medina {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int y = 0;
		double radio = 0;

		int x2 = 0;
		int y2 = 0;
		double radio2 = 0;

		// public Point(int posicionX, int posicionY)
		// public Circle(Point Centro, double radio)
		System.out.println("Dime los datos de tu primer circulo \n" + "Posicion x:");
		x = sc.nextInt();

		System.out.println("Posicion y:");
		y = sc.nextInt();

		System.out.println("Radio:");
		radio = sc.nextInt();

		Punto punto1 = new Punto(x, y);

		Circulo primero = new Circulo(punto1, radio);
		
		System.out.print("Dime los datos de tu segundo circulo \n" + "Posicion x:");
		x2 = sc.nextInt();

		System.out.println("Posicion y:");
		y2 = sc.nextInt();

		System.out.println("Radio:");
		radio2 = sc.nextInt();

		Punto punto2 = new Punto(x2, y2);

		Circulo segundo = new Circulo(punto2, radio2);

		System.out.println("Aqui estan tus comparaciones de circulos");
		
		System.out.println(primero.toString() + "\n" + "\n La distancia entre los circulos: "
				+ primero.distanciaCentro(segundo) + "\n Son concentricos: " + primero.sonConcentricos(segundo)
				+ "\n Son iguales: " + primero.sonIguales(segundo));
	}


}
