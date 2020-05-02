import java.util.Scanner;

public class Pervison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double VerkaufUmsatz;
		double Gehlt;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Geben Sie Ihren monatlich Kaufenumsatz : ");
		VerkaufUmsatz = scanner.nextDouble();
		if (VerkaufUmsatz <= 10.000) {
			Gehlt = VerkaufUmsatz * 0.2;
			VerkaufUmsatz = VerkaufUmsatz - Gehlt;
			System.out.println("Der Verkaufe bekommt :   " + Gehlt + " € ");
			System.out.println("Die Firma bekommt    :   " + VerkaufUmsatz + " € ");

		} else {

			Gehlt = VerkaufUmsatz * 0.315;
			VerkaufUmsatz = VerkaufUmsatz - Gehlt;
			System.out.println("Der Verkaufe bekommt wenn der Umsatz übersteigt :   " + Gehlt + " € ");
			System.out.println("Die Firma bekommt    :   " + VerkaufUmsatz + " € ");

		}

	}

}
