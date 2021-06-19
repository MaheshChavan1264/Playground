import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        for(int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        displayKey(numbers);
    }
    static void displayKey(int[] n1){
        int[] ones = new int[3];
        int[] tens = new int[3];
        int[] hundreds = new int[3];
        int[] thousands = new int[3];
        for(int i=0;i<3;i++) {
            int one = n1[i] % 10;
            int ten = (n1[i] / 10) % 10;
            int hundred = (n1[i] / 100) % 10;
            int thousand = n1[i] / 1000;
            ones[i] = one;
            tens[i] = ten;
            hundreds[i] = hundred;
            thousands[i] = thousand;
        }
        Arrays.sort(ones);
        Arrays.sort(tens);
        Arrays.sort(hundreds);
        Arrays.sort(thousands);
        System.out.println(String.valueOf(thousands[0])+String.valueOf(hundreds[3-1])+String.valueOf(tens[0])+String.valueOf(ones[3-1]));
    }
}
