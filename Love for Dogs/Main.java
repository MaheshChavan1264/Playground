// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.*;
//Main class to control all other classes
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner sc = new Scanner(System.in);
    
    String name = sc.next();
    Double wt = sc.nextDouble();
    int age  = sc.nextInt();
    String color = sc.next();
    String breed = sc.next();
    char[] chars = name.toCharArray();
    int count=0;
    for (char c : chars) {
        if(!Character.isLetter(c)) {
            count++;
        }
    }
    if(count==0 && wt>0 && age>0){
      System.out.println("Name of the dog: "+name);
      System.out.println("Weight of the dog: "+wt);
      System.out.println("Age of the dog: "+age);
      System.out.println("Color of the dog: "+color);
      System.out.println("Breed of the dog: "+breed);
  }else{
      System.out.println("Invalid Input");
    }
}
}