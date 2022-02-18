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
public class LCM {
    public static void main(String args[]){
         Scanner aj =new Scanner(System.in);
        System.out.println("Let's,Find the LCM ,Bro!!!!!");
        System.out.println("Enter the First no.");
        int no=aj.nextInt();
        
        System.out.println("Enter the Second no.");
        int no2=aj.nextInt();
         int sum=0,sum2=0;
         int bhak = 0,bhak2 = 0;
        for(int i=1;i<=no;i++){
            if(no%i==0){
                sum=i;
            for(int i2=1;i2<=no;i2++){
            if(no2%i2==0){
                sum2=i2;
                if(sum==sum2){
                    bhak=sum;
                    bhak=sum2;
                }
                else{
                    bhak2=sum*sum2;
                }
                
            }
    }
    }
            
}
        int result=bhak2*bhak;
        System.out.println("The LCM of the numbers is= "+result);
    }
}
