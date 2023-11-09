import java.util.Scanner;

public class M4_ExExtra3_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int numPc = (int)(Math.random() * 3) + 1;
		int numUser = 0;
		String pcStr = "";
		String usStr = "";
		String resp = "";
		
		
		System.out.println("1. Pedra\n"
				+ "\n"
				+ "2. Paper\n"
				+ "\n"
				+ "3. Tisora\n"
				+ "\n"
				+ "Tria (1-3):");
		
		numUser = sc.nextInt();
		
		
			if(numUser >= 1 && numUser < 4) {
				switch (numPc){
					case 1:
						pcStr = "Pedra";
						break;
					case 2:
						pcStr = "Paper";
						break;
					case 3:
						pcStr = "Tisoras";
						break;
				}
				 switch (numUser){
					case 1:
						usStr = "Pedra";
						break;
					case 2:
						usStr = "Paper";
						break;
					case 3:
						usStr = "Tisoras";
						break;
				}
		
			
			
			 if((numPc == 1 && numUser == 3) || (numPc == 2 && numUser == 1) || (numPc == 3 && numUser == 2)) {
	                resp = "Jo " + pcStr + " i tu " + usStr + ". He guanyat.";
	            } else if(numPc == numUser){
	                resp = "Heu empatat.";
	            } else {
	                resp = "Jo " + pcStr + " i tu " + usStr + ". Has guanyat.";
	            } 
			 
			}else {
	            resp = "Entenc que no vols jugar. Adeu";
	        
			}
			
	        System.out.println(resp);        
        }

	}

