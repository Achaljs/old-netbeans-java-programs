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
import java.util.Scanner;
import java.lang.*;


public class unique_no {
  public static void main(String args[]){
      Scanner sc=new Scanner (System.in);
      System.out.println("Enter the no. to check that the number is unique or not");
      int pb=5;
      boolean k=true;
      
      while(pb>0){
          String  s=sc.next();
      String n=s;
      boolean c=true;
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          for(int b=0;b<i;b++){
              char ch1=s.charAt(b);
              if(ch1==ch){
                  c=false;
                  break;
              }
          }
              for(int bc=i+1;bc<s.length();bc++){
              char ch2=s.charAt(bc);
              if(ch2==ch){
                  c=false;
                  break;
              }
              
          }
          
      }
      
      
    if(c==true){
      System.out.println("Yes..."+"\n"+"you are right!!!....Fabulous!!!!");
      pb=0;
    }
      else{
             System.out.println ("Oops!!!!,,,"+"\n"+"You are wrong!!!"+"\n"+"Want to try again??????");
             String ans=sc.next();
             if(ans.equalsIgnoreCase("yes")){
                 pb++;
                 System.out.println("Enter the no. again!!!!");
                 
             }
             else{
                 
                pb=0;
                System.exit(0);
                
             }
              }
    
    
  }
  }
  
  }  




