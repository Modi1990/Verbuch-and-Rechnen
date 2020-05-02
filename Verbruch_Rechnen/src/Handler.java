import java.util.Scanner;

public class Handler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int RechStuck = 0;
		double stuckPreis = 0;
		double GesamPreis = 0;
		double Zahlung = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Kauf von mindesten 10   20   50   100 ");
		System.out.println("Rabatt             10%  15%  20%  25%");

		System.out.print("Geben Sie Zahlrechner  : ");
		RechStuck = scanner.nextInt();

		System.out.print("Preis des Stuck  : ");
		stuckPreis = scanner.nextInt();
		if (RechStuck == 10) {
			GesamPreis = stuckPreis * RechStuck;

			Zahlung = GesamPreis * 0.1;

		} else if (RechStuck == 20) {
			GesamPreis = stuckPreis * RechStuck;

			Zahlung = GesamPreis * 0.15;

		} else if (RechStuck == 50) {
			GesamPreis = stuckPreis * RechStuck;

			Zahlung = GesamPreis * 0.2;

		} else if (RechStuck == 100) {
			GesamPreis = stuckPreis * RechStuck;

			Zahlung = GesamPreis * 0.25;

		}
		System.out.println(" GesamtPreis : " + GesamPreis + "  € ");
		System.out.println(" Sie sollen zahlen : " + Zahlung + "  € ");

	}

}
