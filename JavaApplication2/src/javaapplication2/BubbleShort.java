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
import java.util.*;
public class BubbleShort {
     public static void main(String args[]){
       Scanner sc=new Scanner(System.in) ;
        System.out.println("Enter the limit......");
        int l=sc.nextInt();
        int i,j;
        int swap;
        System.out.println("Enter the elements in descending order......");
        int a[]=new int [l];
        for( i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
     for(i=0;i<(l-1);i++){
         for(j=0;j<(l-i-1);j++){
             if(a[j]>a[j+1]){
                 swap=a[j];
                 a[j]=a[j+1];
                 a[j+1]=swap;
             }
         }
     }
     System.out.println("Sorted array elements are:-");
       for(i=0;i<l;i++){
         System.out.println(a[i]);  
       }
}
}
