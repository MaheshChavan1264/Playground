import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      int  n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            System.out.print(lucas(i)+" ");
		//0,0,1,1,2,4,7,13,24,44,81
        }
    }
      public static int lucas(int n)
    {
        int res[] = new int[n + 1];
        for(int i = 0; i < res.length; i++){res[i] = -1;}
        return lucas(n, res);
    }
    
    public static int lucas(int n, int res[])
    {
        if(res[n] != -1)
        {
            return res[n];
        }else{
            
             if(n == 0 || n == 1)
            {
                res[n] = 0;
                return res[n];
            }
            if(n == 2)
            {
                res[n] = 1;
                return res[n];
            }
            
            res[n] = lucas(n-1, res) + lucas(n-2, res) + lucas(n-3, res);
            return res[n];
        }
    }

    
}