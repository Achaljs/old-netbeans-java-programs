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
public class MSDhoni {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your full name........");
        String str=sc.nextLine();
        String m="",n="";
        for (int i=0;i<str.length();i++){
        char ch=str.charAt(i);
                if(ch==' '){
                    m=m+n.charAt(0)+".";
                    n="";
                }
                else{
                    n=n+ch;
                }
        }
        System.out.println("Hello......,Mrs. "+m+n);
    }
    
}
