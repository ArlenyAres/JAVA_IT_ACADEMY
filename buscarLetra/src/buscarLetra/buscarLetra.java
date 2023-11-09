package buscarLetra;

public class buscarLetra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int posicion = -1;
        char letra = 'c';
        //boolean encontrado = false;
        char[] letras = {'e','t','c','s','p'};
        posicion = buscarLetra(letras, letra);
        System.out.println("La posición de la letra c és " + posicion + " y corresponde al valor " +
        letras[posicion]);
    }

    public static int buscarLetra(char[] letras, char letra) {
        int posicion = -1;
        //Buscar la letra c en el array i devolver la posición donde se encuentra o en su lugar un -1

                //for(char letra : letras) { //No es aconsejable en esta situación emplear el foreach al tener que usar las posiciones y necesitar escapar antes
                //for(int i = 0; i < letras.length && encontrado == false; i++) {
                for(int i = 0; i < letras.length; i++) {
                    /*if(letras[i] == letra) {
                        posicion = i;
                    }*/
                    //posicion = (letras[i] == letra) ? i : posicion;
                    if(letras[i] == letra) {
                        posicion = i;
                        i = letras.length;
                        //encontrado = true;
                    }
                    //System.out.println(posicion);
                    //break; No se escapa nunca con palabras reservadas
                }

                return posicion;
    }
		
		

	}


