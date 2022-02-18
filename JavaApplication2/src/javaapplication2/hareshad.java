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
public class hareshad {
     public static void main(String args[]){
         Scanner aj =new Scanner(System.in);
        System.out.println("Enter the number to cheak that the no. is harshad or not!!!!");
        int no=aj.nextInt();
        int sum = 0;
        while(no<=9){
            System.out.println("Please!!!,Enter the number greator than zero");
            no=aj.nextInt();
            
        }
        int temp=no;
        while(no!=0){
            int r=no%10;
            int q=no/10;
            sum=sum+r;
            no=q;
        }
        if(sum/temp==0){
             System.out.println("It is a harshad no.");
        }
        else{
            System.out.println("It is not a harshad no.");
        }
    }
}
