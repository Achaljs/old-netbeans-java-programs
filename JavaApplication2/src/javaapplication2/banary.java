/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
public class banary {
    public static void main(String args[]){
      Scanner aj =new Scanner(System.in);
        System.out.println("Enter the no. to convert it into bainary!!!!");
        int num=aj.nextInt();
        int counter=0;
        int k=0;
        int binary_value[]=new int[100];
        while(num>0){
            binary_value[counter++]=num%2;
            num=num/2;
            
           
        }
        System.out.print("Binary value of entered number = ");
        for(int i=(counter-1);i>=0;i--){
            if(binary_value[i]==1){
                k++;
            }
         System.out.print(binary_value[i]+"  ");
         
    }
        System.out.println();
        System.out.println("no. of 1's = "+k);
        if(k%2==0){
            System.out.println("Yes, the given no. is evil.");
        }
        }
        }
        
