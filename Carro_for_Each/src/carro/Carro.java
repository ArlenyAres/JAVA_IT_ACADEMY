package carro;

import java.util.ArrayList;


public class Carro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
	        String[] carro = {"Patatas", "Cebolla", "Queso", "Tomate", "Olivas"};

	        carro[2] = "Pipas";

	        System.out.println(carro[2]);

	        //Libreria ArrayList
	        
	        ArrayList<Integer> notas = new ArrayList<Integer>();
	        notas.add(8);
	        notas.add(3);
	        notas.add(5);
	        notas.add(7);
	        notas.add(4);

	        System.out.println(notas);

	        System.out.println(notas.get(2));

	        notas.set(2, 9);

	        System.out.println(notas);
	    

				//forEach
				
			     int suma = 0;
			     
			     for ( int nota : notas) {
			    	 System.out.println(nota);
			    	 suma += nota;
			     }
			     
			     System.out.println("Total: " + suma);
			     System.out.println("Promedio: " + suma/ notas.size());
	     
	     
	     
	}
	
		
}
	
						

						/*A//Agrupación de datos del mismo tipo en un unico contenedor
 * 
 * 
				        String[] carro = {"Patatas", "Cebolla", "Queso", "Tomate", "Olivas"};
				
				        carro[2] = "Pipas";
				
				        System.out.println(carro[2]);
				
				        //Libreria ArrayList
				        ArrayList<Integer> notas = new ArrayList<Integer>();
				        notas.add(8);
				        notas.add(3);
				        notas.add(5);
				        notas.add(7);
				        notas.add(4);
				
				        System.out.println(notas);
				
				        System.out.println(notas.get(2));
				
				        notas.set(2, 9);
				
				        System.out.println(notas);
				
				        int suma = 0;
				        //foreach
				        for(int nota : notas) {
				            System.out.println(nota);
				            suma += nota;
				        }
				
				        System.out.println("Total: " + suma);
				        System.out.println("Promedio: " + suma / notas.size());
    }

}
*/
