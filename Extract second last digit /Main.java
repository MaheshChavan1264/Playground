import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		 Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = 0;
      int i=0;
      while(i<2){
        b = a%10;
        a/=10;
        i++;
      }
      System.out.println(b);
     
	}
}