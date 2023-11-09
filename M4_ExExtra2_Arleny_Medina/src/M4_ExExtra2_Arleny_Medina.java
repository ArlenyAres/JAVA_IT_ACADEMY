import java.util.Scanner;

public class M4_ExExtra2_Arleny_Medina {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int unidades = 0;
        int decenas =  0;
        String unidadesStr = "";
        String decenasStr = "";
        
        
        
        System.out.println("Ingresa las unidades");
        unidades = sc.nextInt();
        
        System.out.println("Ingresa las decenas");
        decenas = sc.nextInt();
        
        
        switch (unidades) {
           case 0:
        	   unidadesStr = "Cero";
        	   break;
           case 1:
        	   unidadesStr = "Uno";
        	   break;
           case 2:
        	   unidadesStr = "Dos";
        	   break;
           case 3:
        	   unidadesStr = "Tres";
        	   break;
           case 4:
        	   unidadesStr = "Cuatro";
        	   break;
           case 5:
        	   unidadesStr = "Cinco";
        	   break;
           case 6:
        	   unidadesStr = "Seis";
        	   break;
           case 7:
        	   unidadesStr = "Siete";
        	   break;
           case 8:
        	   unidadesStr = "Ocho";
        	   break;
           case 9:
        	   unidadesStr = "Nueve";
        	   break;
         }
        
        
        switch (decenas) {
        
	        case 1:
	        	decenasStr = "";
	        	switch(unidades) {
	        	case 1:
	         	   unidadesStr = "Once";
	         	   break;
	            case 2:
	         	   unidadesStr = "Doce";
	         	   break;
	            case 3:
	         	   unidadesStr = "Trece";
	         	   break;
	            case 4:
	         	   unidadesStr = "Catorce";
	         	   break;
	            case 5:
	            	unidadesStr = "Quince";
	            	break;
	            case 6:
	         	   unidadesStr = " dieciseis";
	            case 7:
	         	   unidadesStr = "diecisiete";
	         	   break;
	            case 8:
	         	   unidadesStr = "dieciocho";
	         	   break;
	            case 9:
	         	   unidadesStr = "diecimueve";
	         	   break;
	        	
	        	}
	     	   break;
	        case 2:
	        	decenasStr  = "Veinte";
	     	   break;
	        case 3:
	        	decenasStr  = "Treinta";
	     	   break;
	        case 4:
	        	decenasStr  = "Cuarenta";
	     	   break;
	        case 5:
	        	decenasStr  = "Cincuenta";
	     	   break;
	        case 6:
	        	decenasStr  = "Sesenta";
	     	   break;
	        case 7:
	        	decenasStr  = "Setenta";
	     	   break;
	        case 8:
	        	decenasStr  = "Ochenta";
	     	   break;
	        case 9:
	     	   unidadesStr = "Noventa";
	     	   break;
      }
        
        	if (decenas >= 2) {
        		System.out.println( decenasStr + " y " + unidadesStr);
        	}else if (decenasStr == "" ){
        		System.out.println(unidadesStr);
        	}else {
        		 System.out.println( decenasStr + " " + unidadesStr);
        	}
     
       
        
	}

}
