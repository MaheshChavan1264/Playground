import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill the code;
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int negC=0,posC=0;
      for(int i=0;i<a;i++){
      	int b =sc.nextInt();
        if(b>0){
          posC++;
        }else{
          negC++;
        }
      }
      System.out.println("Number of positive numbers is "+posC+" and the number of negative numbers is "+negC);
    }
}