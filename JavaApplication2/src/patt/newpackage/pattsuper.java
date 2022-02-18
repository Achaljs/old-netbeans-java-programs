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
public class pattsuper {
     public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your  name........");
        String str=sc.nextLine();
       
        int l=str.length();
        
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                
                System.out.print(" "+str.charAt(i)+" ");
            }
           
            
        System.out.println();
        }
       
}
}
