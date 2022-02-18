
import java.util.Scanner;
public class constructor {
    public constructor(){
        Scanner sc=new Scanner(System.in);
      System.out.println("Enter your age.............");
      int age=sc.nextInt();
      if(age<18){
          System.out.println("You are not eligible for voting........");
      }
      else{
          System.out.println("You are eligible for voting");
      }
    }
    public static void main(String args[]){
        constructor c=new constructor();
    }
}
