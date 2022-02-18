
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
public class selection_short {
     public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit......");
        int l=sc.nextInt();
        int i=0;
        System.out.println("Enter the elements of array.....");
        int a[]=new int [l];
        
        for( i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(" Entered element in array are :- ");
        for( i=0;i<l;i++){
            System.out.println(a[i]);
            
        }
        for( i=0;i<l;i++){
            
            int index=i;
           
            for(int j=i+1;j<l;j++){
               if(a[index]>a[j]){
                   
                   index=j;
               } 
            }
            int temp=a[i];
            a[i]=a[index];
            a[index]=temp;
        }
        System.out.println(" After shorting :- ");
        for( i=0;i<l;i++){
            System.out.println(a[i]);
            
        }
     }
}
