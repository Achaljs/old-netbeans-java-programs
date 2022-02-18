/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author sujal
 */

public class incrising_no  {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean flag=true;
       System.out.println("Enter the number to check the no. in increasing or not.....");
       int no=sc.nextInt();
       int n=no;
       while(no!=0){
           int r=no%10;
           while(n!=0){
              int q=n/10;
               int r2=q%10;
               if(r2>r){
                   flag=false;
                   break;
               }
               else{
                   flag=true;
               }
               n=q;
           }
           no=no/10;
       }
       String ch=flag==true?"yes":"no";
        System.out.println(ch);
    }
    
}
