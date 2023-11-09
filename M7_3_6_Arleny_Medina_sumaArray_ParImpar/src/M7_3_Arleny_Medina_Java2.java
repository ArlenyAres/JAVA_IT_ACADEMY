
public class M7_3_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Donat un array de números, el programa ha de mostrar la suma de tots 
		 * els nombres parells i la suma de tots els números imparells.*/
		
		
		int[] numeros = {1,2,3,4,5,6,7,8,9,10,11,12};
		int sumaPar = 0; int sumaImpar = 0;
	 
		for(int i = 0; i < numeros.length; i++) {
			if ( numeros[i] % 2 == 0) {
				sumaPar += numeros[i] ;
			}else {
				sumaImpar += numeros[i] ;
			}
		}
		
		System.out.println( "La suma de los pares es: " + sumaPar);
		System.out.println( "La suma de los impares es: " + sumaImpar);
		
	}

}
