import java.util.ArrayList;

public class Zoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//patas
        //tipo
        //peso
        //pelo
        //color

        //caminar()
        //cazar()
        //comer()

       /* Animal perro = new Animal(4, true, "mamifero", 25, "marron");
        Animal aguila = new Animal(2, false, "Accipitridae",12, "multiColor");
        Animal elefante = new Animal(4, false, "mamifero",400, "gris");
        Animal tortuga = new Animal (4, false, "Artropodo", 80, "multicolor");
        Animal walabi = new Animal (4, true, "mamifero", 80, "maron");*/
		
		ArrayList<Animal> animales = new ArrayList <Animal>();
		
		animales.add( new Animal(4, true, "mamifero", 25, "marron"));
		animales.add( new Animal(2, false, "Accipitridae",12, "multiColor"));
		animales.add( new Animal(4, false, "mamifero",400, "gris"));
		animales.add( new Animal(4, false, "Artropodo", 80, "multicolor"));
		animales.add( new Animal(4, true, "mamifero", 80, "maron"));
		
		
        
        perro.setColor("blanco"); 
        perro.setPelo(true);
        
        walabi.setPeso(walabi.getPeso() + 3);
        
        
        System.out.println(perro.toString());
        System.out.println(perro.caminar());
        System.out.println(perro.cazar());
        
        
        System.out.println(walabi.toString());
        System.out.println(aguila.toString());
        System.out.println(elefante.toString());
        System.out.println(tortuga.toString());
    }
}
