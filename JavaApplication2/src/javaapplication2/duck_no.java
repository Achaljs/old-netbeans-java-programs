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
import java.util.*;
public class duck_no {
    public static void main(String args[])
            {
               
               Scanner sc =new Scanner(System.in);
               System.out.println("Enter the number to cheak that the no. is duck or not!!!!");
               int num=sc.nextInt();
               boolean flage = true;
               while(num!=0){
               int r=num%10;
               int q=num/10;
               if (r==0){
                   flage=true;
               }
               
               num=q;
               }
               
              if(flage==true){
                  System.out.println("Duck no.");
              }
              else{
                  System.out.println("Not a Duck no.");
              }
            }
}





