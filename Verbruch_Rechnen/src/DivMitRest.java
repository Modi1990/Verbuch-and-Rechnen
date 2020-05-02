import java.util.Scanner;

public class DivMitRest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x;
		int y;
		int Div = 0;
		int rest = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Division Mit Rest ");
		System.out.println("==================");
		System.out.print("Erste Zahl  ? ");
		x = scanner.nextInt();
		System.out.print("Zweite Zahl ? ");
		y = scanner.nextInt();
		rest = x % y;
		Div = x / y;

		System.out.print(x + " = " + y + " * " + Div + " + " + rest);

	}

}
