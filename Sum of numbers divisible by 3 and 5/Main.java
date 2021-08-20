import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        System.out.println(SumNumbersDivisible(m,n));
    }
    static int SumNumbersDivisible(int m, int n) {
        int sum = 0;
        for(int i=m;i<n;i++){
            if(i%3==0&&i%5==0){
                sum += i;
            }
        }
        return sum;
    }
}
