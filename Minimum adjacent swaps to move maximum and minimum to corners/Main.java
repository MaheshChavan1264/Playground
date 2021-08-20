import java.util.*;
class Main
{
 public static void minimumSwaps(int a[], int n)
    {
        int maxx = -1, minn = a[0], l = 0, r = 0;
        for (int i = 0; i < n; i++) {
 
            // Index of leftmost largest element
            if (a[i] > maxx) {
                maxx = a[i];
                l = i;
            }
 
            // Index of rightmost smallest element
            if (a[i] <= minn) {
                minn = a[i];
                r = i;
            }
        }
        if (r < l)
            System.out.println(l + (n - r - 2));
        else
            System.out.println(l + (n - r - 1));
    }
 
    // Driver Code
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
      for(int i=0;i<n;i++){
        a[i] = sc.nextInt();
      }
        minimumSwaps(a, n);
    }
}