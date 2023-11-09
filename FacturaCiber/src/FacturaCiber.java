import java.util.Scanner;

public class FacturaCiber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		final int IVA = 21;
        int numFactE = 0, numFactEu = 0, numFactEuR = 0, numFactI = 0;
        int opcion = 0;
        int numFact = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Que tipo de factura deseas?\n"
                + "1. Española\n"
                + "2. Europea sin ROI\n"
                + "3. Europea con ROI\n"
                + "4. Internacional\n");

        opcion = entrada.nextInt();

        switch(opcion) {
        case 1:
            numFact = ++numFactE;
            break;
        case 2:
            numFact = ++numFactEu;
            break;
        case 3:
            numFact = ++numFactEuR;
            break;
        case 4:
            numFact = ++numFactI;
            break;
        }
        System.out.println("El nuevo numero de factura és " + numFact);
    }

}