import java.util.Scanner;

public class Schaden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double schadenSumme;
		double schadenrest = 0;
		double selbZahl;
		double x;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Geben die Schadenshöhe =  ");
		schadenSumme = scanner.nextDouble();

		if (schadenSumme >= 100) {
			System.out.println("Sie müssen 20% von " + schadenSumme + "€ zahlen ");
			selbZahl = (schadenSumme) * 0.2;
			schadenrest = schadenSumme - selbZahl;
			if (selbZahl < 100) {
				System.out.println("Sie mussen zumindest 100 €");
				x = 100 - selbZahl;
				selbZahl = selbZahl + x;
				schadenrest = schadenrest - x;
				System.out.println("Sie mussen " + selbZahl + " € zahlen");
				System.out.println("Die Versicherung zahlt " + schadenrest + " €");

			} else {
				System.out.println("Sie mussen " + selbZahl + " € zahlen");
				System.out.println("Die Versicherung zahlt" + schadenrest + " €");

			}

		}

	}

}
