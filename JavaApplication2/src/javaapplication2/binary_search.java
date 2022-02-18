
package javaapplication2;

import java.util.Scanner;

public class binary_search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int low=0,high;
        System.out.println("Enter the limit......");
        int l=sc.nextInt();
        int i=0;
        System.out.println("Enter the elements of array");
        int a[]=new int [l];
        
        for( i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The numbers entered in array are :- ");
        for( i=0;i<l;i++){
            System.out.println(a[i]);
            
        }
        System.out.println("Enter the element you want to search....");
        int srch=sc.nextInt();
        high=l-1;
         int mid=(low+high)/2;
        while(low<=high){
            
            if(a[mid]==srch){
                System.out.println(srch + "found at the position no " + (mid+1));
                break;
            }
            else if(a[mid]<srch){
                low=(mid+1);
            }
            else{
                high=(mid-1);
            }
           mid=(low+high)/2; 
        }
        if(low>high){
            System.out.println("Sorry,,, " + srch + "not found at any position....");
        }
    }
}
