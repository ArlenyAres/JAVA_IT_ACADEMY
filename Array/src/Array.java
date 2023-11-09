
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		   
		        int[] notas = {2,3,4,5,6}; //Define la longitud del array estatico, el tipo por inferencia y le establece los datos

		        int[] notas1 = new int[5]; //Define la longitud del array estatico, el tipo declarado y no le establece los datos.
		        notas1[0] = 9;
		        notas[0] = 9;

		        System.out.println(notas); //No se puede leer directamente, ya que nos ofrece el vector de memoria

		        for(int nota : notas) {
		            System.out.println(nota);
		        }

		        int[] nuevoConjunto = conjunto(notas);

		        for(int nota : nuevoConjunto) {
		            System.out.println(nota);
		        }
		    }

		    public static int[] conjunto(int[] notas) { //Creamos un nuevo contenedor para recibir el array de ints
		        int[] notasInternas = {2,3,4,5,6};
		        return notasInternas; //Asi devuelvo un array. Solo debo indicar el tipo en lugar de void
		    }

		

	}


