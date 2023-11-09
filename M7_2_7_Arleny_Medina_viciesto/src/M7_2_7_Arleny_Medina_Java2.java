import java.util.Scanner;

public class M7_2_7_Arleny_Medina_Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
				
				Scanner sc = new Scanner(System.in);
				int year = 0;
				
				System.out.println("ingresa el año");
				year = sc.nextInt();
				
				System.out.println(biciesto(year));
				
		
	
		
		
	}
	
	
		public static String biciesto(int year) {
			
			if(year % 400 == 0) {
				return year + " Es biciesto";
			}else if(year % 4 == 0 && year % 100 != 0) {
				return year + " Es biciesto";
			}else{
				return year + " No es biciesto";
			}
	
		}

}
