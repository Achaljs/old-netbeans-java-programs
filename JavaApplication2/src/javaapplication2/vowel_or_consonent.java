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
public class vowel_or_consonent {
    public static void main(String args[]){
         Scanner aj = new Scanner(System.in);
        System.out.println("Enter the number to cheak that the alphabet is vowel or consonent!!!!");
       char alp=aj.next().charAt(0);
        
        
        
           if (alp == 'a'||alp=='A'){
                System.out.println("The entered alphabet is a vowel ");
                }
          
           else if (alp == 'e'||alp=='E'){
                System.out.println("The entered alphabet is a vowel ");
                }
           else if (alp == 'i'||alp=='I'){
                System.out.println("The entered alphabet is a vowel ");
                }
           else if (alp == 'o'||alp=='O'){
                System.out.println("The entered alphabet is a vowel ");
                }
           else if (alp == 'u'||alp=='U'){
                System.out.println("The entered alphabet is a vowel ");
                }
           else{
                System.out.println("The entered alphabet is a consonent ");
                }
           
    }
    
}
