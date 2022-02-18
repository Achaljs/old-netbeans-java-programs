/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujal
 */
import java.util.*;
public class linearshearch {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
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
        System.out.println("Which element want you search.....????????????");
        int sh=sc.nextInt();
        for( i=0;i<l;i++){
            if(a[i]==sh){
                System.out.println("Entered element present at loaction " +(i+1));
                break;
            }
         
        }
        if(i==l){
          System.out.println("element not found....");
        }
        }
        
    }

