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
public class smith_mam {
    public static void main(String args[])
    {
         Scanner aj =new Scanner(System.in);
        System.out.println("Enter the number bro!!! to cheak that the no. is Smith or not!!!!");
        int no=aj.nextInt();
        int temp=no;
        int sum = 0,sum2=0;
        
        while(no!=0){
            int r=no%10;
            int q=no/10;
            sum=sum+r;
            no=q;
        }
        for (int i=2;i<=temp;i++){
            if (temp%i==0){
                sum2=sum2+i;
            }
                
        }
        if(sum==sum2){
            System.out.println("The enterd no.. is smith no.");
        }
       else{
            System.out.println("The enterd no.. is not asmith no.");
        }
        
    }
}
