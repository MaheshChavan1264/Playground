import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfItems = sc.nextInt();
        double time = sc.nextDouble();
        double totatTime = 0;
        if(noOfItems>3){
            System.out.println("Number of items is more");
        }else{
            if(noOfItems==2){
                totatTime = (time*0.5)+time;
            }else if(noOfItems==3){
                totatTime = (time*2);
            }
            System.out.printf("%.2f",totatTime);
        }

    }
}