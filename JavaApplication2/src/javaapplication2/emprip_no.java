/*
 let's doo it......
 */
package javaapplication2;

import java.util.Scanner;



public class emprip_no {
   public static void main(String args[]) {
       
        Scanner aj =new Scanner(System.in);
        System.out.println("Enter the number to cheak that the number is emprimp or not !!!!");
        int no=aj.nextInt();
      int  tem=no;
      int sum=0;
      prime_function obj=new prime_function ();
        boolean che=obj.prime(no);
   while(tem!=0){
       int r =tem%10;
       sum=sum*10+r;
       tem=tem/10;
   }
   boolean che2=obj.prime(sum);
   if(che==true&&che2==true){
       System.out.println("yes");
   }
   else{
   System.out.println("no");
   
   }
}
}