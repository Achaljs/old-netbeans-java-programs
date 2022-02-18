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
public class random {
     public static void main(String args[])
    {
         Scanner aj =new Scanner(System.in);
        System.out.println("Enter the lower limit !!!!");
        int low=aj.nextInt();
        System.out.println("Enter the upper limit !!!!");
        int upper=aj.nextInt();
        System.out.println("The random no. Which is generated is= "+(int)(Math.random()*((upper-low)+1)));
       
}
}
