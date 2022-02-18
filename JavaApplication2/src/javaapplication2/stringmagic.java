/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author sujal
 */
public class stringmagic {
    public static void main(String args[]){
         Scanner aj =new Scanner(System.in);
        System.out.println("Enter the number .");
        String str=aj.nextLine();
        String numbers ;
        numbers=str.replaceAll("[^ a-z]", "");
         System.out.println(" Numners we are  getting from Given string are :"+numbers);
            
        }
}


