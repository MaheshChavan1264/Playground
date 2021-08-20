// import the respective packages
import java.io.*;
import java.util.*;
public class Main{
  public static void main (String[] args){
    //Try out your code here
    Scanner sc = new Scanner(System.in);
    String file1 = sc.nextLine();
    String file2 = sc.nextLine();
    File oldName = new File(file1);
		File newName = new File(file2);

		if (oldName.renameTo(newName)) {
			System.out.println("Renamed successfully");
		} else {
			System.out.println("error");
		}
  }
}