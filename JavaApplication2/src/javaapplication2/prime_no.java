
package javaapplication2;
import java.util.*;
public class prime_no {
    public static void main(String args []){
        Scanner s=new Scanner (System.in);
        System.out.println("Please enter the no. to cheak the no. is prime or not");
        int a=s.nextInt();
        String y=a%a==0||a%1==0?"Prime":"Not Prime";
            
        System.out.println(y);
    }
}
