import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		char[] num1 = Integer.toString(num).toCharArray();
		if (num1.length == 3) {
			if (Integer.parseInt(String.valueOf(num1[1])) % 3 == 0) {
				System.out.println("Trendy Number");
			}
		} else {
			System.out.println("Not a Trendy Number");
		}
	}
}