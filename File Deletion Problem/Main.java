import java.io.File;
import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
Scanner scanner = new Scanner(System.in);
		String file = scanner.nextLine();
		File file1 = new File(file);
		if (file1.delete()) {
			System.out.println("File deleted");
		} else {
			System.out.println("File was not deleted");
		}
  }
}