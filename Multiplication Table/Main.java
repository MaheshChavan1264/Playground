import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      for(int i =1;i<=b;i++){
        System.out.println(i+"*"+a+"="+(i*a));
      }
    }
}