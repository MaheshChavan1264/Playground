import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		InputStream in;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		char[] num1 = String.valueOf(num).toCharArray();
		int evenSum = 0;
		int oddSum = 0;
		for (int i = 0; i < num1.length; i++) {
			int a = Character.getNumericValue(num1[i]);
			if (a % 2 == 0) {
				evenSum += a;
			} else {
				oddSum += a;
			}
		}
		if (evenSum == oddSum) {
			System.out.println("yes");
		} else {
			System.out.println("No");
		}
	}
}
