import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
      int m =sc.nextInt();
      if(m>=85){
        System.out.println("A");
      }else if(m<85 && m>=75){
        System.out.println("B");
      }else if(m<75 && m>=65){
        System.out.println("C");
      }else if(m<65 && m>=55){
        System.out.println("D");
      }else if(m<55 && m>=45){
        System.out.println("E");
      }else{
        System.out.println("Fail");
      }
    }
}