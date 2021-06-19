// import the respective packages
// declare the class/classes mentioned in the above statements by using default access modifiers
//Ex. If ProGrad is the class name, then declare it as class ProGrad{ } without any access modifier
import java.util.*;
//Main class to control all other classes
public class Main{
  public static void main(String[] args){
    //Try out your code here!...
    Scanner sc = new Scanner(System.in);
    
    String brand = sc.nextLine();
    String p = sc.nextLine();
    String os  = sc.nextLine();
    int range = sc.nextInt();
    int ram = sc.nextInt();

    if(ram>0 && range>0){
      System.out.println("Laptop Details");
      System.out.println("Laptop Brand: "+brand);
      System.out.println("Processor Name: "+p);
      System.out.println("OS: "+os);
      System.out.println("Processor Range: "+range+" bit");
      System.out.println("Ram: "+ram+" GB");
  }else{
      System.out.println("Invalid Input");
    }

  }
}