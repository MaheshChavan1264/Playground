import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int count =0;
      System.out.println(n);
       while(n!=1){
         if(n%2==0)
           n=n/2;
         else
           n=3*n+1;
         System.out.println(n);
         count++;
       }
      System.out.println(count);
    }
}