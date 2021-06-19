import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int month = input.nextInt();
        float rent = input.nextFloat();
        int days = input.nextInt();
        float totalRent=0;
        float s;
        if(month>=1 && month<=12){

            switch (month) {
                case 4:
                case 12:
                case 5:
                case 6:
                case 11:
                    s = (float) (rent*0.20);
                    totalRent = (s+rent)*days;
                    break;
                default:
                    totalRent = rent*days;
            }
          System.out.printf("%.2f",totalRent);
        }else{
            System.out.println("Invalid Input");
        }
    }
}