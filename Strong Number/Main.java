import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int sum = 0;
      int i,fact,rem;
int temp = n;
while(n != 0)
{
i = 1;
fact = 1;
rem = n % 10;

while(i <= rem)
{
fact = fact * i;
i++;
}
sum = sum + fact;
n = n / 10;
}

if(sum == temp)
System.out.println("Yes");
else
System.out.println("No");
	}
}