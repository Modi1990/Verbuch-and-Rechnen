import java.util.Scanner;

public class Gesamtenwiederstand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double R1;
		double R2;
		double Ergebniss_wierderstand;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Geben Sie bitte wert für R1 =  ");
		R1 = scanner.nextDouble();
		System.out.print("Geben Sie bitte wert für R2 =  ");
		R2 = scanner.nextDouble();
		
		Ergebniss_wierderstand = (R1 * R2) / (R1 + R2);
		
		System.out.println("Das Ergebnis für Gesamtenwiederstand = " + Ergebniss_wierderstand);
		System.out.println("************Programmende************");
		
		

	}

}
