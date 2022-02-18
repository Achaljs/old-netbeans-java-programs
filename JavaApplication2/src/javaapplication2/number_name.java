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
public class number_name {
    public static void main(String sr[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.......!!!!");
        String  no=sc.next();
        int c=1;
        for (int i=0;i<no.length();i++){
            c+=1;
        }
        for (int j=0;j<no.length();j++){
            char ch=no.charAt(j);
            c--;
            switch(ch){
                case '0':
                    System.out.print("");
                    break;
                    
                case '1': 
                    if(c==8){
                        System.out.print("one crore ");
                    }
                    else if(c==7){
                        System.out.print("ten  ");
                    }
                     else if(c==6){
                        System.out.print("one lakh ");
                    }
                     else if(c==5){
                        System.out.print("ten ");
                    }
                     else if(c==4){
                        System.out.print("one thousand ");
                    }
                     else if(c==3){
                        System.out.print("one hundred ");
                    }
                     else if(c==2){
                        System.out.print("ten ");
                    }
                     else if(c==1){
                        System.out.print("one ");
                    }
                        break;
                        
                 
                        case '2': 
                    if(c==8){
                        System.out.print("two crore ");
                    }
                    else if(c==7){
                        System.out.print("twenty ");
                    }
                     else if(c==6){
                        System.out.print("two lakh ");
                    }
                     else if(c==5){
                        System.out.print("twenty ");
                    }
                     else if(c==4){
                        System.out.print("two thousand ");
                    }
                     else if(c==3){
                        System.out.print("two hundred ");
                    }
                     else if(c==2){
                        System.out.print("twenty ");
                    }
                     else if(c==1){
                        System.out.print("two ");
                    }
                        break;
                        case '3': 
                            String a="three ",b="thirty ";
                    if(c==8){
                        System.out.print(a+" crore ");
                    }
                    else if(c==7){
                        System.out.print(b+" ");
                    }
                     else if(c==6){
                        System.out.print(a+" lakh ");
                    }
                     else if(c==5){
                        System.out.print(b+" ");
                    }
                     else if(c==4){
                        System.out.print(a+" thousand ");
                    }
                     else if(c==3){
                        System.out.print(a+" hundred ");
                    }
                     else if(c==2){
                        System.out.print(b);
                    }
                     else if(c==1){
                        System.out.print(a);
                    }
                        break;
                        case '4': 
                    
                         String a2="four ",b2="forty ";
                    if(c==8){
                        System.out.print(a2+" crore ");
                    }
                    else if(c==7){
                        System.out.print(b2+" ");
                    }
                     else if(c==6){
                        System.out.print(a2+" lakh ");
                    }
                     else if(c==5){
                        System.out.print(b2+" ");
                    }
                     else if(c==4){
                        System.out.print(a2+" thousand ");
                    }
                     else if(c==3){
                        System.out.print(a2+" hundred ");
                    }
                     else if(c==2){
                        System.out.print(b2);
                    }
                     else if(c==1){
                        System.out.print(a2);
                    }
                        break;
                        case '5': 
                   
                         String a3="five ",b3="fifty ";
                    if(c==8){
                        System.out.print(a3+" crore ");
                    }
                    else if(c==7){
                        System.out.print(b3+" ");
                    }
                     else if(c==6){
                        System.out.print(a3+" lakh ");
                    }
                     else if(c==5){
                        System.out.print(b3+" ");
                    }
                     else if(c==4){
                        System.out.print(a3+" thousand ");
                    }
                     else if(c==3){
                        System.out.print(a3+" hundred ");
                    }
                     else if(c==2){
                        System.out.print(b3);
                    }
                     else if(c==1){
                        System.out.print(a3);
                    }
                        break;
                         case '6': 
                            String a4="six ",b4="sixty ";
                    if(c==8){
                        System.out.print(a4+" crore ");
                    }
                    else if(c==7){
                        System.out.print(b4+" ");
                    }
                     else if(c==6){
                        System.out.print(a4+" lakh ");
                    }
                     else if(c==5){
                        System.out.print(b4+" ");
                    }
                     else if(c==4){
                        System.out.print(a4+" thousand ");
                    }
                     else if(c==3){
                        System.out.print(a4+" hundred ");
                    }
                     else if(c==2){
                        System.out.print(b4);
                    }
                     else if(c==1){
                        System.out.print(a4);
                    }
                        break;
                        
                         case '7': 
                            String a5="seven ",b5="seventy ";
                    if(c==8){
                        System.out.print(a5+" crore ");
                    }
                    else if(c==7){
                        System.out.print(b5+" ");
                    }
                     else if(c==6){
                        System.out.print(a5+" lakh ");
                    }
                     else if(c==5){
                        System.out.print(b5+" ");
                    }
                     else if(c==4){
                        System.out.print(a5+" thousand ");
                    }
                     else if(c==3){
                        System.out.print(a5+" hundred ");
                    }
                     else if(c==2){
                        System.out.print(b5);
                    }
                     else if(c==1){
                        System.out.print(a5);
                    }
                        break;
                         case '8': 
                            String a6="eight ",b6="eightty ";
                    if(c==8){
                        System.out.print(a6+" crore ");
                    }
                    else if(c==7){
                        System.out.print(b6+" ");
                    }
                     else if(c==6){
                        System.out.print(a6+" lakh ");
                    }
                     else if(c==5){
                        System.out.print(b6+" ");
                    }
                     else if(c==4){
                        System.out.print(a6+" thousand ");
                    }
                     else if(c==3){
                        System.out.print(a6+" hundred ");
                    }
                     else if(c==2){
                        System.out.print(b6);
                    }
                     else if(c==1){
                        System.out.print(a6);
                    }
                        break;
                         case '9': 
                            String a7="nine ",b7="ninty";
                    if(c==8){
                        System.out.print(a7+" crore ");
                    }
                    else if(c==7){
                        System.out.print(b7+" ");
                    }
                     else if(c==6){
                        System.out.print(a7+"lakh ");
                    }
                     else if(c==5){
                        System.out.print(b7+" ");
                    }
                     else if(c==4){
                        System.out.print(a7+" thousand ");
                    }
                     else if(c==3){
                        System.out.print(a7+" hundred ");
                    }
                     else if(c==2){
                        System.out.print(b7);
                    }
                     else if(c==1){
                        System.out.print(a7);
                    }
                        break;
                         default:
                             System.out.println(">>>>......Only,,,numbers are alloweded....<<<<");
                            
            }
        }
        System.out.println(" .");
    }
}


