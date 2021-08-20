import java.util.Scanner;
class Main
{
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int blastRifles = in.nextInt();
        int visualSensors = in.nextInt();
        int audioSensors = in.nextInt();
        int arms = in.nextInt();
        int legs = in.nextInt();
        float budget = 0;
        budget = (float) ((blastRifles * 350.34) + (visualSensors * 230.90) + (audioSensors * 190.55) + (arms * 125.30) + (legs * 180.90));
        if(budget > 15000){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}