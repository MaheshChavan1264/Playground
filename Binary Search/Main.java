import java.util.Scanner;
class Main
{
  public static int binarySearch(int[] arr, int start, int end, int target) {
		if(start > end) return 0;
		int midIndex = (start + end) / 2;
		if(arr[midIndex] == target) return midIndex;
		if(arr[midIndex] > target) return binarySearch(arr, start, midIndex - 1, target);
		else return binarySearch(arr, midIndex + 1, end, target);
	}
	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
		int[] arr =new int[n];
      for(int i =0;i<n;i++){
        arr[i]=sc.nextInt();
      }
		int start = 0;
		int end = arr.length-1;
		int target = sc.nextInt();
		int r = binarySearch(arr, start, end, target);
      if(r>0)
        System.out.println(r);
      else
                System.out.println("Not found" );
	}
}