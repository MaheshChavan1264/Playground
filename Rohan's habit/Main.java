import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String keyString = scanner.nextLine();
		String[] arryaStrings = string.toLowerCase().split(" ");
		int count = 0;
		for (String iString : arryaStrings) {
			if (keyString.toLowerCase().equals(iString)) {
				count++;
			}
		}
		System.out.println(count);
	}
}
