import java.util.Scanner;

public class M3_ExExtra3_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		
		int litros, manos, alto, ancho, area, total = 0;
		final int COBER_LITRO = 12;
		
		System.out.println("Introduce el ALTO");
		alto = sc.nextInt();
		
		System.out.println("Introduce el ANCHO");
		ancho = sc.nextInt();
		
		System.out.println("Introduce el manos");
		manos = sc.nextInt();
		
		area = alto * ancho;
		
		total = area * manos;
		
		litros = total / COBER_LITRO;
		
		System.out.println("Necesitaremos " + litros + " Litros");
		
		sc.close();

	}

}
