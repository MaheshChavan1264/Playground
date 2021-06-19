import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner sc  = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(calculateApples(n));
  }
  public static int calculateApples (int n) {
    double totalApples = 0;
    int unit =0;
	while(n>totalApples){
		unit++;
		totalApples +=12*Math.pow(unit,2);
    }
	return unit*8;
}
}