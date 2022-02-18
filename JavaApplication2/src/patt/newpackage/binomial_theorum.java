/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patt.newpackage;

/**
 *
 * @author sujal
 */
import java.util.*;
public class binomial_theorum {
    public int fac(int a){
        int fact=1;
        for(int i=1;i<a;i++){
            fact=fact*i;
        }
        return fact;
    
    }
    public static void main(String arg[]){
        binomial_theorum a=new binomial_theorum();
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of X in (X+Y)^n");
    double x=sc.nextDouble();
  
    System.out.println("Enter the value of Y in (X+Y)^n");
    double y=sc.nextDouble();
    
  
    System.out.println("Enter the value of n in (X+Y)^n");
    int n=sc.nextInt();
   
    double sum2=0;
   System.out.print(" = ");
    for(int r=0;r<=n;r++){
        
       double sum=((a.fac(n)/(a.fac(n-r)*a.fac(r)))* Math.pow(x,(n-r))* Math.pow(y,r) );
       
       if(n==r){
       System.out.print(sum);
       }
       else{
           System.out.print(sum+" + "); 
       }
       sum2=sum2+sum;
       
    }
    System.out.println("every time uu think o mine i will be from your side");
    System.out.println(sum2);
    }
    }
