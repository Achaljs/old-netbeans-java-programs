/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujal
 */
import java.util.*;
public class wordswap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string...");
        String s=sc.nextLine();
        String m="",n="";
        int p=0;String temp="";
        int d=2;
        int i;
        for(i=0;i<s.length();i++){
            
        char ch=s.charAt(i);
        
            
        
        if(ch!=' '){
            m=m+ch;
        }
        else{
           n=m;
           m="";
           for(int j=i;j<s.length();j++){
             char ch2=s.charAt(i);
             
             if(ch2!=' '){
                 m=m+ch2;
                 
             }
             else{
                 i=j;
                 break;
             }
            
             
                 
           }
           
          
            p++;
          System.out.print(m+" " +n+" ")  ;       
            
        m="";
        }
        }
        System.out.println("no. of words "+p);
        }
    }
    

