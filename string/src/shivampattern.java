
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sujal
 */
public class shivampattern {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your  name........");
        String str=sc.nextLine();
        String m="";
        
        for (int i=0;i<str.length();i++){
        for(int j=0;j<=i;j++)  {
            System.out.print(str.charAt(j));
        }  
        System.out.println();
}
         for (int c=str.length()-1;c<0;c--){
        for(int p=0;p<=c;p++)  {
            System.out.print(str.charAt(p));
        }  
        System.out.println();
}
    }
}
