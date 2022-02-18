package javaapplication2;
import java.util.*;
public class Reverse_funstructor {
    int no;
    Scanner sc=new Scanner(System.in);
  Reverse_funstructor(){

      System.out.println("Enter the number.");
       no=sc.nextInt();
        
        
      while(no<=9||no==0){
          
      }
      }
 void  logic(){
     if(no<=9 || no==0){

         System.out.println("Please,enter the number greater than 9 and number should be positive!!!!");
          System.out.println("Enter the number again.");
       no=sc.nextInt();
      }
     
         else{   

     int sum=0;
             while(no>0){
         int r=no%10;
         int q=no/10;
         sum=sum*10+r;
         no=q;
        
     }
             System.out.println("Reverse of the number is="+sum);
                 }
 }
  
 public static void main(String args[]){
  Reverse_funstructor aj=new Reverse_funstructor();
    aj.logic();

 }
}


