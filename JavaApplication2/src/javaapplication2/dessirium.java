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
import java.util.Scanner;
public class dessirium {
    public static void main(String args[]){
        Scanner aj =new Scanner(System.in);
        System.out.println("Enter the number to cheak that the no. is dessirium or not!!!!");
        int num=aj.nextInt();
        int c=0; int sum=0,temp=num,sum2=0,right=temp;
        while(num!=0){
        int r1=num%10;
        c++;
        
        while(temp!=0){
        sum=sum*10+r1;
        temp=temp/10;
        }
        int r2=sum%10;
        sum2=sum2+(int)Math.pow(r2, c);
        num=num/10;
        
    }
        if(right==sum2){
            System.out.println("Yes,it is a desserium no.");
        }
        else{
            System.out.println("no,it is not a desserium no.");
        }
    }
}
