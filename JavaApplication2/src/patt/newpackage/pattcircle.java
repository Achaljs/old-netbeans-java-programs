/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patt.newpackage;

/**
 *
 * @author sujal
 */import java.util.*;
public class pattcircle {
    public static void main(String args[]){
        
          
    Scanner sc=new Scanner(System.in);
    
 System.out.println("Enter your name....");
 String str=sc.nextLine();
 int a=str.length();
 for(int p=0;p<str.length();p++){
     char ch=str.charAt(p);
 
         int l=(a*2)-1;int f=0;
         while(f<a){
             
         for(int i=0;i<=l;i++){
             
             if(i==f||i==l){
                
             
             System.out.print(ch);
             }
             else{
                 System.out.print("  ");
             }
         } 
         System.out.println();
         f++;
         l--;
    } 
         int m=a;int g=a-1;
         while(g>=0){
             
         for(int i=0;i<=m;i++){
             
             if(i==g||i==m){
                
             
             System.out.print(ch);
             }
             else{
                 System.out.print("  ");
             }
         }
         System.out.println();
         g--;
         m++;
    } 
         
    }
}
  
}
