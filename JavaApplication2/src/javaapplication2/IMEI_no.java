/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujal
 */
public class IMEI_no {
   int dig_sum(int num){
       int r,sum=0;
       while(num>0){
           r=num%10;
           sum=sum+r;
           num=num/10;
       }
        return sum;
   }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        IMEI_no io=new IMEI_no();
        System.out.println("Enter a 15-digit IMEI number.....");
        long imei,dup_imei;
        imei=sc.nextLong();
        dup_imei=imei;
        String imeis=Long.toString(imei);
       if(imeis.length()!=15){
           System.out.println("Sorry , you have not entered 15-digit IMEI  no , we can't processed your request....");
           
       }
       else{
           int d=0,sum1=0;
           for(int i=15;i>=1;i--){
           d=(int)imei%10;
               if(i%2==0){
                   d=2*d; //alternate every second digit from rightmost position//
               }
               sum1=sum1+io.dig_sum(d);
               imei=imei/10;
               
           } 
          
            System.out.println("sum = "  +sum1);
            if(sum1%10==0){
                System.out.println(" OK, Entered imei " + dup_imei + "is a valid IMEI no...");
            }
            else{
                                System.out.println("Sorry , Entered imei " + dup_imei + " is a invalid IMEI no...");

            }
       }
    }
    
}
