import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      int m = sc.nextInt();
      if(m==100){
        System.out.println('S');
      }else if(m<=99 && m>=90){
        System.out.println('A');
      }else if(m<=89 && m>=80){
        System.out.println('B');
      }else if(m<=79 && m>=70){
        System.out.println('C');
      }else if(m<=69 && m>=60){
        System.out.println('D');
      }else if(m<=59 && m>=50){
        System.out.println('E');
      }else if(m<50){
        System.out.println('F');
      }
    }
}