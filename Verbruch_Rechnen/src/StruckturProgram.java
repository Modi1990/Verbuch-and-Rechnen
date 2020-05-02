import java.util.Scanner;

public class StruckturProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double y1;
		double y2;
		double x1;
		double x2;
		double Ergebnis;
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Geben Sie Wert für Y1 = ");
		y1 = scanner.nextDouble();
		
		System.out.print("Geben Sie Wert für Y2 = ");
		y2 = scanner.nextDouble();
		
		System.out.print("Geben Sie Wert für X1 = ");
		x1 = scanner.nextDouble();
		
		System.out.print("Geben Sie Wert für X2 = ");
		x2 = scanner.nextDouble();
		
		Ergebnis = (y2 - y1) / (x2 -x1);
		
		System.out.println("Das Ergebnis ist = " + Ergebnis);
		System.out.println("*******Programmende*******");
		

	}

}
