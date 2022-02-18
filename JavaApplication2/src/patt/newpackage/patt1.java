/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patt.newpackage;

import java.util.Scanner;

/**
 *
 * @author sujal
 */
public class patt1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your  name........");
        String str=sc.nextLine();
       
        int l=str.length();
        for(int i=0;i<l;i++){
            for(int j=l-1;j>=0;j--){
                if (i==j){
                System.out.print(" "+str.charAt(i)+" ");
                }
                else{
                   System.out.print("   ");
                }
                
            }
             for(int j=0;j<l;j++){
                if (i==j){
                System.out.print(" "+str.charAt(j)+" ");
                }
                else{
                   System.out.print("   ");
                }
            }
            
        System.out.println();
        }
        for(int p=0;p<l;p++){
            if(p<l-1){
                System.out.print("   ");
            }
            else if(p>=l-1){
                
        System.out.println(str);
        }
            }
            
        
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if (i==j){
                System.out.print(" "+str.charAt(i)+" ");
                }
                else{
                   System.out.print("   ");
                }
            }
            for(int j=l-1;j>=0;j--){
                if (i==j){
                System.out.print(" "+str.charAt(j)+" ");
                }
                else{
                   System.out.print("   ");
                }
            }
        System.out.println();
        }
    }
}
