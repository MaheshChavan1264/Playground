import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill the code;
      Scanner sc = new Scanner(System.in);
      int target,score,attempt=0,sum=0;
      target = sc.nextInt();
      while(sum<target){
        score = sc.nextInt();
        sum+=score;
        attempt++;
    }
      System.out.println("The number of turns is "+attempt);
}
}