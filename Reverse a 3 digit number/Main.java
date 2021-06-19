import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = n1/100;
    int n3 = n1/10%10;
    int n4 = n1%10;
    System.out.println((n2*1)+(n3*10)+(n4*100));
  }
}