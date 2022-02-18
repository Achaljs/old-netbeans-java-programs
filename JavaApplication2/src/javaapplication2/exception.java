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
public class exception {
public static void main(String args[]){
    int a=20,b=0;
    try{
    System.out.println(a/b);
    }
    catch(Exception e){
        System.out.println("Exception : - Divide by zero is not allowed...");
    }
}    
}
