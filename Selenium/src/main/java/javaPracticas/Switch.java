package javaPracticas;

public class Switch {

	public static void main(String[] args) {
		int i = 10;

		switch (i) {
		case 0:
			System.out.println("i es cero");
			break;
		case 1:
			System.out.println("i es uno");
			break;
		case 2:
			System.out.println("i es dos");
			break;
		default:
			System.out.println("i es mayor que 2");
		}
	}

	public static void main2(String[] args) {
		String str = "two";

		switch (str) {
		case "one":
			System.out.println("one");
			break;
		case "two":
			System.out.println("two");
			break;
		case "three":
			System.out.println("three");
			break;
		default:
			System.out.println("no match");
		}

	}

}
