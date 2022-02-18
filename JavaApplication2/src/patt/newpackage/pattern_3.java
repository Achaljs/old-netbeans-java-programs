
package patt.newpackage;
import java.util.*;
public class pattern_3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the limit.......");
        int limit=sc.nextInt();
        char ch='A';
        int count=(limit-1);
        for(int i=1;i<=limit;i++){
            for(int k=1;k<=count;k++){
                System.out.print( "        " );
                count --;
            }
                for(int k=1;k<=(2*i-1);k++){
                    System.out.print(ch);
                }
                ch++;
                System.out.println();
            
        }
    }
}
