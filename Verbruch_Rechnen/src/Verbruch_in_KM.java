import java.util.Scanner;

public class Verbruch_in_KM {

	public static void main(String[] args) {
		
		
		double Verbruch;
		double Distance;
		double Ergebnisse_km;
		double VerbrauchAuf100KM;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("geben Sie der Verbruch = ");
		Verbruch = scanner.nextDouble();
		System.out.print("geben Sie die Distance = ");
		Distance = scanner.nextDouble();
		VerbrauchAuf100KM = Verbruch * 100 / Distance;
		System.out.println("Das Ergebnisse auf 100 KM  = " + VerbrauchAuf100KM + " l");
		System.out.print("andere Lösung  = (Verbrauch / 100) * Distance ");
		Ergebnisse_km = ( Verbruch / 100 ) * Distance ;
		System.out.println("Andere Lösung = " + Ergebnisse_km + "KM");
		
		
		

	}

}
