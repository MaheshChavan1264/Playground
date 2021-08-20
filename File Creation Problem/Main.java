import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Main
{
  public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		String path = scanner.nextLine();

		File file = new File(path);
		if (file.exists()) {
			System.out.println("File already exists");
		} else {
			file.createNewFile();
			System.out.println("File created");
		}
	}
}