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
public class cumputaion extends function_factorial
    {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in) ;
       System.out.println("Enter the no.");
       int num=sc.nextInt();
       System.out.println("Enter the value of R.");
       int r=sc.nextInt();
       int b=num-r;
       function_factorial aj=new function_factorial();
        int result=aj.function(num) /(aj.function(r)*aj.function(b));
       System.out.println("The computation is= "+result);
       
    }
}
