import java.util.Scanner;
class Main{
	public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);	
      int n = sc.nextInt();
      int sum = 0;
        sum = sum +(n/100);
        sum= sum + ((n%10)%10);
      
      System.out.println(sum);
	}
}