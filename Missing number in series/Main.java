import java.util.*;
class Main
{
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        System.out.println(findMissing(a,n));
    }
    static int findMissingUtil(int arr[], int low,
                               int high, int diff)
    {
        if (high <= low)
            return Integer.MAX_VALUE;

        int mid = low + (high - low) / 2;
        if (arr[mid + 1] - arr[mid] != diff)
            return (arr[mid] + diff);
        if (mid > 0 && arr[mid] -
                arr[mid - 1] != diff)
            return (arr[mid - 1] + diff);
        if (arr[mid] == arr[0] + mid * diff)
            return findMissingUtil(arr, mid + 1,
                    high, diff);
        return findMissingUtil(arr, low, mid - 1, diff);
    }

    static int findMissing(int arr[], int n)
    {
        int diff = (arr[n - 1] - arr[0]) / n;
        return findMissingUtil(arr, 0, n - 1, diff);
    }
}