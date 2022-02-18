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
import java .util.Scanner;
public class pronic_no {
    public static void main(String args[])
    {
        Scanner aj =new Scanner(System.in);
        System.out.println("Enter the number to cheak that the no. is pronic or not!!!!");
        int num=aj.nextInt();
        int sum = 0;
        boolean cheak=true;
       
       while(num<=0){
            System.out.println("Please!!!,Enter the number greator than zero");
            num=aj.nextInt();
            
        }
        int tem=num;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum=i;
                
            if (sum*(sum+1)==tem){
                    cheak=true;
                    break;
                }
                else {
                    cheak=false;
                }
            }
        }
        if(cheak==true){
            System.out.println("Pronic no.");
        }
        else{
            System.out.println("Not a pronic no.");
        }   
    }
    
}
