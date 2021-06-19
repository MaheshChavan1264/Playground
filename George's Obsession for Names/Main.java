// import the respective packages
import java.util.*;
public class Main{
 	public static void main(String[] args) {
		// Try out your code here
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		for (int i = 0; i < name.length(); i++) {
			char c = name.toUpperCase().charAt(i);
			System.out.println(c);
		}
	}
}