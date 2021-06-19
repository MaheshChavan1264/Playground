import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //fill your code;
      Scanner sc = new Scanner(System.in);
      String a = sc.next();
      char s = a.charAt(0);
      if(s=='a' ||s=='e' ||s=='i' ||s=='o' ||s=='u'){
        System.out.println("Vowel");
      }else if(Character.isLetter(s)){
        System.out.println("Consonant");
      }else{
        System.out.println("Not an alphabet");
      }
    }
}