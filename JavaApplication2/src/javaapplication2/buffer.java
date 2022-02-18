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
import java.io.*;
public class buffer {
    public static void main(String args[])throws IOException{
        BufferedReader aj=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the |st no...");
        int a =Integer.parseInt(aj.readLine());
        System.out.println("enter the ||nd  no...");
        int b =Integer.parseInt(aj.readLine());
        System.out.println("Mixture of both are "+(a+b));
    }
}
