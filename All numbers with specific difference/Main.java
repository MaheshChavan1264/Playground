import java.util.Scanner;
class Main
{
  static int sumOfDigit(int K)
    {
        int sod = 0;
        while (K != 0)
        {
            sod += K % 10;
            K /= 10;
        }
        return sod;
    }
    static int totalNumbersWithSpecificDifference(int N, int diff)
    {
        int low = 1, high = N;
        while (low <= high)
        {
            int mid = (low + high) / 2;
            if (mid - sumOfDigit(mid) < diff)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return (N - high);
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int diff = scanner.nextInt();

        System.out.println(totalNumbersWithSpecificDifference(N, diff));
    }
}