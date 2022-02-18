
package javaapplication2;
import java .util.*;
class Armstrong{  
  public static void main(String[] args)  
  {  
    int r,q,sum=0,no; 
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter the to cheak armstrong");
    int n=sc.nextInt();
    no=n;  
    while(n<=0)
    {
        System.out.println("Wrong input plzz enter again=");
                n=sc.nextInt();
                
    }
    while(n>0)  
    {  
    r=n%10;  
    q=n/10;  
    sum=sum+(r*r*r);  
    n=q;
    }  
    if(no==sum)  
    System.out.println("armstrong number");   
    else  
        System.out.println("Not a armstrong number");   
   }  
}  