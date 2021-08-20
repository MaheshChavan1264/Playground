import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int a1 = a/100;
  
    int a2 = (a/10)%10;
     
    int a3 = (a%10)%10;

    System.out.println((a3*100)+(a2*10)+a1);
  }
}