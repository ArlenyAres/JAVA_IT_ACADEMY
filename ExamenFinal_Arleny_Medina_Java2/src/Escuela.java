
public class Escuela {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*Un cop creada l’estructura de classes, fes una classe que les utilitzi de la següent manera:
			1) Crea un curs anomenat “Fonaments de la programació”*/

		       
				Curs curs = new Curs("Fonamentos de la programacion");
		        
           /*
			2) Crea un alumne nacional que es digui “Marc” amb Id 1 i DNI “12345678A”
			3) Crea un alumne nacional que es digui “Laia” amb Id 2 i DNI “98765432B”
			4) Crea un alumne Erasmus que es digui “Peter” amb Id 3 i PASSAPORT “ABC123456”
			5) Crea un alumne Erasmus que es digui “Kate” amb Id 4 i PASSAPORT “DEF654321” */
		  
		        
		        AlumnoNacional marc = new AlumnoNacional(1, "Marc", "12345678A");	        
		        AlumnoNacional laia = new AlumnoNacional(2, "Laia", "98765432B");
		        
		        AlumnoErasmus peter = new AlumnoErasmus(3, "Peter", "ABC123456");
		        AlumnoErasmus kate = new AlumnoErasmus(4, "Kate", "DEF654321");
		        
		        
		        System.out.print(marc);

		    // 6) Insereix els 4 alumnes al curs “Fonaments de la programació ”
		        
		        curs.agregaAlumno(marc);
		        curs.agregaAlumno(laia);
		        curs.agregaAlumno(peter);
		        curs.agregaAlumno(kate);
		        
		    // 7) Mostra els noms de tots els alumnes del curs    
		        
		        curs.mostrarAlumnos();
		        
		    //8) Insereix les notes 1, 3, 5, 7 i 9 a l’alumne Marc
		      
		        marc.AgregarNotas(1);
		        marc.AgregarNotas(3);
		        marc.AgregarNotas(5);
		        marc.AgregarNotas(7);
		        marc.AgregarNotas(9);
		        
		        System.out.println(marc.notas);
		        
		     //  9) Insereix les notes 2, 4, 6, 8, 10 a l’alumne Laia
		        
		        laia.AgregarNotas(2);
		        laia.AgregarNotas(4);
		        laia.AgregarNotas(6);
		        laia.AgregarNotas(8);
		        laia.AgregarNotas(10);
		        
		     //10) Insereix les notes 1,2,5,6,9,10 a l’alumne Peter
		        
		        peter.AgregarNotas(1);
		        peter.AgregarNotas(2);
		        peter.AgregarNotas(5);
		        peter.AgregarNotas(9);
		        peter.AgregarNotas(10);
		        
		     //   11) Insereix les notes 3,4,7,8 a l’alumne Kate
		        
		        kate.AgregarNotas(3);
		        kate.AgregarNotas(4);
		        kate.AgregarNotas(7);
		        kate.AgregarNotas(8);
		        
		     //   12) Calcula e imprimeix les notes finals de cada alumne juntament amb el seu nom i el seu
		     //   DNI o PASSAPORT amb la invocació mètode calcularNotaFinal(). Exemple: Em dic Marc,
		     //   soc l'alumne numero 1 i nombre de dni 123456789A amb una mitjana de 7.4.
		        
		        System.out.println(marc);
		        System.out.println(laia);
		        System.out.println(peter);
		        System.out.println(kate);

	}

}