import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        // fill your code;
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        int square = n * n; 
        int count = 0; 
        while (square != 0) 
        { 
            count++; 
            square /= 10; 
        }        
        square = n*n; // Recompute square as it was changed 
      boolean flag = false;
        for (int i=1; i<count; i++) 
        { 
             int eq = (int) Math.pow(10, i); 
             if (eq == n) 
                continue; 
             int sum = square/eq + square % eq; 
             if (sum == n) 
               flag=true;
          	
    }
      if(flag){
        System.out.println("Kaprekar Number");
      }else{
                      System.out.println("Not a Kaprekar Number");
      }
}
}