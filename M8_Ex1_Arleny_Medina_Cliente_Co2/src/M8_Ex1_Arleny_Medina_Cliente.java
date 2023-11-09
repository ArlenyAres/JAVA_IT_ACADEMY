
public class M8_Ex1_Arleny_Medina_Cliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cliente rodrigo = new Cliente("25478453K", "Argentina");
		Cliente ares = new Cliente ("25353674L", 38, "venezuela", 28 );
		
		rodrigo.setVuelos(19);
		rodrigo.getDni();
		ares.getEdad();
		ares.getVuelos();
		ares.setVuelos(ares.getVuelos() + 5 );
		
		
		System.out.println(ares.getVuelos());
		System.out.println(rodrigo.toString());
		System.out.println(ares.toString());
		
		//Enlace
	//	>>>>>> https://we.tl/t-pDbyb6TGhr <<<<<<
		
	
	}

}
