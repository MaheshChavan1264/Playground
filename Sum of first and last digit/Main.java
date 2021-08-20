import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int a2 = a%10;
      int a1= 0;
      while(a!=0){
        a1= a%10;
        a/=10;
      }
      System.out.println(a1+a2);
	}
}