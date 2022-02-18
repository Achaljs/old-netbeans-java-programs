/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author sujal
 */
import java .util.*;
public class karpaker {
    public static void main(String args[]){ 
            
            
            
            
         Scanner aj =new Scanner(System.in);
        System.out.println("Enter the number to cheak that the no. is karprekar or not!!!!");
        int num=aj.nextInt();
        int sum = 0;
        int no=num*num;
        while(no!=0){
            int r=no%10;
            int q=no/10;
            sum=sum+r;
            no=q;
        }
        if(sum==num){
             System.out.println("It is a karprekar no.");
        }
        else{
            System.out.println("It is not a karprekar no.");
        }
        
    }
    
}
